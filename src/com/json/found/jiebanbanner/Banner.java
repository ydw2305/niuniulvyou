package com.json.found.jiebanbanner;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class Banner {

    @Expose
    private String appNavUrl;
    @Expose
    private Integer bannerId;
    @Expose
    private String desc;
    @Expose
    private String h5NavUrl;
    @Expose
    private String imgUrl;
    @Expose
    private List<String> imgUrlList = new ArrayList<String>();
    @Expose
    private String title;
    @Expose
    private Object userInfo;

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
     *     The bannerId
     */
    public Integer getBannerId() {
        return bannerId;
    }

    /**
     * 
     * @param bannerId
     *     The bannerId
     */
    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
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
     *     The imgUrlList
     */
    public List<String> getImgUrlList() {
        return imgUrlList;
    }

    /**
     * 
     * @param imgUrlList
     *     The imgUrlList
     */
    public void setImgUrlList(List<String> imgUrlList) {
        this.imgUrlList = imgUrlList;
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
     *     The userInfo
     */
    public Object getUserInfo() {
        return userInfo;
    }

    /**
     * 
     * @param userInfo
     *     The userInfo
     */
    public void setUserInfo(Object userInfo) {
        this.userInfo = userInfo;
    }

}
