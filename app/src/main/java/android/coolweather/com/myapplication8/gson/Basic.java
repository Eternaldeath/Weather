package android.coolweather.com.myapplication8.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 23380 on 2019/6/16.
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
