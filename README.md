# Phonegap - Get Android Imei

### Install

1. cd into your project directory
2. Use the cmd line

```
phonegap local plugin add https://thisgit.git
```

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

Your **res/xml/config.xml** has

---
> \<plugins>
>   \<plugin name="DeviceInfo" value="com.dusan.imei.DeviceInfo"/>
> \</plugins>

---

Your **AndroidManifest.xml** has

---
> \<uses-permission android:name="android.permission.READ_PHONE_STATE"/>

---
