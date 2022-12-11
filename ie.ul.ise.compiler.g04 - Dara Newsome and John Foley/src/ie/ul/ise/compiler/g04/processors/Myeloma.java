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

import java.util.ArrayList;
import java.util.List;

/**
 * @author newsy
 *
 */
public class Myeloma {
    public List<Word> words = new ArrayList<Word>();
    public Word mostPoints = null;
    public Word createWord(String s) {
    return new Word(s);
    }
    public class Word {
    Word(String word) {
    this.word = word;
    this.points = 0;
    }
    public String word;
    public Integer points;
    }
}
