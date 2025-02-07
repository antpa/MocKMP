plugins {
    id("org.kodein.library.mpp")
}

val kspVersion: String by extra

kodein {
    kotlin {
        add(kodeinTargets.jvm.jvm) {
            main.dependencies {
                implementation("org.objenesis:objenesis:3.2")
            }
        }
        add(kodeinTargets.native.all)
        add(kodeinTargets.js.js)
    }
}

kodeinUpload {
    name = "mockmp-runtime"
    description = "MocKMP runtime"
}
