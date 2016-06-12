/**
 *
 * $Id$
 */
package tosca.validation;

import org.eclipse.emf.common.util.EList;

import tosca.Source_interface;
import tosca.Target_interface;

/**
 * A sample validator interface for {@link tosca.Relationship}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RelationshipValidator {
    boolean validate();

    boolean validateType(String value);
    boolean validateValidSource(String value);
    boolean validateValidTarget(String value);
    boolean validateRelation_haSourceInterface(EList<Source_interface> value);
    boolean validateRelation_hasTargetInterface(EList<Target_interface> value);
}
