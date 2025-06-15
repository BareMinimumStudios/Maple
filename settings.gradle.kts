rootProject.name = "maple"
include("testmod")

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven(url = "https://maven.msrandom.net/repository/cloche")
    }
}

dependencyResolutionManagement {
    versionCatalogs.create("libs") {
        from(files("libs.versions.toml"))
    }
}