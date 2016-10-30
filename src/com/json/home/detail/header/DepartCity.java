package com.json.home.detail.header;
import com.google.gson.annotations.Expose;

public class DepartCity {

    @Expose
    private String departCityCode;
    @Expose
    private String departCityName;

    /**
     * 
     * @return
     *     The departCityCode
     */
    public String getDepartCityCode() {
        return departCityCode;
    }

    /**
     * 
     * @param departCityCode
     *     The departCityCode
     */
    public void setDepartCityCode(String departCityCode) {
        this.departCityCode = departCityCode;
    }

    /**
     * 
     * @return
     *     The departCityName
     */
    public String getDepartCityName() {
        return departCityName;
    }

    /**
     * 
     * @param departCityName
     *     The departCityName
     */
    public void setDepartCityName(String departCityName) {
        this.departCityName = departCityName;
    }

}
