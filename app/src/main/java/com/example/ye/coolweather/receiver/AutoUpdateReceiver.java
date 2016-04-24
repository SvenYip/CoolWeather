package com.example.ye.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.ye.coolweather.service.AutoUpdateService;

/**
 * Package_name:com.example.ye.coolweather.receiver.
 * Project_name:CoolWeather.
 * Created by YE on 2016/4/24.
 * Email：836090990@qq.com
 * Note：none
 */
public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
    Intent i=new Intent(context, AutoUpdateService.class);
        context.startActivity(i);
    }
}
