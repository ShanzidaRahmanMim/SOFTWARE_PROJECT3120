plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.software_project_3_1"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.software_project_3_1"
        minSdk = 24
        targetSdk = 34
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    lint {
        baseline = file("lint-baseline.xml")
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-database:21.0.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


    implementation("com.google.android.material:material:1.11.0")
    implementation("com.google.firebase:firebase-auth:22.2.0")
    implementation("com.google.firebase:firebase-database:20.3.0")
    implementation("com.android.volley:volley:1.2.1")
    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation("junit:junit:4.12")
    implementation("androidx.test.espresso:espresso-contrib:3.5.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    androidTestImplementation("org.testng:testng:6.9.6")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
    testImplementation ("junit:junit:4.13.2")
    testImplementation("org.hamcrest:hamcrest-core:1.3")
    testImplementation("org.mockito:mockito-core:3.+")
    androidTestImplementation("org.mockito:mockito-android:3.+")
    implementation("com.google.gms:google-services:4.3.10")
    implementation("androidx.multidex:multidex:2.0.1")
    androidTestImplementation ("androidx.test:runner:1.4.0")
    androidTestImplementation ("androidx.test:rules:1.4.0")
    androidTestImplementation("com.google.firebase:firebase-auth:20.0.3")
    androidTestImplementation("androidx.test.espresso:espresso-intents:3.4.0")
    androidTestImplementation ("androidx.test.ext:junit:1.1.3")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation ("androidx.test.espresso:espresso-intents:3.3.0")
    androidTestImplementation ("androidx.test.espresso:espresso-contrib:3.4.0")
    androidTestImplementation ("androidx.test:core:1.4.0")
}