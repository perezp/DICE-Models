/**
 *
 * $Id$
 */
package tosca.validation;

import org.eclipse.emf.common.util.EList;

import tosca.Attribute;
import tosca.Interface;
import tosca.Property;
import tosca.Relationship;
import tosca.Requirement;
import tosca.instance;

/**
 * A sample validator interface for {@link tosca.Node_template}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface Node_templateValidator {
    boolean validate();

    boolean validateNode_template_name(String value);
    boolean validateType(String value);
    boolean validateNodeTemplate_hasInterface(EList<Interface> value);
    boolean validateDescription(String value);
    boolean validateNodeTemplate_hasProperty(EList<Property> value);
    boolean validateNodeTemplate_hasAttribute(EList<Attribute> value);
    boolean validateNodeTemplate_hasRequirement(EList<Requirement> value);
    boolean validateNodeTemplate_hasRelationship(EList<Relationship> value);
    boolean validateNodeTemplate_hasInstances(instance value);
}
