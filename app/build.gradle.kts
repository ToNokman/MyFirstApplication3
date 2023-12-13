plugins {
    id("com.android.application")
}

android {
    namespace = "com.jnu.myfirstapplication3"
    compileSdk = 34


    defaultConfig {
        applicationId = "com.jnu.myfirstapplication3"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    testOptions{
        unitTests.isReturnDefaultValues = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.test:monitor:1.6.1")
    testImplementation("junit:junit:4.13.2")
    implementation ("androidx.tracing:tracing:1.2.0-beta02")
    testImplementation ("org.json:json:20231013")
    androidTestImplementation ("androidx.test.ext:junit:1.1.3")
    androidTestImplementation ("androidx.test.espresso:espresso-contrib:3.5.1")
    androidTestImplementation ("androidx.test:runner:1.4.0")
    androidTestImplementation ("androidx.test:rules:1.4.0")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation ("androidx.test.espresso:espresso-contrib:3.4.0")

}

//module 依赖
dependencies {
    implementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("org.testng:testng:6.9.6")// 地图库
    implementation ("com.tencent.map:tencent-map-vector-sdk:4.3.2")
    // 地图兼容库
    implementation ("com.tencent.map:sdk-compat-v4:4.3.2")
}