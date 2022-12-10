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
package ie.ul.ise.compiler.g04.processors;

import de.cau.cs.kieler.kicool.compilation.CodeContainer;
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor;

/**
 * @author newsy
 *
 */
public class Myelomaload extends ExogenousProcessor<CodeContainer, Myeloma>{

    public String getId() {
        return "ie.ul.ise.compiler.g04.Myeloma.load";
    }

    public String getName() {
        return "Load";
    }


    public void process() {
        CodeContainer codeContainer = getModel();
        String theText = codeContainer.getHead().getCode();
        Myeloma myMyeloma = new Myeloma();
        myMyeloma.words.add(myMyeloma.createWord("Hello"));
        myMyeloma.words.add(myMyeloma.createWord("World!"));
        setModel(myMyeloma);
        
    }

}
