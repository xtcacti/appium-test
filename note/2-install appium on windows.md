Today we will learn:
1. How to install appium with node.js
2. How to install appium with with Appium Desktop Client
3. How to check installation & dependencies (appium-doctor)
4. How to uninstall appium

Installing appium with Node.js

Step 1 : Check if node.js is installed on your system    node --version    npm --version

Step 2 : Download node.js installer    https://nodejs.org/en/download/

Step 3 : Run the installer & install node.js & npm

Step 4 : Check if node.js & npm are installed
    node --version    npm --version
    where node
    where npm

Step 5 : Install appium with node.js
    npm install -g appium

Step 6 : Check if appium is installed
    appium -v
    where appium

Step 7 : Start appium
    appium

Installing appium with APPIUM DESKTOP CLIENT

Step 1 : Download appium desktop client
   http://appium.io/
   https://github.com/appium/appium-desk...

Step 2 : Install appium desktop client

Step 3 : Start appium through appium desktop client

To check appium installation & dependencies
Install appium-doctor
https://github.com/appium/appium-doctor
npm install appium-doctor -g
appium-doctor -h
appium-doctor --android

How to Uninstall appium