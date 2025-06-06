cloche {
    metadata {
        modId = "maple"
        name = "Maple"
        description = "Simple UI building library"
        license = "LGPL-3.0"

        author("naomieow")
    }

    fabric("fabric:1.20.1") {
        minecraftVersion = "1.20.1"
        loaderVersion = "0.16.10"

        client()

        dependencies {
            fabricApi("0.92.3")
            modImplementation(module(
                group = "net.fabricmc",
                name = "fabric-language-kotlin",
                version = "1.13.1+kotlin.2.1.10"
            ))
        }
    }

    fabric("fabric:1.21") {
        minecraftVersion = "1.21"
        loaderVersion = "0.16.10"

        client()

        dependencies {
            fabricApi("0.102.0")
            modImplementation(module(
                group = "net.fabricmc",
                name = "fabric-language-kotlin",
                version = "1.13.1+kotlin.2.1.10"
            ))
        }
    }

    forge("forge:1.20.1") {
        minecraftVersion = "1.20.1"
        loaderVersion = "47.3.0"

        dependencies {
            implementation(module(
                group = "thedarkcolour",
                name = "kotlinforforge",
                version = "4.11.0"
            ))
        }
    }

    neoforge("neoforge:1.21") {
        minecraftVersion = "1.21"
        loaderVersion = "21.0.167"

        dependencies {
            implementation(module(
                group = "thedarkcolour",
                name = "kotlinforforge-neoforge",
                version = "5.7.0"
            ))
        }
    }
}
