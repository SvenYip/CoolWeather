package com.example.ye.coolweather.model;

/**
 * Package_name:com.example.ye.coolweather.model.
 * Project_name:CoolWeather.
 * Created by YE on 2016/4/23.
 * Email：836090990@qq.com
 * Note：none
 */
public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
