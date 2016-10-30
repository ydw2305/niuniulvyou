package com.json.home.detail.xiangguan;

import com.google.gson.annotations.Expose;

public class LabelImgListNew {

    @Expose
    private String labelText;
    @Expose
    private String labelColorValue;
    @Expose
    private String labelImgUrl;

    /**
     * 
     * @return
     *     The labelText
     */
    public String getLabelText() {
        return labelText;
    }

    /**
     * 
     * @param labelText
     *     The labelText
     */
    public void setLabelText(String labelText) {
        this.labelText = labelText;
    }

    /**
     * 
     * @return
     *     The labelColorValue
     */
    public String getLabelColorValue() {
        return labelColorValue;
    }

    /**
     * 
     * @param labelColorValue
     *     The labelColorValue
     */
    public void setLabelColorValue(String labelColorValue) {
        this.labelColorValue = labelColorValue;
    }

    /**
     * 
     * @return
     *     The labelImgUrl
     */
    public String getLabelImgUrl() {
        return labelImgUrl;
    }

    /**
     * 
     * @param labelImgUrl
     *     The labelImgUrl
     */
    public void setLabelImgUrl(String labelImgUrl) {
        this.labelImgUrl = labelImgUrl;
    }

}
