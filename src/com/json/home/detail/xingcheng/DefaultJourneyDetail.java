package com.json.home.detail.xingcheng;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class DefaultJourneyDetail {

    @Expose
    private Integer dayNum;
    @Expose
    private String journeyName;
    @Expose
    private String journeyIcon;
    @Expose
    private String journeyDescription;
    @Expose
    private String journeyInfor;
    @Expose
    private List<JourneyPeriodsTimeList> journeyPeriodsTimeList = new ArrayList<JourneyPeriodsTimeList>();
    @Expose
    private FoodAndStays foodAndStays;

    /**
     * 
     * @return
     *     The dayNum
     */
    public Integer getDayNum() {
        return dayNum;
    }

    /**
     * 
     * @param dayNum
     *     The dayNum
     */
    public void setDayNum(Integer dayNum) {
        this.dayNum = dayNum;
    }

    /**
     * 
     * @return
     *     The journeyName
     */
    public String getJourneyName() {
        return journeyName;
    }

    /**
     * 
     * @param journeyName
     *     The journeyName
     */
    public void setJourneyName(String journeyName) {
        this.journeyName = journeyName;
    }

    /**
     * 
     * @return
     *     The journeyIcon
     */
    public String getJourneyIcon() {
        return journeyIcon;
    }

    /**
     * 
     * @param journeyIcon
     *     The journeyIcon
     */
    public void setJourneyIcon(String journeyIcon) {
        this.journeyIcon = journeyIcon;
    }

    /**
     * 
     * @return
     *     The journeyDescription
     */
    public String getJourneyDescription() {
        return journeyDescription;
    }

    /**
     * 
     * @param journeyDescription
     *     The journeyDescription
     */
    public void setJourneyDescription(String journeyDescription) {
        this.journeyDescription = journeyDescription;
    }

    /**
     * 
     * @return
     *     The journeyInfor
     */
    public String getJourneyInfor() {
        return journeyInfor;
    }

    /**
     * 
     * @param journeyInfor
     *     The journeyInfor
     */
    public void setJourneyInfor(String journeyInfor) {
        this.journeyInfor = journeyInfor;
    }

    /**
     * 
     * @return
     *     The journeyPeriodsTimeList
     */
    public List<JourneyPeriodsTimeList> getJourneyPeriodsTimeList() {
        return journeyPeriodsTimeList;
    }

    /**
     * 
     * @param journeyPeriodsTimeList
     *     The journeyPeriodsTimeList
     */
    public void setJourneyPeriodsTimeList(List<JourneyPeriodsTimeList> journeyPeriodsTimeList) {
        this.journeyPeriodsTimeList = journeyPeriodsTimeList;
    }

    /**
     * 
     * @return
     *     The foodAndStays
     */
    public FoodAndStays getFoodAndStays() {
        return foodAndStays;
    }

    /**
     * 
     * @param foodAndStays
     *     The foodAndStays
     */
    public void setFoodAndStays(FoodAndStays foodAndStays) {
        this.foodAndStays = foodAndStays;
    }

}
