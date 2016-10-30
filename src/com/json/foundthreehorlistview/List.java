package com.json.foundthreehorlistview;
import com.google.gson.annotations.Expose;

public class List {

    @Expose
    private String createTime;
    @Expose
    private String h5NavUrl;
    @Expose
    private String logo;
    @Expose
    private String tagText;
    @Expose
    private String title;
    @Expose
    private String appNavUrl;

    /**
     * 
     * @return
     *     The createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime
     *     The createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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
     *     The logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 
     * @param logo
     *     The logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 
     * @return
     *     The tagText
     */
    public String getTagText() {
        return tagText;
    }

    /**
     * 
     * @param tagText
     *     The tagText
     */
    public void setTagText(String tagText) {
        this.tagText = tagText;
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

}
