FREE courses - https://automationstepbystep.com/       
Check the steps below
1. Java
2. Appium
3. Xcode
4. Xcode command line tools
5. WebDriverAgent
6. Real Devices OR Simulators
7. IDE (eclipse)

Step 0: Intro 0:00
Step 1: Install Java JDK 0:30
Step 2: Install HomeBrew 1:44
Step 3: Install node js and npm 2:28
Step 4: Install Appium 3:28
Step 5: Install Xcode 3:44
Step 6: Install Xcode command line tools 6:33
Step 7: Create Apple ID 7:06
Step 8: Install Carthage 8:16
Step 9: Initialize WebDriverAgent Project 9:44
For Appium 1.15.0+
https://docs.katalon.com/katalon-stud...
Step 10: Open WebDriverAgent.xcodeproj in Xcode 18:54
Step 11: Build and run project 22:33
Step 12: Create a project and add desired capabilities for automation on iOS 33:22

Detailed Steps - https://docs.google.com/document/d/1H...

If Required To allow Appium permission in MacOS settings ＞security & privacy ＞general 
See more: https://support.apple.com/en-in/HT202491

deviceName
platformName
platformVersion
app

Open Eclipse
Create a new maven project or use any existing maven project
Add maven dependencies 
 appium 
 selenium

  DesiredCapabilities cap = new DesiredCapabilities();
  
  cap.setCapability("platformName", "iOS");
  cap.setCapability("platformVersion", "11.4");
  cap.setCapability("deviceName", "iPhone 8");
  cap.setCapability(CapabilityType.BROWSER_NAME, "safari");
  cap.setCapability("app", “location of .app or .ipa file“);
 
  URL url = new URL("http://127.0.0.1:4723/wd/hub");
  
  IOSDriver driver = new IOSDriver(url, cap);
  
References
https://github.com/appium/appium-xcui...
https://www.embarcadero.com/starthere...

External tools/utilities may be required

Install authorize-ios
npm install -g authorize-ios

Install libimobiledevice 
brew install libimobiledevice 

Install ideviceinstaller / ios-deploy

To deploy our apps to our devices. We can install and debug apps from the command line without using Xcode
sudo xcode-select -r
brew install ideviceinstaller

ideviceinstaller doesn't work with iOS 10 yet. So we need to install ios-deploy
npm install -g ios-deploy

Install  ios_webkit_debug_proxy
brew install ios-webkit-debug-proxy

#AppiumBeginnerTutorials
http://bit.ly/2W9pNeb
