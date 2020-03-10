package android.coolweather.com.myapplication8.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 23380 on 2019/6/16.
 */
public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
