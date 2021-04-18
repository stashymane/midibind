import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("java")
    id("application")
    kotlin("jvm") version "1.4.32"
    kotlin("plugin.serialization") version "1.4.32"
}

group = "dev.stashy.midibind"
version = "0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("dev.stashy.midifunk:midifunk:0.3.0")
    implementation("no.tornado:tornadofx:1.7.20")
    implementation("io.reactivex.rxjava3:rxjava:3.0.8")
    testImplementation("junit", "junit", "4.13.1")
}

application {
    mainClassName = "${group}.MainKt"
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}