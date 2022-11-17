pluginManagement{
    repositories {
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

rootProject.name = "competative-problems"

include(":languages:java")
include(":languages:kotlin")