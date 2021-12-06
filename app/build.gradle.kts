import com.ui.compose.Dep

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.ui.compose"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.4"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Dep.AndroidX.Core)
    implementation(Dep.AndroidX.AppCompat)
    implementation(Dep.AndroidX.Material)
    implementation(Dep.AndroidX.Lifeycycle)

    implementation(Dep.Compose.Ui)
    implementation(Dep.Compose.Material)
    implementation(Dep.Compose.Tooling)
    implementation(Dep.Compose.LiveData)
    implementation(Dep.Compose.Activity)

    testImplementation(Dep.Testing.JunitCore)

    androidTestImplementation(Dep.Testing.JunitExt)
    androidTestImplementation(Dep.Testing.Espresso)
    androidTestImplementation(Dep.Compose.Test)
    debugImplementation(Dep.Compose.ToolingTest)
}