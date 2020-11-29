Pre-requisites
1. Java installed on system
2. JAVA_HOME is set in environment variables command to check : 
java -version
How to install java on Mac OS
https://www.youtube.com/playlist?list...
3. An android mobile device
4. Cable to connect mobile device to computer system

Install homebrew - https://brew.sh/


Step 1 : Download android sdk
   Way 1 : Download from https://developer.android.com/studio 
   Way 2 :
   brew install android-sdk
   brew cask install android-sdk
   https://stackoverflow.com/questions/2...

Step 2 : Extract platform-tools folder
   sdkmanager "platform-tools" "platforms;android-28"

Step 3 : Add environment variables
   ANDROID_HOME = path of android-sdk folder
   PATH : append path of platform-tools folder

   export ANDROID_HOME=/usr/local/share/android-sdk
   echo $ANDROID_HOME
   export PATH="/usr/local/Caskroom/android-sdk/4333796/platform-tools:${PATH}"

   To set environment variables permanently on the Mac system
   cd ~/
   cat .bash_profile
   If bash_profile does not exist - touch .bash_profile

   vi .bash_profile
   Press i
   Add the following

   # Setting PATH for ANDROID_HOME
   export ANDROID_HOME=/usr/local/share/android-sdk

   # Adding platform-tools to PATH
   PATH="/usr/local/Caskroom/android-sdk/4333796/platform-tools:${PATH}”

   Press esc
   :wq!
   Enter

   Now ANDROID HOME AND PATH ARE SET PERMANENTLY
   echo $ANDROID_HOME
   echo $PATH

   After this you should be able to run command adb devices

Step 4 : Make mobile device ready for automation
   Enable developer mode
   Enable USB debugging

Step 5 : Connect device with computer system using usb cable
    if asked enable USB Debugging
   
Step 6 : Run command : adb devices
   Check device id is displayed

#AppiumBeginnerTutorials