plugins {
    kotlin("jvm") version "1.8.0"
}


repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":usecase"))
    implementation(project(":infrostucture"))
    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-assertions-core-jvm:5.5.5")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}