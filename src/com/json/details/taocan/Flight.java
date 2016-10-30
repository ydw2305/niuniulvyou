package com.json.details.taocan;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class Flight {

    @Expose
    private String flightNo;
    @Expose
    private String airlineCompany;
    @Expose
    private String departureTime;
    @Expose
    private String arrivalTime;
    @Expose
    private String duration;
    @Expose
    private String dPortStName;
    @Expose
    private String dTerminal;
    @Expose
    private String aPortStName;
    @Expose
    private String aTerminal;
    @Expose
    private Integer days;
    @Expose
    private String departureDate;
    @Expose
    private String arrivalDate;
    @Expose
    private String dCityName;
    @Expose
    private String aCityName;
    @Expose
    private String craftTypeName;
    @Expose
    private String cabinName;
    @Expose
    private Integer dCityCode;
    @Expose
    private Integer aCityCode;
    @Expose
    private Integer isStopOver;
    @Expose
    private List<Object> stopPointList = new ArrayList<Object>();
    @Expose
    private Integer isTransit;
    @Expose
    private Object transferInfo;
    @Expose
    private Object transitFlightDetails;
    @Expose
    private Object dCityIataCode;
    @Expose
    private Object aCityIataCode;
    @Expose
    private Object nationType;

    /**
     * 
     * @return
     *     The flightNo
     */
    public String getFlightNo() {
        return flightNo;
    }

    /**
     * 
     * @param flightNo
     *     The flightNo
     */
    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    /**
     * 
     * @return
     *     The airlineCompany
     */
    public String getAirlineCompany() {
        return airlineCompany;
    }

    /**
     * 
     * @param airlineCompany
     *     The airlineCompany
     */
    public void setAirlineCompany(String airlineCompany) {
        this.airlineCompany = airlineCompany;
    }

    /**
     * 
     * @return
     *     The departureTime
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * 
     * @param departureTime
     *     The departureTime
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * 
     * @return
     *     The arrivalTime
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * 
     * @param arrivalTime
     *     The arrivalTime
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * 
     * @return
     *     The duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     *     The dPortStName
     */
    public String getDPortStName() {
        return dPortStName;
    }

    /**
     * 
     * @param dPortStName
     *     The dPortStName
     */
    public void setDPortStName(String dPortStName) {
        this.dPortStName = dPortStName;
    }

    /**
     * 
     * @return
     *     The dTerminal
     */
    public String getDTerminal() {
        return dTerminal;
    }

    /**
     * 
     * @param dTerminal
     *     The dTerminal
     */
    public void setDTerminal(String dTerminal) {
        this.dTerminal = dTerminal;
    }

    /**
     * 
     * @return
     *     The aPortStName
     */
    public String getAPortStName() {
        return aPortStName;
    }

    /**
     * 
     * @param aPortStName
     *     The aPortStName
     */
    public void setAPortStName(String aPortStName) {
        this.aPortStName = aPortStName;
    }

    /**
     * 
     * @return
     *     The aTerminal
     */
    public String getATerminal() {
        return aTerminal;
    }

    /**
     * 
     * @param aTerminal
     *     The aTerminal
     */
    public void setATerminal(String aTerminal) {
        this.aTerminal = aTerminal;
    }

    /**
     * 
     * @return
     *     The days
     */
    public Integer getDays() {
        return days;
    }

    /**
     * 
     * @param days
     *     The days
     */
    public void setDays(Integer days) {
        this.days = days;
    }

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
     *     The arrivalDate
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * 
     * @param arrivalDate
     *     The arrivalDate
     */
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    /**
     * 
     * @return
     *     The dCityName
     */
    public String getDCityName() {
        return dCityName;
    }

    /**
     * 
     * @param dCityName
     *     The dCityName
     */
    public void setDCityName(String dCityName) {
        this.dCityName = dCityName;
    }

    /**
     * 
     * @return
     *     The aCityName
     */
    public String getACityName() {
        return aCityName;
    }

    /**
     * 
     * @param aCityName
     *     The aCityName
     */
    public void setACityName(String aCityName) {
        this.aCityName = aCityName;
    }

    /**
     * 
     * @return
     *     The craftTypeName
     */
    public String getCraftTypeName() {
        return craftTypeName;
    }

    /**
     * 
     * @param craftTypeName
     *     The craftTypeName
     */
    public void setCraftTypeName(String craftTypeName) {
        this.craftTypeName = craftTypeName;
    }

    /**
     * 
     * @return
     *     The cabinName
     */
    public String getCabinName() {
        return cabinName;
    }

    /**
     * 
     * @param cabinName
     *     The cabinName
     */
    public void setCabinName(String cabinName) {
        this.cabinName = cabinName;
    }

    /**
     * 
     * @return
     *     The dCityCode
     */
    public Integer getDCityCode() {
        return dCityCode;
    }

    /**
     * 
     * @param dCityCode
     *     The dCityCode
     */
    public void setDCityCode(Integer dCityCode) {
        this.dCityCode = dCityCode;
    }

    /**
     * 
     * @return
     *     The aCityCode
     */
    public Integer getACityCode() {
        return aCityCode;
    }

    /**
     * 
     * @param aCityCode
     *     The aCityCode
     */
    public void setACityCode(Integer aCityCode) {
        this.aCityCode = aCityCode;
    }

    /**
     * 
     * @return
     *     The isStopOver
     */
    public Integer getIsStopOver() {
        return isStopOver;
    }

    /**
     * 
     * @param isStopOver
     *     The isStopOver
     */
    public void setIsStopOver(Integer isStopOver) {
        this.isStopOver = isStopOver;
    }

    /**
     * 
     * @return
     *     The stopPointList
     */
    public List<Object> getStopPointList() {
        return stopPointList;
    }

    /**
     * 
     * @param stopPointList
     *     The stopPointList
     */
    public void setStopPointList(List<Object> stopPointList) {
        this.stopPointList = stopPointList;
    }

    /**
     * 
     * @return
     *     The isTransit
     */
    public Integer getIsTransit() {
        return isTransit;
    }

    /**
     * 
     * @param isTransit
     *     The isTransit
     */
    public void setIsTransit(Integer isTransit) {
        this.isTransit = isTransit;
    }

    /**
     * 
     * @return
     *     The transferInfo
     */
    public Object getTransferInfo() {
        return transferInfo;
    }

    /**
     * 
     * @param transferInfo
     *     The transferInfo
     */
    public void setTransferInfo(Object transferInfo) {
        this.transferInfo = transferInfo;
    }

    /**
     * 
     * @return
     *     The transitFlightDetails
     */
    public Object getTransitFlightDetails() {
        return transitFlightDetails;
    }

    /**
     * 
     * @param transitFlightDetails
     *     The transitFlightDetails
     */
    public void setTransitFlightDetails(Object transitFlightDetails) {
        this.transitFlightDetails = transitFlightDetails;
    }

    /**
     * 
     * @return
     *     The dCityIataCode
     */
    public Object getDCityIataCode() {
        return dCityIataCode;
    }

    /**
     * 
     * @param dCityIataCode
     *     The dCityIataCode
     */
    public void setDCityIataCode(Object dCityIataCode) {
        this.dCityIataCode = dCityIataCode;
    }

    /**
     * 
     * @return
     *     The aCityIataCode
     */
    public Object getACityIataCode() {
        return aCityIataCode;
    }

    /**
     * 
     * @param aCityIataCode
     *     The aCityIataCode
     */
    public void setACityIataCode(Object aCityIataCode) {
        this.aCityIataCode = aCityIataCode;
    }

    /**
     * 
     * @return
     *     The nationType
     */
    public Object getNationType() {
        return nationType;
    }

    /**
     * 
     * @param nationType
     *     The nationType
     */
    public void setNationType(Object nationType) {
        this.nationType = nationType;
    }

}
