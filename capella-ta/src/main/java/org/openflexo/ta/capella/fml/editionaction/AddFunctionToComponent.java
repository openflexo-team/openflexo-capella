package org.openflexo.ta.capella.fml.editionaction;
/*
import org.openflexo.connie.DataBinding;
import org.openflexo.foundation.fml.annotations.FML;
import org.openflexo.foundation.fml.editionaction.EditionAction;
import org.openflexo.foundation.fml.rt.RunTimeEvaluationContext;
import org.openflexo.pamela.annotations.ImplementationClass;
import org.openflexo.pamela.annotations.ModelEntity;
import org.openflexo.pamela.annotations.XMLElement;
import org.openflexo.ta.capella.model.CapellaComponent;
import org.openflexo.ta.capella.model.CapellaFunction;
import org.openflexo.ta.capella.CapellaModelSlot;
import org.openflexo.ta.capella.CapellaTechnologyAdapter;

/*@ModelEntity
@ImplementationClass(AddFunctionToComponent.AddFunctionToComponentImpl.class)
@XMLElement
@FML("AddFunctionToComponent")
public interface AddFunctionToComponent extends CapellaAction<CapellaFunction> {

    @PropertyIdentifier(type = DataBinding.class)
    String COMPONENT_KEY = "component";

    @Getter(COMPONENT_KEY)
    DataBinding<CapellaComponent> getComponent();

    @Setter(COMPONENT_KEY)
    void setComponent(DataBinding<CapellaComponent> component);

    @PropertyIdentifier(type = String.class)
    String FUNCTION_NAME_KEY = "functionName";

    @Getter(FUNCTION_NAME_KEY)
    String getFunctionName();

    @Setter(FUNCTION_NAME_KEY)
    void setFunctionName(String name);

    abstract class AddFunctionToComponentImpl extends TechnologySpecificActionImpl<CapellaModelSlot, Object, CapellaFunction, CapellaTechnologyAdapter>
            implements AddFunctionToComponent {

        private DataBinding<CapellaComponent> component;

        @Override
        public CapellaFunction execute(RunTimeEvaluationContext evaluationContext) {
            // TODO: Créer la fonction et l'ajouter au composant cible
            return null;
        }

        @Override
        public DataBinding<CapellaComponent> getComponent() {
            if (component == null) {
                component = new DataBinding<>(this, CapellaComponent.class, DataBinding.BindingDefinitionType.GET);
            }
            return component;
        }

        @Override
        public void setComponent(DataBinding<CapellaComponent> component) {
            this.component = component;
            if (this.component != null) {
                this.component.setOwner(this);
                this.component.setBindingName("component");
            }
        }

        @Override
        public Class<CapellaFunction> getAssignableType() {
            return CapellaFunction.class;
        }
    }
}*/
