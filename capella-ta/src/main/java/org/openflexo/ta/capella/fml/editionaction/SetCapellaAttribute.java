package org.openflexo.ta.capella.fml.editionaction;
/*
import org.openflexo.connie.DataBinding;
import org.openflexo.foundation.fml.annotations.FML;
import org.openflexo.foundation.fml.editionaction.EditionAction;
import org.openflexo.foundation.fml.rt.RunTimeEvaluationContext;
import org.openflexo.pamela.annotations.ImplementationClass;
import org.openflexo.pamela.annotations.ModelEntity;
import org.openflexo.pamela.annotations.XMLElement;
import org.openflexo.ta.capella.CapellaModelSlot;
import org.openflexo.ta.capella.CapellaTechnologyAdapter;
import org.openflexo.ta.capella.model.CapellaElement;

/*@ModelEntity
@ImplementationClass(SetCapellaAttribute.SetCapellaAttributeImpl.class)
@XMLElement
@FML("SetCapellaAttribute")
public interface SetCapellaAttribute extends CapellaAction<CapellaElement> {

    @PropertyIdentifier(type = DataBinding.class)
    String TARGET_KEY = "target";

    @Getter(TARGET_KEY)
    DataBinding<CapellaElement> getTarget();

    @Setter(TARGET_KEY)
    void setTarget(DataBinding<CapellaElement> target);

    @PropertyIdentifier(type = String.class)
    String VALUE_KEY = "value";

    @Getter(VALUE_KEY)
    String getValue();

    @Setter(VALUE_KEY)
    void setValue(String value);

    abstract class SetCapellaAttributeImpl extends TechnologySpecificActionImpl<CapellaModelSlot, Object, CapellaElement, CapellaTechnologyAdapter>
            implements SetCapellaAttribute {

        private DataBinding<CapellaElement> target;

        @Override
        public CapellaElement execute(RunTimeEvaluationContext evaluationContext) {
            // TODO: Modifier un attribut du CapellaElement cible
            return null;
        }

        @Override
        public DataBinding<CapellaElement> getTarget() {
            if (target == null) {
                target = new DataBinding<>(this, CapellaElement.class, DataBinding.BindingDefinitionType.GET);
            }
            return target;
        }

        @Override
        public void setTarget(DataBinding<CapellaElement> target) {
            this.target = target;
            if (this.target != null) {
                this.target.setOwner(this);
                this.target.setBindingName("target");
            }
        }

        @Override
        public Class<CapellaElement> getAssignableType() {
            return CapellaElement.class;
        }
    }
}*/
