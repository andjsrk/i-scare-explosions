import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.8.22"
}

group = "io.github.andjsrk"
version = "1.0"

repositories {
    mavenCentral()
    maven("https://papermc.io/repo/repository/maven-public/")
    maven("https://repo1.maven.org/maven2/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-20230710.133501-52")
    compileOnly(kotlin("stdlib"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "17"
    }
    jar {
        archiveVersion.set("")
    }
}
