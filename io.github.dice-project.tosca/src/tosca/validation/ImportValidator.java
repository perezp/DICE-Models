/**
 *
 * $Id$
 */
package tosca.validation;


/**
 * A sample validator interface for {@link tosca.Import}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ImportValidator {
    boolean validate();

    boolean validateImport_name(String value);
    boolean validateFile(String value);
    boolean validateRepository(String value);
    boolean validateNamespace_uri(String value);
    boolean validateNamespace_prefix(String value);
}
