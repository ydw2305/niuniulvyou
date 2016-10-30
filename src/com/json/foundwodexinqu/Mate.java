package com.json.foundwodexinqu;
import com.google.gson.annotations.Expose;

public class Mate {

    @Expose
    private String departureDate;
    @Expose
    private String destination;
    @Expose
    private String startPoi;

    /**
     * 
     * @return
     *     The departureDate
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * 
     * @param departureDate
     *     The departureDate
     */
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    /**
     * 
     * @return
     *     The destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * 
     * @param destination
     *     The destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * 
     * @return
     *     The startPoi
     */
    public String getStartPoi() {
        return startPoi;
    }

    /**
     * 
     * @param startPoi
     *     The startPoi
     */
    public void setStartPoi(String startPoi) {
        this.startPoi = startPoi;
    }

}
