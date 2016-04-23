package com.example.ye.coolweather.util;

/**
 * Package_name:com.example.ye.coolweather.util.
 * Project_name:CoolWeather.
 * Created by YE on 2016/4/23.
 * Email：836090990@qq.com
 * Note：none
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
