/**
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

import de.cau.cs.kieler.kicool.ui.synthesis.styles.ColorStore;
import de.cau.cs.kieler.klighd.kgraph.KNode;
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle;
import de.cau.cs.kieler.klighd.krendering.KText;
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis;
import ie.ul.ise.compiler.g04.processors.Myeloma;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * @author newsy
 */
@SuppressWarnings("all")
public class MyelomaSynthesis extends AbstractDiagramSynthesis<Myeloma> {
  @Inject
  @Extension
  private KNodeExtensions _kNodeExtensions;

  @Inject
  @Extension
  private KRenderingExtensions _kRenderingExtensions;

  @Inject
  @Extension
  private KContainerRenderingExtensions _kContainerRenderingExtensions;

  @Override
  public KNode transform(final Myeloma model) {
    KNode _xblockexpression = null;
    {
      final KNode rootNode = this._kNodeExtensions.createNode(model);
      for (final Myeloma.Word word : model.words) {
        EList<KNode> _children = rootNode.getChildren();
        KNode _createNode = this._kNodeExtensions.createNode(word);
        final Procedure1<KNode> _function = (KNode it) -> {
          KRoundedRectangle _addRoundedRectangle = this._kRenderingExtensions.addRoundedRectangle(it, 10, 10);
          final Procedure1<KRoundedRectangle> _function_1 = (KRoundedRectangle it_1) -> {
            this._kRenderingExtensions.setForeground(it_1, ColorStore.getColor(ColorStore.Color.PROCESSOR_FOREGROUND));
            this._kRenderingExtensions.<KRoundedRectangle>setBackgroundGradient(it_1, ColorStore.getColor(ColorStore.Color.PROCESSOR_BACKGROUND), 255, ColorStore.getColor(ColorStore.Color.PROCESSOR_BACKGROUND_TARGET), 243, 90);
            this._kRenderingExtensions.<KText>setSurroundingSpace(this._kContainerRenderingExtensions.addText(it_1, "Test"), 10.0f, 0.0f);
          };
          ObjectExtensions.<KRoundedRectangle>operator_doubleArrow(_addRoundedRectangle, _function_1);
        };
        KNode _doubleArrow = ObjectExtensions.<KNode>operator_doubleArrow(_createNode, _function);
        _children.add(_doubleArrow);
      }
      _xblockexpression = rootNode;
    }
    return _xblockexpression;
  }
}
