package ie.ul.ise.compiler.g04.providers;

import de.cau.cs.kieler.kicool.compilation.Processor;
import de.cau.cs.kieler.kicool.registration.IProcessorProvider;
import ie.ul.ise.compiler.g04.processors.Myelomaload;
import java.util.Collections;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * Provider to make processors available to KiCool.
 */
@SuppressWarnings("all")
public class CompilerProcessorProvider implements IProcessorProvider {
  @Override
  public Iterable<Class<? extends Processor<?, ?>>> getProcessors() {
    return Collections.<Class<? extends Processor<?, ?>>>unmodifiableList(CollectionLiterals.<Class<? extends Processor<?, ?>>>newArrayList(Myelomaload.class));
  }
}
