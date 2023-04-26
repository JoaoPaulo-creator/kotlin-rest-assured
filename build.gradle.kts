plugins {
    kotlin("jvm") version "1.8.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("io.rest-assured:rest-assured:5.3.0")
    implementation ("io.rest-assured:json-path:5.3.0")
    implementation ("io.rest-assured:xml-path:5.3.0")


    testImplementation ("io.rest-assured:rest-assured:5.3.0")
    testImplementation ("io.rest-assured:json-path:5.3.0")
    testImplementation ("io.rest-assured:xml-path:5.3.0")
    testImplementation ("io.rest-assured:json-schema-validator:5.3.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}