package ie.ul.ise.compiler.g04.providers;

import de.cau.cs.kieler.kicool.registration.ISystemProvider;
import java.util.Collections;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * Provider to make processors available to KiCool.
 */
@SuppressWarnings("all")
public class CompilerSystemProvider implements ISystemProvider {
  @Override
  public String getBundleId() {
    return "ie.ul.ise.compiler.g04";
  }

  @Override
  public Iterable<String> getSystems() {
    return Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("system/ie.ul.ise.compiler.g04.Myeloma.kico"));
  }
}
