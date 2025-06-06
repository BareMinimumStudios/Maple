import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

plugins {
    kotlin("jvm") version libs.versions.kotlin
    alias(libs.plugins.cloche)
}

repositories {
    cloche {
        mavenCentral()
        main()
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

    version = "1.0.0"
    group = "xyz.naomieow"

    configure<KotlinProjectExtension> {
        explicitApi()
    }
}