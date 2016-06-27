/**
 *
 * $Id$
 */
package ddsm.validation;

import ddsm.Script;

/**
 * A sample validator interface for {@link ddsm.LifeCycle}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LifeCycleValidator {
    boolean validate();

    boolean validateDownloadCommand(Script value);
    boolean validateInstallCommand(Script value);
    boolean validateStartCommand(Script value);
    boolean validateStopCommand(Script value);
    boolean validatePreconfigureCommand(Script value);
    boolean validateCreateCommand(Script value);
}
