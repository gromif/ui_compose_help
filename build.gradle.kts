plugins {
    alias(libs.plugins.astracrypt.android.library)
    alias(libs.plugins.astracrypt.android.library.compose)
    alias(libs.plugins.astracrypt.kotlin.serialization)
}

android {
    namespace = "com.nevidimka655.compose_help"

    defaultConfig {
        consumerProguardFiles("consumer-rules.pro")
    }
}