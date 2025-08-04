package org.openflexo.ta.capella.rm;
/*
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.openflexo.foundation.resource.FlexoIODelegate;
import org.openflexo.foundation.resource.FlexoResourceCenter;
import org.openflexo.pamela.exceptions.ModelDefinitionException;
import org.openflexo.ta.capella.CapellaTechnologyAdapter;
import org.openflexo.ta.capella.rm.CapellaMetaModelResource;
import org.openflexo.technologyadapter.emf.metamodel.EMFMetaModel;
import org.openflexo.technologyadapter.emf.rm.ECoreMetaModelResource;
import org.openflexo.technologyadapter.emf.rm.EMFMetaModelResourceFactory;
import org.openflexo.technologyadapter.emf.EMFTechnologyAdapter;

public class CapellaMetaModelResourceFactory
        extends EMFMetaModelResourceFactory {

    private static final Logger logger = Logger.getLogger(CapellaMetaModelResourceFactory.class.getPackage().getName());

    public CapellaMetaModelResourceFactory() throws ModelDefinitionException {
        super();
    }

    @Override
    public <I> boolean isValidArtefact(I artefact, FlexoResourceCenter<I> resourceCenter) {
        return super.isValidECoreArtefact(artefact, resourceCenter)
                && isCapellaMetaModel(artefact, resourceCenter);
    }

    private <I> boolean isCapellaMetaModel(I artefact, FlexoResourceCenter<I> resourceCenter) {
        try {
            Properties props = resourceCenter.getProperties(artefact);
            String uri = props.getProperty("uri"); // ou "nsURI" à voir
            return uri != null && uri.startsWith("http://www.polarsys.org/capella/");
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    protected <I> CapellaMetaModelResource initResourceForRetrieving(I serializationArtefact, FlexoResourceCenter<I> resourceCenter)
            throws ModelDefinitionException, IOException {
    	if (isValidECoreArtefact(serializationArtefact, resourceCenter)) {
    		CapellaMetaModelResource resource = newInstance(CapellaMetaModelResource.class);
            resource.setResourceCenter(resourceCenter);
            resource.setIODelegate(makeFlexoIODelegate(serializationArtefact, resourceCenter));
            
            Properties props = resourceCenter.getProperties(serializationArtefact);
            String name = props.getProperty("name");
            String uri = props.getProperty("uri");

            if (name != null) resource.initName(name);
            if (uri != null) resource.setURI(uri);

            return resource;
    	}
    	else {
    		logger.warning("Unexpected artefact: " + serializationArtefact);
    		return null;
    	}
    }

    @Override
    public <I> FlexoIODelegate<I> makeFlexoIODelegate(I artefact, FlexoResourceCenter<I> resourceCenter) {
        return super.makeFlexoIODelegate(artefact, resourceCenter);
    }
}*/
