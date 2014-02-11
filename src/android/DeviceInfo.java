/**
 * 
 */
/**
 * @author dusanmilko
 *
 */
package com.dusan.imei;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;

import android.content.Context;
import android.telephony.TelephonyManager;

public class DeviceInfo extends CordovaPlugin {

    public DeviceInfo(){
    }

    public String DeviceImeiNumber(){
        TelephonyManager tManager = (TelephonyManager)cordova.getActivity().getSystemService(Context.TELEPHONY_SERVICE);            
        return tManager.getDeviceId();
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        if (action.equals("imeiNumber")) {
            callbackContext.success(this.DeviceImeiNumber());
            return true;
        } 
        else {
            return false;
        }
    } 
}