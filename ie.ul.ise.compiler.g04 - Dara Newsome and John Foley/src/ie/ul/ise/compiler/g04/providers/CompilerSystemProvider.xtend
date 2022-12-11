package ie.ul.ise.compiler.g04.providers
    import de.cau.cs.kieler.kicool.registration.ISystemProvider
    /**
    * Provider to make processors available to KiCool.
    */
    class CompilerSystemProvider implements ISystemProvider {
        override getBundleId() {
            "ie.ul.ise.compiler.g04"
        }
        override getSystems() {
            #[
                "system/ie.ul.ise.compiler.g04.Myeloma.kico"

                
            ]
        }
    }