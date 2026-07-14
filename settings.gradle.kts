plugins {
    // auto-downloads the JDK required by the java toolchain (jvmToolchain in build.gradle.kts)
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.10.0"
}

rootProject.name = "aixm"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}
