package com.example.ye.coolweather.util;

import android.text.TextUtils;

import com.example.ye.coolweather.db.CoolWeatherDB;
import com.example.ye.coolweather.model.City;
import com.example.ye.coolweather.model.County;
import com.example.ye.coolweather.model.Province;

/**
 * Package_name:com.example.ye.coolweather.util.
 * Project_name:CoolWeather.
 * Created by YE on 2016/4/23.
 * Email：836090990@qq.com
 * Note：none
 */
public class Utility {
    //省级数据,同步静态
    public synchronized static boolean handleProvincesResponse(
            CoolWeatherDB coolWeatherDB,String response){
        if(!TextUtils.isEmpty(response)){
                String[] allProvinces=response.split(",");
            if(allProvinces!=null&&allProvinces.length>0){
                for(String p:allProvinces){
                    String[] array=p.split("\\|");
                    Province province=new Province();
                    province.setProvinceCode(array[0]);
                    province.setProvinceName(array[1]);
                    coolWeatherDB.saveProvince(province);
                }return true;
            }
        }return false;
    }

    //市级数据
    public static boolean handleCitiesResponse(CoolWeatherDB coolWeatherDB,
                                               String response,int provinceId){
        if(!TextUtils.isEmpty(response)){
            String[] allCities=response.split(",");
            if(allCities!=null&&allCities.length>0){
                for (String c:allCities){
                    String[] array=c.split("\\|");
                    City city=new City();
                    city.setCityCode(array[0]);
                    city.setCityName(array[1]);
                    city.setProvinceId(provinceId);
                    coolWeatherDB.saveCity(city);
                }
                return true;
            }
        }return false;
    }

    //县级
    public static boolean handleCountiesResponse(CoolWeatherDB coolWeatherDB,
                                                 String response,int cityId){
        if(!TextUtils.isEmpty(response)){
            String[] allcounties=response.split(",");
            if(allcounties!=null&&allcounties.length>0){
                for (String c:allcounties){
                    String[] array=c.split("\\|");
                    County county=new County();
                    county.setCountyCode(array[0]);
                    county.setCountyName(array[1]);
                    county.setCityId(cityId);
                    coolWeatherDB.saveCounty(county);
                }
                return true;
            }
        }
        return false;
    }
}
