/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package ie.ul.ise.compiler.g04.syntheses;

import javax.inject.Inject;

import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis;
import ie.ul.ise.compiler.g04.processors.Myeloma;

/**
 * @author newsy
 * @param <override>
 *
 */
public class MyelomaSynthesis<override> extends AbstractDiagramSynthesis<Myeloma> {
    @Inject extension KNodeExtensions;
    @Inject extension KRenderingExtensions;
    @Inject extension KContainerRenderingExtensions;
    override transform(Myeloma model) {
        val rootNode = model.createNode
        rootNode
    }
}
