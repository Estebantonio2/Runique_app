plugins {
    `kotlin-dsl`
}

group = "com.example.runique_app.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.room.gradlePlugin)
}

//gradlePlugin {
//    plugins {
//        register("androidApplication") {
//            id = "runique_app.android.application"
//            implementationClass = "AndroidApplicationConventionPlugin"
//        }
//        register("androidApplicationCompose") {
//            id = "runique_app.android.application.compose"
//            implementationClass = "AndroidApplicationComposeConventionPlugin"
//        }
//        register("androidLibrary") {
//            id = "runique_app.android.library"
//            implementationClass = "AndroidLibraryConventionPlugin"
//        }
//        register("androidLibraryCompose") {
//            id = "runique_app.android.library.compose"
//            implementationClass = "AndroidLibraryComposeConventionPlugin"
//        }
//        register("androidFeatureUi") {
//            id = "runique_app.android.feature.ui"
//            implementationClass = "AndroidFeatureUiConventionPlugin"
//        }
//        register("androidRoom") {
//            id = "runique_app.android.room"
//            implementationClass = "AndroidRoomConventionPlugin"
//        }
//        register("jvmLibrary") {
//            id = "runique_app.jvm.library"
//            implementationClass = "JvmLibraryConventionPlugin"
//        }
//        register("jvmKtor") {
//            id = "runique_app.jvm.ktor"
//            implementationClass = "JvmKtorConventionPlugin"
//        }
//    }
//}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "runique_app.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidApplicationCompose") {
            id = "runique_app.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
        register("androidLibrary") {
            id = "runique_app.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidLibraryCompose") {
            id = "runique_app.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }
        register("androidFeatureUi") {
            id = "runique_app.android.feature.ui"
            implementationClass = "AndroidFeatureUiConventionPlugin"
        }
        register("androidRoom") {
            id = "runique_app.android.room"
            implementationClass = "AndroidRoomConventionPlugin"
        }
        register("jvmLibrary") {
            id = "runique_app.jvm.library"
            implementationClass = "JvmLibraryConventionPlugin"
        }
        register("jvmKtor") {
            id = "runique_app.jvm.ktor"
            implementationClass = "JvmKtorConventionPlugin"
        }
    }
}
