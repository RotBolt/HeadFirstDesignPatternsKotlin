plugins {
    id("java")
    id("java-library")
    kotlin("jvm") version "1.8.21"

}

group = "io.rotlabs"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
    jvmToolchain(11)
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(kotlin("stdlib-jdk8"))
}

tasks.test {
    useJUnitPlatform()
}