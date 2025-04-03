import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.22"
    application
}

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.github.kotlin-telegram-bot:kotlin-telegram-bot:6.3.0")
}

// Фиксируем одну версию JVM для всех задач компиляции
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "21"  // Меняем на 21 (как у Java)
}

tasks.withType<JavaCompile> {
    sourceCompatibility = "21"
    targetCompatibility = "21"
}

application {
    mainClass.set("MainKt")
}