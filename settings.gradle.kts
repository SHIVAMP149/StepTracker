pluginManagement {
    resolutionStrategy {
        eachPlugin {
            when {
                requested.id.id.startsWith("com.android.") -> {
                    useModule("com.android.tools.build:gradle:${requested.version}")
                }
                requested.id.id.startsWith("org.jetbrains.kotlin.") -> {
                    useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
                }
            }
        }
    }
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "StepTracker"
include(":app")
