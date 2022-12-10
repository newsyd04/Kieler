package ie.ul.ise.compiler.g04.providers;

import de.cau.cs.kieler.kicool.compilation.Processor;
import de.cau.cs.kieler.kicool.registration.IProcessorProvider;

/**
 * Provider to make processors available to KiCool.
 */
@SuppressWarnings("all")
public class CompilerProcessorProvider implements IProcessorProvider {
  @Override
  public Iterable<Class<? extends Processor<?, ?>>> getProcessors() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field ie is undefined"
      + "\nul cannot be resolved"
      + "\nise cannot be resolved"
      + "\ncompiler cannot be resolved"
      + "\ng04 cannot be resolved"
      + "\nprocessors cannot be resolved"
      + "\nload cannot be resolved");
  }
}
