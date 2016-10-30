package com.json.home.detail.header;
import com.google.gson.annotations.Expose;

public class Go {

    @Expose
    private String cityCode;
    @Expose
    private String cityName;

    /**
     * 
     * @return
     *     The cityCode
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 
     * @param cityCode
     *     The cityCode
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * 
     * @return
     *     The cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 
     * @param cityName
     *     The cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

}
