/**
 *
 * $Id$
 */
package tosca.validation;

import org.eclipse.emf.common.util.EList;

import tosca.Parameters;

/**
 * A sample validator interface for {@link tosca.Property}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PropertyValidator {
    boolean validate();

    boolean validateProperty_name(String value);
    boolean validateProperty_hasParameters(EList<Parameters> value);
}
