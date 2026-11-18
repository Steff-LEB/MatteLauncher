plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.matte.launcher"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.matte.launcher.live"
        minSdk = 26
        targetSdk = 35
        versionCode = 40
        versionName = "1.3.35"
    }

    buildTypes {
        debug {
            applicationIdSuffix = ".dev"
        }
        release {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}
