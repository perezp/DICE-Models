/**
 *
 * $Id$
 */
package tosca.validation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link tosca.Requirement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RequirementValidator {
    boolean validate();

    boolean validateRequirement_name(String value);
    boolean validateNode(String value);
    boolean validateCapability_Type_name(String value);
    boolean validateOccurances(EList<String> value);
}
