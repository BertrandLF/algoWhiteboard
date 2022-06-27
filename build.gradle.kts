import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.0"
    application
}

group = "org.algo"
version = "1.0-SNAPSHOT"
var spekVersion = "2.0.18"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.spekframework.spek2:spek-dsl-jvm:$spekVersion")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.6.20")
    testImplementation("org.hamcrest:hamcrest:2.2")
    testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:$spekVersion")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "16"
}

application {
    mainClass.set("MainKt")
}