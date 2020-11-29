website - https://automationstepbystep.com/
Step 1 : Ensure your computer and mobile phone are connected to same wifi network
Step 2 : Connect mobile with computer using cable
Step 3 : On cmd run adb devices. This will list the devices connected
Step 4 :  Now on CMD run adb tcpip 5555
              You can use any other port also
              You should get output like - restarting in TCP mode port: 5555

FREE - https://automationstepbystep.com/onli...

Step 5 : Disconnect mobile cable

Step 6 : Get your mobile ip - 
              Settings - About Phone - Status
              OR
              Settings - WiFi - your connected network - and note down the IP address

Step 7 : Run on cmd adb connect ip
              adb connect 192.168.1.4

  if any issues can do
  add kill-server
  adb connect 192.168.1.4
  OR
  add kill-server
  adb connect 192.168.1.4:5555

Step 8 : Now you can use your mobile without  cable

Step 9 : To verify run adb devices command and it should list your device


#AppiumBeginnerTutorials