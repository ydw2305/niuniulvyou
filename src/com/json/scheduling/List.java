package com.json.scheduling;

import com.google.gson.annotations.Expose;

public class List {

    @Expose
    private Integer playId;
    @Expose
    private String title;
    @Expose
    private String image;
    @Expose
    private Integer hotLevel;
    @Expose
    private String feature;

    /**
     * 
     * @return
     *     The playId
     */
    public Integer getPlayId() {
        return playId;
    }

    /**
     * 
     * @param playId
     *     The playId
     */
    public void setPlayId(Integer playId) {
        this.playId = playId;
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
     *     The image
     */
    public String getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The hotLevel
     */
    public Integer getHotLevel() {
        return hotLevel;
    }

    /**
     * 
     * @param hotLevel
     *     The hotLevel
     */
    public void setHotLevel(Integer hotLevel) {
        this.hotLevel = hotLevel;
    }

    /**
     * 
     * @return
     *     The feature
     */
    public String getFeature() {
        return feature;
    }

    /**
     * 
     * @param feature
     *     The feature
     */
    public void setFeature(String feature) {
        this.feature = feature;
    }

}
