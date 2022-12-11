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
package ie.ul.ise.compiler.g04.syntheses
import static de.cau.cs.kieler.kicool.ui.synthesis.styles.ColorStore.Color.*
import static extension de.cau.cs.kieler.kicool.ui.synthesis.styles.ColorStore.*
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import ie.ul.ise.compiler.g04.processors.Myeloma
import javax.inject.Inject
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions

/**
 * @author newsy
 *
 */
class MyelomaSynthesis extends AbstractDiagramSynthesis<Myeloma>{
    @Inject extension KNodeExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    
    override transform(Myeloma model) {
        val rootNode = model.createNode
        
        for (word : model.words) {
            rootNode.children += word.createNode => [
                addRoundedRectangle(10, 10) => [
                    foreground = PROCESSOR_FOREGROUND.color
                    setBackgroundGradient(PROCESSOR_BACKGROUND.color, 255, PROCESSOR_BACKGROUND_TARGET.color, 243, 90)
                    addText("Test").setSurroundingSpace(10.0f, 0.0f)
                ]
            ]
        }
        
        rootNode
    }
}