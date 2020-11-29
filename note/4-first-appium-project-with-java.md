FREE Courses - https://automationstepbystep.com/
Check Troubleshooting tips below
Steps
1. Download & Open IDE
2. Create Java Project
3. Add selenium & appium libraries
4. Connect mobile device
5. Start appium server
6. Write code to start a mobile application
7. Use appium desktop client to find element locators

Step 1: Download Eclipse or any other IDE for Java
   https://www.youtube.com/playlist?list...

Step 2 : Create a Java project

Step 3 : Add libraries
   Selenium java
   Appium java client 
   https://mvnrepository.com/

Step 4 : Connect device
   run command : adb devices

Step 5 : Start appium server
   can do from command line or appium desktop client

Step 6 : Add code to start automation on mobile device
   Set desired capabilities
    deviceName
    udid
    platformName
    platformVersion

    appPackage
    appActivity

    http://127.0.0.1:4723/wd/hub
   Start calculator application

Step 7 : Run and validate

Troubleshooting tips
(contributed by Flavius-Cristian Luca)
- Issues with getting io.appium.uiautomator2.server.test package info: https://github.com/appium/appium-uiau...
- Original error: 'app' option is required for reinstall: for this, i added the following line of code

desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\＜＜userName＞\\AppData\\Roaming\\npm\\node_modules\\appium\\node_modules\\appium-uiautomator2-server\\apks\\appium-uiautomator2-server-v4.8.3.apk" );

-Error executing adbExec. on Android(M): https://github.com/appium/appium/issu...

#AppiumBeginnerTutorials