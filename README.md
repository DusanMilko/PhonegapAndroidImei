# Phonegap - Get Android Imei

### Install

1. cd into your project directory
2. Use the cmd line

```
phonegap local plugin add https://thisgit.git
```

You should now see it in your plugins folder PROJECT/plugins/com.dusan.imei.DeviceInfo

---
> **If using phonegap 3.3 of later use "cordova ..." not "phonegap ..."**

---

### Usage

Anytime after your device is ready at this into any js file

```
if( plugins.DeviceInfo ){
    plugins.DeviceInfo.imeiNumber(function(imei){
        alert("imei "+ imei);                   
    });
}
```

### After install make sure

You build the project

```
phonegap build android
```

Then check your platforms/android/ folder

Under src/com/dusan/imei should be the DeviceInfo.java file

Under assets/www/plugins/com.dusan.imei.DeviceInfo/www should be the deviceinfo.js file 

**If these files aren't there you installed incorrectly**


Your **res/xml/config.xml** has

```
 \<plugins>
   \<plugin name="DeviceInfo" value="com.dusan.imei.DeviceInfo"/>
 \</plugins>

```

Your **AndroidManifest.xml** has

---
> \<uses-permission android:name="android.permission.READ_PHONE_STATE"/>

---

# The ADT android simulator will return 00000000, which is correct, once you test on a real device you will get the real number
