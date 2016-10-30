package com.json.home.detail.xingcheng;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class JourneyBaseInfo {

    @Expose
    private Integer journeyId;
    @Expose
    private String journeyName;
    @Expose
    private String journeyAbstractDesc;
    @Expose
    private Integer dayDuration;
    @Expose
    private Integer nightDuration;
    @Expose
    private List<String> planDate = new ArrayList<String>();
    @Expose
    private String planDateStr;

    /**
     * 
     * @return
     *     The journeyId
     */
    public Integer getJourneyId() {
        return journeyId;
    }

    /**
     * 
     * @param journeyId
     *     The journeyId
     */
    public void setJourneyId(Integer journeyId) {
        this.journeyId = journeyId;
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
     *     The journeyAbstractDesc
     */
    public String getJourneyAbstractDesc() {
        return journeyAbstractDesc;
    }

    /**
     * 
     * @param journeyAbstractDesc
     *     The journeyAbstractDesc
     */
    public void setJourneyAbstractDesc(String journeyAbstractDesc) {
        this.journeyAbstractDesc = journeyAbstractDesc;
    }

    /**
     * 
     * @return
     *     The dayDuration
     */
    public Integer getDayDuration() {
        return dayDuration;
    }

    /**
     * 
     * @param dayDuration
     *     The dayDuration
     */
    public void setDayDuration(Integer dayDuration) {
        this.dayDuration = dayDuration;
    }

    /**
     * 
     * @return
     *     The nightDuration
     */
    public Integer getNightDuration() {
        return nightDuration;
    }

    /**
     * 
     * @param nightDuration
     *     The nightDuration
     */
    public void setNightDuration(Integer nightDuration) {
        this.nightDuration = nightDuration;
    }

    /**
     * 
     * @return
     *     The planDate
     */
    public List<String> getPlanDate() {
        return planDate;
    }

    /**
     * 
     * @param planDate
     *     The planDate
     */
    public void setPlanDate(List<String> planDate) {
        this.planDate = planDate;
    }

    /**
     * 
     * @return
     *     The planDateStr
     */
    public String getPlanDateStr() {
        return planDateStr;
    }

    /**
     * 
     * @param planDateStr
     *     The planDateStr
     */
    public void setPlanDateStr(String planDateStr) {
        this.planDateStr = planDateStr;
    }

}
