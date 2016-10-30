package com.json.home.detail.xingcheng;
import com.google.gson.annotations.Expose;

public class JourneyPeriodsTimeList {

    @Expose
    private String journeyTime;
    @Expose
    private String timeDesc;

    /**
     * 
     * @return
     *     The journeyTime
     */
    public String getJourneyTime() {
        return journeyTime;
    }

    /**
     * 
     * @param journeyTime
     *     The journeyTime
     */
    public void setJourneyTime(String journeyTime) {
        this.journeyTime = journeyTime;
    }

    /**
     * 
     * @return
     *     The timeDesc
     */
    public String getTimeDesc() {
        return timeDesc;
    }

    /**
     * 
     * @param timeDesc
     *     The timeDesc
     */
    public void setTimeDesc(String timeDesc) {
        this.timeDesc = timeDesc;
    }

}
