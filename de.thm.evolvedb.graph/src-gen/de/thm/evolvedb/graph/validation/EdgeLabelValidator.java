/**
 *
 * $Id$
 */
package de.thm.evolvedb.graph.validation;

import de.thm.evolvedb.graph.EdgeType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link de.thm.evolvedb.graph.EdgeLabel}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EdgeLabelValidator {
	boolean validate();

	boolean validateEdges(EList<EdgeType> value);
}
