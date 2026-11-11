# Known defects — openflexo-capella

## CAPELLA-D-1 — `TestLoadXXDocuments.testXXContents` looks up the resource center of the xx template  ·  `TODO`

**Symptom.** `capella-ta-test`: `TestLoadXXDocuments.testXXContents` fails with a `NullPointerException`
(`resourceCenter` is null in `AbstractXXTest.getXXResource`); the 5 other tests pass.

**Verified (2026-11-11).**
- Fails the same way with and without the CORE-F-8 phase 6 changes of the repository (unrelated to them).
- `AbstractXXTest.getXXResource(String)`, copied from the `xx-ta` template, asks the resource-center service for
  `http://www.openflexo.org/test/xx`; the test resource center of this repository declares
  `http://www.openflexo.org/test/capella` (`capella-ta-test-rc/src/main/resources/META-INF/PrivateRC/Capella/`), so no
  resource center is found.

**Reproduce.** From `openflexo-dev`: `./gradlew :openflexo-capella:capella-ta-test:cleanTest :openflexo-capella:capella-ta-test:test`.

**Way out.** Look up `http://www.openflexo.org/test/capella` in `AbstractXXTest`, then check that the document is found
under that base URI (`<base>/XX/Test1.txt`).
