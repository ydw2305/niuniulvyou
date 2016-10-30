package com.json.home.detail.xingcheng;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class Data {

    @Expose
    private Integer multiJourneyFlag;
    @Expose
    private List<JourneyDetailList> journeyDetailList = new ArrayList<JourneyDetailList>();
    @Expose
    private String characteristic;
    @Expose
    private String productManagerImage;
    @Expose
    private List<String> recommendTags = new ArrayList<String>();
    @Expose
    private String visaInfoUrl;

    /**
     * 
     * @return
     *     The multiJourneyFlag
     */
    public Integer getMultiJourneyFlag() {
        return multiJourneyFlag;
    }

    /**
     * 
     * @param multiJourneyFlag
     *     The multiJourneyFlag
     */
    public void setMultiJourneyFlag(Integer multiJourneyFlag) {
        this.multiJourneyFlag = multiJourneyFlag;
    }

    /**
     * 
     * @return
     *     The journeyDetailList
     */
    public List<JourneyDetailList> getJourneyDetailList() {
        return journeyDetailList;
    }

    /**
     * 
     * @param journeyDetailList
     *     The journeyDetailList
     */
    public void setJourneyDetailList(List<JourneyDetailList> journeyDetailList) {
        this.journeyDetailList = journeyDetailList;
    }

    /**
     * 
     * @return
     *     The characteristic
     */
    public String getCharacteristic() {
        return characteristic;
    }

    /**
     * 
     * @param characteristic
     *     The characteristic
     */
    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    /**
     * 
     * @return
     *     The productManagerImage
     */
    public String getProductManagerImage() {
        return productManagerImage;
    }

    /**
     * 
     * @param productManagerImage
     *     The productManagerImage
     */
    public void setProductManagerImage(String productManagerImage) {
        this.productManagerImage = productManagerImage;
    }

    /**
     * 
     * @return
     *     The recommendTags
     */
    public List<String> getRecommendTags() {
        return recommendTags;
    }

    /**
     * 
     * @param recommendTags
     *     The recommendTags
     */
    public void setRecommendTags(List<String> recommendTags) {
        this.recommendTags = recommendTags;
    }

    /**
     * 
     * @return
     *     The visaInfoUrl
     */
    public String getVisaInfoUrl() {
        return visaInfoUrl;
    }

    /**
     * 
     * @param visaInfoUrl
     *     The visaInfoUrl
     */
    public void setVisaInfoUrl(String visaInfoUrl) {
        this.visaInfoUrl = visaInfoUrl;
    }

}
