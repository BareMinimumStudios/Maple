import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

plugins {
    kotlin("jvm") version libs.versions.kotlin
    alias(libs.plugins.cloche)
}

version = "1.0.0"
group = "xyz.naomieow.maple"

repositories {
    cloche {
        mavenForge()
        mavenFabric()
        mavenNeoforged()
        mavenNeoforgedMeta()
        librariesMinecraft()
        main()
    }
    maven("https://thedarkcolour.github.io/KotlinForForge/")
    maven("https://maven.terraformersmc.com/")
}

cloche {
    metadata {
        modId = "maple"
        name = "Maple"
        description = "Simple UI building library"
        license = "MIT"

        author("naomieow")
    }

    fabric("fabric:1.20.1") {
        minecraftVersion = "1.20.1"
        loaderVersion = libs.versions.fabric.loader

        client()

        dependencies {
            fabricApi(libs.versions.fabric.api.v1201)
            modImplementation(libs.fabric.kotlin)
        }

        metadata {
            dependencies {
                dependency {
                    modId = "fabric-language-kotlin"
                    required = true
                    version(libs.versions.fabric.kotlin.get())
                }
            }

            entrypoint("client") {
                value = "xyz.naomieow.maple.MapleFabricClient"
                adapter = "kotlin"
            }

            custom(mapOf(
                "modmenu" to mapOf(
                    "badges" to listOf("library")
                )
            ))
        }
    }

    fabric("fabric:1.21") {
        minecraftVersion = "1.21"
        loaderVersion = libs.versions.fabric.loader

        client()

        dependencies {
            fabricApi(libs.versions.fabric.api.v121)
            modImplementation(libs.fabric.kotlin)
        }
    }

    forge("forge:1.20.1") {
        minecraftVersion = "1.20.1"
        loaderVersion = libs.versions.forge.loader

        dependencies {
            implementation(libs.forge.kotlin)
        }
    }

    neoforge("neoforge:1.21") {
        minecraftVersion = "1.21"
        loaderVersion = libs.versions.neoforge.loader

        dependencies {
            implementation(libs.neoforge.kotlin)
        }
    }
}

subprojects {
    apply(plugin = "earth.terrarium.cloche")
    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        cloche {
            mavenForge()
            mavenFabric()
            mavenNeoforged()
            mavenNeoforgedMeta()
            librariesMinecraft()
            main()
        }
        maven("https://thedarkcolour.github.io/KotlinForForge/")
        maven("https://maven.terraformersmc.com/")
    }

    configure<KotlinProjectExtension> {
        explicitApi()
    }
}