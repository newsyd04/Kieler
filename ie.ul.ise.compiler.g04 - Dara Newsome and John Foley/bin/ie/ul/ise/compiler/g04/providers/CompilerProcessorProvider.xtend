package ie.ul.ise.compiler.g04.providers
import de.cau.cs.kieler.kicool.registration.IProcessorProvider
    /**
    * Provider to make processors available to KiCool.
    */
class CompilerProcessorProvider implements IProcessorProvider {
    override getProcessors() {
        #[
            ie.ul.ise.compiler.g04.processors.Myelomaload
            
        ]
    }
}