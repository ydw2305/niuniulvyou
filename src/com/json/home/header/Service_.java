package com.json.home.header;
import com.google.gson.annotations.Expose;

public class Service_ {

    @Expose
    private String title;
    @Expose
    private String imgUrl;
    @Expose
    private String appUrl;
    @Expose
    private String mUrl;

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
     *     The imgUrl
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 
     * @param imgUrl
     *     The imgUrl
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * 
     * @return
     *     The appUrl
     */
    public String getAppUrl() {
        return appUrl;
    }

    /**
     * 
     * @param appUrl
     *     The appUrl
     */
    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    /**
     * 
     * @return
     *     The mUrl
     */
    public String getMUrl() {
        return mUrl;
    }

    /**
     * 
     * @param mUrl
     *     The mUrl
     */
    public void setMUrl(String mUrl) {
        this.mUrl = mUrl;
    }

}
