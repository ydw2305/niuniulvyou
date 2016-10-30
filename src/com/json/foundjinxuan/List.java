package com.json.foundjinxuan;
import com.google.gson.annotations.Expose;

public class List {

    @Expose
    private Common common;
    @Expose
    private Content content;
    @Expose
    private Integer itemType;
    @Expose
    private Tags tag;

    /**
     * 
     * @return
     *     The common
     */
    public Common getCommon() {
        return common;
    }

    /**
     * 
     * @param common
     *     The common
     */
    public void setCommon(Common common) {
        this.common = common;
    }

    /**
     * 
     * @return
     *     The content
     */
    public Content getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The content
     */
    public void setContent(Content content) {
        this.content = content;
    }

    /**
     * 
     * @return
     *     The itemType
     */
    public Integer getItemType() {
        return itemType;
    }

    /**
     * 
     * @param itemType
     *     The itemType
     */
    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    /**
     * 
     * @return
     *     The tag
     */
    public Tags getTag() {
        return tag;
    }

    /**
     * 
     * @param tag
     *     The tag
     */
    public void setTag(Tags tag) {
        this.tag = tag;
    }

}
