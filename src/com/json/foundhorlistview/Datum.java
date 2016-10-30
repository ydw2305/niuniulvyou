package com.json.foundhorlistview;
import java.util.ArrayList;
import com.google.gson.annotations.Expose;

public class Datum {

    @Expose
    private String appNavUrl;
    @Expose
    private Integer count;
    @Expose
    private String desc;
    @Expose
    private String h5NavUrl;
    @Expose
    private String imgUrl;
    @Expose
    private java.util.List<Qiujibanglist> list = new ArrayList<Qiujibanglist>();
    @Expose
    private String navTitle;

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
     *     The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 
     * @param desc
     *     The desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
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
     *     The list
     */
    public java.util.List<Qiujibanglist> getList() {
        return list;
    }

    /**
     * 
     * @param list
     *     The list
     */
    public void setList(java.util.List<Qiujibanglist> list) {
        this.list = list;
    }

    /**
     * 
     * @return
     *     The navTitle
     */
    public String getNavTitle() {
        return navTitle;
    }

    /**
     * 
     * @param navTitle
     *     The navTitle
     */
    public void setNavTitle(String navTitle) {
        this.navTitle = navTitle;
    }

}
