package com.json.home.detail.xingcheng;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class JourneyDetailList {

    @Expose
    private Integer isDefaultJourney;
    @Expose
    private JourneyBaseInfo journeyBaseInfo;
    @Expose
    private List<DefaultJourneyDetail> defaultJourneyDetail = new ArrayList<DefaultJourneyDetail>();
    @Expose
    private List<BookNotice> bookNotice = new ArrayList<BookNotice>();
    @Expose
    private List<CostInclude> costInclude = new ArrayList<CostInclude>();
    @Expose
    private List<CostExclude> costExclude = new ArrayList<CostExclude>();
    @Expose
    private List<TourRecommend> tourRecommend = new ArrayList<TourRecommend>();
    @Expose
    private Object shopRecommend;
    @Expose
    private Object activeRecommend;
    @Expose
    private Integer hasVisaFlag;
    @Expose
    private OtherJourneyDetail otherJourneyDetail;
    @Expose
    private Object recommendNote;

    /**
     * 
     * @return
     *     The isDefaultJourney
     */
    public Integer getIsDefaultJourney() {
        return isDefaultJourney;
    }

    /**
     * 
     * @param isDefaultJourney
     *     The isDefaultJourney
     */
    public void setIsDefaultJourney(Integer isDefaultJourney) {
        this.isDefaultJourney = isDefaultJourney;
    }

    /**
     * 
     * @return
     *     The journeyBaseInfo
     */
    public JourneyBaseInfo getJourneyBaseInfo() {
        return journeyBaseInfo;
    }

    /**
     * 
     * @param journeyBaseInfo
     *     The journeyBaseInfo
     */
    public void setJourneyBaseInfo(JourneyBaseInfo journeyBaseInfo) {
        this.journeyBaseInfo = journeyBaseInfo;
    }

    /**
     * 
     * @return
     *     The defaultJourneyDetail
     */
    public List<DefaultJourneyDetail> getDefaultJourneyDetail() {
        return defaultJourneyDetail;
    }

    /**
     * 
     * @param defaultJourneyDetail
     *     The defaultJourneyDetail
     */
    public void setDefaultJourneyDetail(List<DefaultJourneyDetail> defaultJourneyDetail) {
        this.defaultJourneyDetail = defaultJourneyDetail;
    }

    /**
     * 
     * @return
     *     The bookNotice
     */
    public List<BookNotice> getBookNotice() {
        return bookNotice;
    }

    /**
     * 
     * @param bookNotice
     *     The bookNotice
     */
    public void setBookNotice(List<BookNotice> bookNotice) {
        this.bookNotice = bookNotice;
    }

    /**
     * 
     * @return
     *     The costInclude
     */
    public List<CostInclude> getCostInclude() {
        return costInclude;
    }

    /**
     * 
     * @param costInclude
     *     The costInclude
     */
    public void setCostInclude(List<CostInclude> costInclude) {
        this.costInclude = costInclude;
    }

    /**
     * 
     * @return
     *     The costExclude
     */
    public List<CostExclude> getCostExclude() {
        return costExclude;
    }

    /**
     * 
     * @param costExclude
     *     The costExclude
     */
    public void setCostExclude(List<CostExclude> costExclude) {
        this.costExclude = costExclude;
    }

    /**
     * 
     * @return
     *     The tourRecommend
     */
    public List<TourRecommend> getTourRecommend() {
        return tourRecommend;
    }

    /**
     * 
     * @param tourRecommend
     *     The tourRecommend
     */
    public void setTourRecommend(List<TourRecommend> tourRecommend) {
        this.tourRecommend = tourRecommend;
    }

    /**
     * 
     * @return
     *     The shopRecommend
     */
    public Object getShopRecommend() {
        return shopRecommend;
    }

    /**
     * 
     * @param shopRecommend
     *     The shopRecommend
     */
    public void setShopRecommend(Object shopRecommend) {
        this.shopRecommend = shopRecommend;
    }

    /**
     * 
     * @return
     *     The activeRecommend
     */
    public Object getActiveRecommend() {
        return activeRecommend;
    }

    /**
     * 
     * @param activeRecommend
     *     The activeRecommend
     */
    public void setActiveRecommend(Object activeRecommend) {
        this.activeRecommend = activeRecommend;
    }

    /**
     * 
     * @return
     *     The hasVisaFlag
     */
    public Integer getHasVisaFlag() {
        return hasVisaFlag;
    }

    /**
     * 
     * @param hasVisaFlag
     *     The hasVisaFlag
     */
    public void setHasVisaFlag(Integer hasVisaFlag) {
        this.hasVisaFlag = hasVisaFlag;
    }

    /**
     * 
     * @return
     *     The otherJourneyDetail
     */
    public OtherJourneyDetail getOtherJourneyDetail() {
        return otherJourneyDetail;
    }

    /**
     * 
     * @param otherJourneyDetail
     *     The otherJourneyDetail
     */
    public void setOtherJourneyDetail(OtherJourneyDetail otherJourneyDetail) {
        this.otherJourneyDetail = otherJourneyDetail;
    }

    /**
     * 
     * @return
     *     The recommendNote
     */
    public Object getRecommendNote() {
        return recommendNote;
    }

    /**
     * 
     * @param recommendNote
     *     The recommendNote
     */
    public void setRecommendNote(Object recommendNote) {
        this.recommendNote = recommendNote;
    }

}
