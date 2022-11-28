package mhk.app.firebaseappdistribution

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //For Build Artifact ABB -> App Store linking is mandatory on firebase
        //For Build Artifact APK -> App Store linking is not mandatory

        /*
             Step 1. Generate Token
            ./gradlew appDistributionLogin
        */


        // Debug Build Steps
        /*
            ./gradlew :app:bundleDebug
            export FIREBASE_TOKEN=1//03A-9ZSsH9k2xCgYIARAAGAMSNwF-L9IrwT_Y90YX0JdWNxAH5Ycl_vW1maSDiFhgVqy0zV2GTM0GAYmQBymTYVdXopnxEBDh5BI
            ./gradlew --stop // Only needed for environment variable changes
            ./gradlew bundleDebug appDistributionUploadDebug
                OR
            ./gradlew assembleDebug appDistributionUploadDebug

         */

        // Release Build Steps
        /*
            ./gradlew :app:bundleRelease
            export FIREBASE_TOKEN=1//03A-9ZSsH9k2xCgYIARAAGAMSNwF-L9IrwT_Y90YX0JdWNxAH5Ycl_vW1maSDiFhgVqy0zV2GTM0GAYmQBymTYVdXopnxEBDh5BI
            ./gradlew --stop // Only needed for environment variable changes
            ./gradlew bundleRelease appDistributionUploadRelease

         */

        // Workflow Modified


    }
}