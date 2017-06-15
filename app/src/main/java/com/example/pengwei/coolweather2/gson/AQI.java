package com.example.pengwei.coolweather2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 972694341@qq.com on 2017/4/21.
 */

public class AQI {

    public AQICity city;

    public class AQICity{

        public String aqi;

        public String pm25;

        @SerializedName("qlty")
        public String quality;

    }
}
