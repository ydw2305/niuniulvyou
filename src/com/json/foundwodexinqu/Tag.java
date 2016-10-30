package com.json.foundwodexinqu;
import com.google.gson.annotations.Expose;

public class Tag {

    @Expose
    private String appNavUrl;
    @Expose
    private String h5NavUrl;
    @Expose
    private Integer listTemplate;
    @Expose
    private Integer tagId;
    @Expose
    private String tagName;
    @Expose
    private Integer topCategory;

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
     *     The listTemplate
     */
    public Integer getListTemplate() {
        return listTemplate;
    }

    /**
     * 
     * @param listTemplate
     *     The listTemplate
     */
    public void setListTemplate(Integer listTemplate) {
        this.listTemplate = listTemplate;
    }

    /**
     * 
     * @return
     *     The tagId
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * 
     * @param tagId
     *     The tagId
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * 
     * @return
     *     The tagName
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * 
     * @param tagName
     *     The tagName
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     * 
     * @return
     *     The topCategory
     */
    public Integer getTopCategory() {
        return topCategory;
    }

    /**
     * 
     * @param topCategory
     *     The topCategory
     */
    public void setTopCategory(Integer topCategory) {
        this.topCategory = topCategory;
    }

}
