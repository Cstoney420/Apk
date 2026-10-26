# Number Rush — Android game starter

An offline, touch-controlled number runner inspired by the “fake ad game” genre. Collect green + gates, avoid red − gates and obstacles, and race to the finish. No ads, analytics, or network permissions.

## Build the APK
1. Install Android Studio (current stable) and Android SDK Platform 35.
2. Open this `NumberRush` folder as an existing Android Studio project.
3. Let Gradle sync. If prompted, install the Android Gradle Plugin/Gradle version Android Studio requests.
4. Choose **Build → Build Bundle(s) / APK(s) → Build APK(s)**.
5. Android Studio will show the output location, typically `app/build/outputs/apk/debug/app-debug.apk`.

This environment did not have the Android SDK/Gradle build toolchain, so the source project is provided rather than a falsely labeled prebuilt APK. The game itself can be previewed immediately by opening `app/src/main/assets/index.html` in a mobile or desktop browser.
