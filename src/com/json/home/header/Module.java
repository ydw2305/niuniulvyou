package com.json.home.header;
import com.google.gson.annotations.Expose;

public class Module {

    @Expose
    private Integer moduleId;
    @Expose
    private String title;
    @Expose
    private Boolean getRecommendFlag;
    @Expose
    private Object flight;
    @Expose
    private Object packageInfo;

    /**
     * 
     * @return
     *     The moduleId
     */
    public Integer getModuleId() {
        return moduleId;
    }

    /**
     * 
     * @param moduleId
     *     The moduleId
     */
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The getRecommendFlag
     */
    public Boolean getGetRecommendFlag() {
        return getRecommendFlag;
    }

    /**
     * 
     * @param getRecommendFlag
     *     The getRecommendFlag
     */
    public void setGetRecommendFlag(Boolean getRecommendFlag) {
        this.getRecommendFlag = getRecommendFlag;
    }

    /**
     * 
     * @return
     *     The flight
     */
    public Object getFlight() {
        return flight;
    }

    /**
     * 
     * @param flight
     *     The flight
     */
    public void setFlight(Object flight) {
        this.flight = flight;
    }

    /**
     * 
     * @return
     *     The packageInfo
     */
    public Object getPackageInfo() {
        return packageInfo;
    }

    /**
     * 
     * @param packageInfo
     *     The packageInfo
     */
    public void setPackageInfo(Object packageInfo) {
        this.packageInfo = packageInfo;
    }

}
