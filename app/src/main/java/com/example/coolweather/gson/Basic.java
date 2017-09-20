package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2017/9/20.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("weather")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;

    }
}
