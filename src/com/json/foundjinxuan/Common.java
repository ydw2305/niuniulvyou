package com.json.foundjinxuan;
import com.google.gson.annotations.Expose;

public class Common {

    @Expose
    private String appNavUrl;
    @Expose
    private String flagTxt;
    @Expose
    private String flagTxtAppNavUrl;
    @Expose
    private String flagTxtH5NavUrl;
    @Expose
    private String h5NavUrl;
    @Expose
    private Integer id;
    @Expose
    private String imgUrl;
    @Expose
    private String introduction;
    @Expose
    private String title;

    /**
     * 
     * @return
     *     The appNavUrl
     */
    public String getAppNavUrl() {
        return appNavUrl;
    }

    /**
     * 
     * @param appNavUrl
     *     The appNavUrl
     */
    public void setAppNavUrl(String appNavUrl) {
        this.appNavUrl = appNavUrl;
    }

    /**
     * 
     * @return
     *     The flagTxt
     */
    public String getFlagTxt() {
        return flagTxt;
    }

    /**
     * 
     * @param flagTxt
     *     The flagTxt
     */
    public void setFlagTxt(String flagTxt) {
        this.flagTxt = flagTxt;
    }

    /**
     * 
     * @return
     *     The flagTxtAppNavUrl
     */
    public String getFlagTxtAppNavUrl() {
        return flagTxtAppNavUrl;
    }

    /**
     * 
     * @param flagTxtAppNavUrl
     *     The flagTxtAppNavUrl
     */
    public void setFlagTxtAppNavUrl(String flagTxtAppNavUrl) {
        this.flagTxtAppNavUrl = flagTxtAppNavUrl;
    }

    /**
     * 
     * @return
     *     The flagTxtH5NavUrl
     */
    public String getFlagTxtH5NavUrl() {
        return flagTxtH5NavUrl;
    }

    /**
     * 
     * @param flagTxtH5NavUrl
     *     The flagTxtH5NavUrl
     */
    public void setFlagTxtH5NavUrl(String flagTxtH5NavUrl) {
        this.flagTxtH5NavUrl = flagTxtH5NavUrl;
    }

    /**
     * 
     * @return
     *     The h5NavUrl
     */
    public String getH5NavUrl() {
        return h5NavUrl;
    }

    /**
     * 
     * @param h5NavUrl
     *     The h5NavUrl
     */
    public void setH5NavUrl(String h5NavUrl) {
        this.h5NavUrl = h5NavUrl;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
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
     *     The introduction
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 
     * @param introduction
     *     The introduction
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
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

}
