import deps.Deps
import deps.composeImplementation

plugins {
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")
}

android {
  buildFeatures {
    viewBinding = true
    compose = true
  }
  composeOptions {
    kotlinCompilerExtensionVersion = "1.0.0-beta03"
  }
}

dependencies {
  implementation(project(":common"))
  implementation(project(":strings"))
  implementation(project(":playback"))
  implementation(project(":data"))
  implementation(project(":prefs"))
  implementation(project(":sleepTimer"))

  implementation(Deps.timber)
  implementation(Deps.Kotlin.coroutines)
  implementation(Deps.picasso)
  implementation(Deps.AndroidX.ktx)
  implementation(Deps.Prefs.core)
  implementation(Deps.MaterialDialog.core)
  implementation(Deps.AndroidX.ktx)

  implementation(Deps.Dagger.core)
  kapt(Deps.Dagger.compiler)

  composeImplementation()
}