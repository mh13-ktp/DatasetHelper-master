plugins {
    id("com.android.application")
}

android {
    setCompileSdkVersion(rootProject.property("compileSdkVersion") as Int)
    defaultConfig {
        applicationId = "com.otaliastudios.cameraview.demo"
        setMinSdkVersion (24)
        // setMinSdkVersion(rootProject.property("minSdkVersion") as Int)
        //setTargetSdkVersion(rootProject.property("targetSdkVersion") as Int)
        setTargetSdkVersion(24)
        versionCode = 1
        versionName = "1.0"
        vectorDrawables.useSupportLibrary = true
    }
}

dependencies {
    implementation(project(":cameraview"))
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("com.google.android.material:material:1.1.0")
    implementation ("com.arthenica:mobile-ffmpeg-full:4.4")

}
