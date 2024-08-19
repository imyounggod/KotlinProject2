plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.jetbrainsCompose) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.mokoPlugin) apply false
    id("com.google.devtools.ksp") version "2.0.10-1.0.24"
    id("com.rickclephas.kmp.nativecoroutines") version "1.0.0-ALPHA-34"
}

buildscript{
    dependencies {
        classpath(libs.resources.generator)
    }
}