FREE Courses - https://automationstepbystep.com/onli...
Today we will learn:
1. How to install appium with node.js
2. How to install appium with with Appium Desktop Client
3. How to check installation & dependencies (appium-doctor)
4. How to uninstall appium

http://appium.io/

Step 1 : Check if node is installed on your system
    node -v

Step 2 : Install node.js
    https://nodejs.org/en/download/
    https://brew.sh/
    brew install node

Step 3 : Check if node is installed
    node -v
    npm -v

Step 4 : Install appium
    npm install -g appium

Step 5 : Check appium is installed
    appium -v

Step 6 : Start appium
    appium

Installing appium with appium desktop client

Step 1 : Download appium desktop client - http://appium.io/
   https://github.com/appium/appium-desktop

Step 2 : Double click on the .dmg file to install appium desktop client

Step 3 : Start appium desktop client


Appium-Doctor
https://www.npmjs.com/package/appium-...
https://github.com/appium/appium-doctor

npm install appium-doctor -g


How to uninstall appium

If installed through node.js
npm uninstall -g appium

If installed Appium Desktop Client
Delete the app

#AppiumStepByStep