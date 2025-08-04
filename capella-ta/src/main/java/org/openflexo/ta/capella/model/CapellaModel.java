package org.openflexo.ta.capella.model;
/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;
import org.openflexo.foundation.FlexoObject;
import org.openflexo.foundation.ontology.FlexoOntologyObjectImpl;
import org.openflexo.foundation.ontology.IFlexoOntology;
import org.openflexo.foundation.ontology.IFlexoOntologyAnnotation;
import org.openflexo.foundation.ontology.IFlexoOntologyClass;
import org.openflexo.foundation.ontology.IFlexoOntologyConcept;
import org.openflexo.foundation.ontology.IFlexoOntologyContainer;
import org.openflexo.foundation.ontology.IFlexoOntologyDataProperty;
import org.openflexo.foundation.ontology.IFlexoOntologyDataType;
import org.openflexo.foundation.ontology.IFlexoOntologyIndividual;
import org.openflexo.foundation.ontology.IFlexoOntologyObjectProperty;
import org.openflexo.foundation.ontology.IFlexoOntologyStructuralProperty;
import org.openflexo.foundation.resource.FlexoResource;
import org.openflexo.foundation.technologyadapter.FlexoModel;
import org.openflexo.foundation.utils.FlexoObjectReference;
import org.openflexo.ta.capella.CapellaTechnologyAdapter;
/*
public class CapellaModel extends FlexoOntologyObjectImpl<CapellaTechnologyAdapter>
	implements FlexoModel<CapellaModel, CapellaMetaModel>, IFlexoOntology<CapellaTechnologyAdapter>{
	
	private EMFModel emfModel;
	//TODO: hériter de EMFModel
	/** Resource. */
	//protected CapellaModelResource modelResource;
	/** MetaModel. */
	//protected final CapellaMetaModel metaModel;
	/** Converter. */
	//protected final CapellaModelConverter converter;
	/** Resource EMF. */
	/*protected final Resource resource;
	
	public CapellaModel(EMFModel model, CapellaModelResource modelres, CapellaMetaModel meta, Resource res) {
		this.emfModel = model ;
		this.modelResource = modelres ;
		this.metaModel = meta ;
		this.resource = res ;
	}
	
	public EMFModel getEMFModel() {
		return this.emfModel;
	}
	
	@Override
	public FlexoResource<CapellaModel> getResource() {
		return this.modelResource;
	}

	@Override
	public void setResource(FlexoResource<CapellaModel> resource) {
		this.modelResource = (CapellaModelResource) resource ;
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean isModified() {
		return this.emfModel.isModified();
	}

	@Override
	public void setIsModified() {
		this.emfModel.setIsModified();
	}

	@Override
	public void clearIsModified() {
		this.emfModel.clearIsModified();
	}

	@Override
	public void clearIsModified(boolean clearLastMemoryUpdate) {
		this.emfModel.clearIsModified(clearLastMemoryUpdate);
	}

	@Override
	public boolean delete(Object... context) {
		return this.emfModel.delete(context);
	}

	@Override
	public String getName() {
		return this.emfModel.getName();
	}

	@Override
	public void setName(String name) throws Exception {
		this.emfModel.setName(name);
	}

	@Override
	public String getDescription() {
		return this.emfModel.getDescription();
	}

	@Override
	public String getDisplayableDescription() {
		return this.emfModel.getDisplayableDescription();
	}

	@Override
	public CapellaTechnologyAdapter getTechnologyAdapter() {
		return this.metaModel.getTechnologyAdapter();
	}

	@Override
	public String getUserIdentifier() {
		return this.emfModel.getUserIdentifier();
	}

	@Override
	public void setUserIdentifier(String userIdentifier) {
		this.emfModel.setUserIdentifier(userIdentifier);
	}

	@Override
	public long getFlexoID() {
		return this.emfModel.getFlexoID();
	}

	@Override
	public long obtainNewFlexoID() {
		return this.emfModel.obtainNewFlexoID();
	}

	@Override
	public void setFlexoID(long flexoID) {
		this.emfModel.setFlexoID(flexoID);
	}

	@Override
	public String hash() {
		return this.emfModel.hash();
	}

	@Override
	public void addToReferencers(FlexoObjectReference<? extends FlexoObject> ref) {
		this.emfModel.addToReferencers(ref);
	}

	@Override
	public void removeFromReferencers(FlexoObjectReference<? extends FlexoObject> ref) {
		this.emfModel.removeFromReferencers(ref);
	}

	@Override
	public List<FlexoObjectReference<?>> getReferencers() {
		return this.emfModel.getReferencers();
	}

	@Override
	public List<? extends IFlexoOntologyContainer<CapellaTechnologyAdapter>> getSubContainers() {
		return Collections.emptyList();
	}

	@Override
	public List<? extends IFlexoOntologyConcept<CapellaTechnologyAdapter>> getConcepts() {
		List<IFlexoOntologyConcept<CapellaTechnologyAdapter>> concepts = new ArrayList<>();
		concepts.addAll(getIndividuals());
		return Collections.unmodifiableList(concepts);
	}

	@Override
	public List<? extends IFlexoOntologyDataType<CapellaTechnologyAdapter>> getDataTypes() {
		return Collections.emptyList();
	}

	@Override
	public IFlexoOntologyConcept<CapellaTechnologyAdapter> getOntologyObject(String objectNameOrURI) {
		IFlexoOntologyConcept<CapellaTechnologyAdapter> result = null;
		for (IFlexoOntologyConcept<CapellaTechnologyAdapter> concept : getConcepts()) {
			if (concept.getURI().equalsIgnoreCase(objectNameOrURI)) {
				result = concept;
			}
		}
		return result;
	}

	@Override
	public IFlexoOntologyClass<CapellaTechnologyAdapter> getClass(String classNameOrURI) {
		return null;
	}

	@Override
	public IFlexoOntologyIndividual<CapellaTechnologyAdapter> getIndividual(String individualURI) {
		return null;
	}

	@Override
	public IFlexoOntologyObjectProperty<CapellaTechnologyAdapter> getObjectProperty(String propertyURI) {
		return null;
	}

	@Override
	public IFlexoOntologyDataProperty<CapellaTechnologyAdapter> getDataProperty(String propertyURI) {
		return null;
	}

	@Override
	public IFlexoOntologyStructuralProperty<CapellaTechnologyAdapter> getProperty(String objectURI) {
		IFlexoOntologyStructuralProperty<CapellaTechnologyAdapter> result = getDataProperty(objectURI);
		if (result == null) {
			result = getObjectProperty(objectURI);
		}
		return result;
	}

	@Override
	public List<? extends IFlexoOntologyClass<CapellaTechnologyAdapter>> getClasses() {
		return Collections.emptyList();
	}

	@Override
	public List<? extends IFlexoOntologyIndividual<CapellaTechnologyAdapter>> getIndividuals() {
		return Collections.emptyList();
	}

	@Override
	public List<? extends IFlexoOntologyDataProperty<CapellaTechnologyAdapter>> getDataProperties() {
		return Collections.emptyList();
	}


	@Override
	public String getVersion() {
		return this.emfModel.getVersion();
	}

	@Override
	public List<? extends IFlexoOntology<CapellaTechnologyAdapter>> getImportedOntologies() {
		return Collections.emptyList();
	}

	@Override
	public List<? extends IFlexoOntologyAnnotation> getAnnotations() {
		return Collections.emptyList();
	}

	@Override
	public List<? extends IFlexoOntologyClass<CapellaTechnologyAdapter>> getAccessibleClasses() {
		return Collections.emptyList();
	}

	@Override
	public List<? extends IFlexoOntologyIndividual<CapellaTechnologyAdapter>> getAccessibleIndividuals() {
		return Collections.emptyList();
	}

	@Override
	public List<? extends IFlexoOntologyObjectProperty<CapellaTechnologyAdapter>> getAccessibleObjectProperties() {
		return Collections.emptyList();
	}

	@Override
	public List<? extends IFlexoOntologyDataProperty<CapellaTechnologyAdapter>> getAccessibleDataProperties() {
		return Collections.emptyList();
	}

	@Override
	public IFlexoOntologyConcept<CapellaTechnologyAdapter> getDeclaredOntologyObject(String objectURI) {
		return null;
	}

	@Override
	public IFlexoOntologyClass<CapellaTechnologyAdapter> getDeclaredClass(String classURI) {
		return null;
	}

	@Override
	public IFlexoOntologyIndividual<CapellaTechnologyAdapter> getDeclaredIndividual(String individualURI) {
		return null;
	}

	@Override
	public IFlexoOntologyObjectProperty<CapellaTechnologyAdapter> getDeclaredObjectProperty(String propertyURI) {
		return null;
	}

	@Override
	public IFlexoOntologyDataProperty<CapellaTechnologyAdapter> getDeclaredDataProperty(String propertyURI) {
		return null;
	}

	@Override
	public IFlexoOntologyStructuralProperty<CapellaTechnologyAdapter> getDeclaredProperty(String objectURI) {
		return getProperty(objectURI);
	}

	@Override
	public IFlexoOntologyClass<CapellaTechnologyAdapter> getRootConcept() {
		return this.metaModel.getRootConcept();
	}

	@Override
	public CapellaMetaModel getMetaModel() {
		return this.metaModel;
	}

	@Override
	public String getURI() {
		return this.emfModel.getURI();
	}

	@Override
	public Object getObject(String objectURI) {
		return this.emfModel.getObject(objectURI);
	}

	@Override
	public IFlexoOntology<CapellaTechnologyAdapter> getFlexoOntology() {
		return null;
	}

	@Override
	public List<? extends IFlexoOntologyObjectProperty<CapellaTechnologyAdapter>> getObjectProperties() {
		return Collections.emptyList();
	}
}*/