version = "1.0.0"
group = "xyz.naomieow.maple_testmod"

cloche {
    metadata {
        modId = "maple_testmod"
        name = "Maple Testmod"
        description = "Testmod for Maple UI library"
        license = "MIT"

        author("naomieow")
    }

    fabric("fabric:1.20.1") {
        minecraftVersion = "1.20.1"
        loaderVersion = libs.versions.fabric.loader

        client()

        runs {
            client()
        }

        dependencies {
            fabricApi(libs.versions.fabric.api.v1201)
            modImplementation(libs.fabric.kotlin)
            modImplementation(project(":"))
            modRuntimeOnly(libs.fabric.modmenu.v1201)
        }

        metadata {
            dependencies {
                dependency {
                    modId = "maple"
                    required = true
                    version("1.0.0")
                }
                dependency {
                    modId = "fabric-language-kotlin"
                    required = true
                    version(libs.versions.fabric.kotlin.get())
                }
            }

            entrypoint("main") {
                value = "xyz.naomieow.maple_testmod.MapleTestmodFabric"
                adapter = "kotlin"
            }
            entrypoint("client") {
                value = "xyz.naomieow.maple_testmod.MapleTestmodFabricClient"
                adapter = "kotlin"
            }
        }
    }

    fabric("fabric:1.21") {
        minecraftVersion = "1.21"
        loaderVersion = libs.versions.fabric.loader

        client()

        runs {
            client()
        }

        dependencies {
            fabricApi(libs.versions.fabric.api.v121)
            modImplementation(libs.fabric.kotlin)
            modImplementation(project(":"))
            modRuntimeOnly(libs.fabric.modmenu.v121)
        }

        metadata {
            entrypoint("main") {
                value = "xyz.naomieow.maple_testmod.MapleTestmodFabric"
                adapter = "kotlin"
            }
            entrypoint("client") {
                value = "xyz.naomieow.maple_testmod.MapleTestmodFabricClient"
                adapter = "kotlin"
            }
        }
    }

    forge("forge:1.20.1") {
        minecraftVersion = "1.20.1"
        loaderVersion = libs.versions.forge.loader

        runs {
            client()
        }

        dependencies {
            implementation(libs.forge.kotlin)
            modImplementation(project(":"))
        }

        metadata {
            loaderVersion("4")
            modLoader = "kotlinforforge"
        }
    }

    neoforge("neoforge:1.21") {
        minecraftVersion = "1.21"
        loaderVersion = libs.versions.neoforge.loader

        runs {
            client()
        }

        dependencies {
            implementation(libs.neoforge.kotlin)
            modImplementation(project(":"))
        }

        metadata {
            loaderVersion("5")
            modLoader = "kotlinforforge"
        }
    }
}
