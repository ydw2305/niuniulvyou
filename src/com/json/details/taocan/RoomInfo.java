package com.json.details.taocan;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class RoomInfo {

    @Expose
    private Integer roomId;
    @Expose
    private String roomName;
    @Expose
    private Integer ratePlanId;
    @Expose
    private String ratePlanName;
    @Expose
    private Integer roomAmount;
    @Expose
    private String checkInDate;
    @Expose
    private String checkOutDate;
    @Expose
    private Integer days;
    @Expose
    private String bedType;
    @Expose
    private String breakfast;
    @Expose
    private String network;
    @Expose
    private Integer averageSingleAdultPrice;
    @Expose
    private Integer averageAdultPrice;
    @Expose
    private Integer discountPrice;
    @Expose
    private List<RoomCalendar> roomCalendar = new ArrayList<RoomCalendar>();
    @Expose
    private String calendarRange;
    @Expose
    private Integer vendorId;
    @Expose
    private Object vendorResId;
    @Expose
    private Object vendorHotelId;
    @Expose
    private Boolean stockPurchase;
    @Expose
    private Integer adultNum;
    @Expose
    private Integer childNum;

    /**
     * 
     * @return
     *     The roomId
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * 
     * @param roomId
     *     The roomId
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * 
     * @return
     *     The roomName
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * 
     * @param roomName
     *     The roomName
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * 
     * @return
     *     The ratePlanId
     */
    public Integer getRatePlanId() {
        return ratePlanId;
    }

    /**
     * 
     * @param ratePlanId
     *     The ratePlanId
     */
    public void setRatePlanId(Integer ratePlanId) {
        this.ratePlanId = ratePlanId;
    }

    /**
     * 
     * @return
     *     The ratePlanName
     */
    public String getRatePlanName() {
        return ratePlanName;
    }

    /**
     * 
     * @param ratePlanName
     *     The ratePlanName
     */
    public void setRatePlanName(String ratePlanName) {
        this.ratePlanName = ratePlanName;
    }

    /**
     * 
     * @return
     *     The roomAmount
     */
    public Integer getRoomAmount() {
        return roomAmount;
    }

    /**
     * 
     * @param roomAmount
     *     The roomAmount
     */
    public void setRoomAmount(Integer roomAmount) {
        this.roomAmount = roomAmount;
    }

    /**
     * 
     * @return
     *     The checkInDate
     */
    public String getCheckInDate() {
        return checkInDate;
    }

    /**
     * 
     * @param checkInDate
     *     The checkInDate
     */
    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    /**
     * 
     * @return
     *     The checkOutDate
     */
    public String getCheckOutDate() {
        return checkOutDate;
    }

    /**
     * 
     * @param checkOutDate
     *     The checkOutDate
     */
    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
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
     *     The bedType
     */
    public String getBedType() {
        return bedType;
    }

    /**
     * 
     * @param bedType
     *     The bedType
     */
    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    /**
     * 
     * @return
     *     The breakfast
     */
    public String getBreakfast() {
        return breakfast;
    }

    /**
     * 
     * @param breakfast
     *     The breakfast
     */
    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    /**
     * 
     * @return
     *     The network
     */
    public String getNetwork() {
        return network;
    }

    /**
     * 
     * @param network
     *     The network
     */
    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * 
     * @return
     *     The averageSingleAdultPrice
     */
    public Integer getAverageSingleAdultPrice() {
        return averageSingleAdultPrice;
    }

    /**
     * 
     * @param averageSingleAdultPrice
     *     The averageSingleAdultPrice
     */
    public void setAverageSingleAdultPrice(Integer averageSingleAdultPrice) {
        this.averageSingleAdultPrice = averageSingleAdultPrice;
    }

    /**
     * 
     * @return
     *     The averageAdultPrice
     */
    public Integer getAverageAdultPrice() {
        return averageAdultPrice;
    }

    /**
     * 
     * @param averageAdultPrice
     *     The averageAdultPrice
     */
    public void setAverageAdultPrice(Integer averageAdultPrice) {
        this.averageAdultPrice = averageAdultPrice;
    }

    /**
     * 
     * @return
     *     The discountPrice
     */
    public Integer getDiscountPrice() {
        return discountPrice;
    }

    /**
     * 
     * @param discountPrice
     *     The discountPrice
     */
    public void setDiscountPrice(Integer discountPrice) {
        this.discountPrice = discountPrice;
    }

    /**
     * 
     * @return
     *     The roomCalendar
     */
    public List<RoomCalendar> getRoomCalendar() {
        return roomCalendar;
    }

    /**
     * 
     * @param roomCalendar
     *     The roomCalendar
     */
    public void setRoomCalendar(List<RoomCalendar> roomCalendar) {
        this.roomCalendar = roomCalendar;
    }

    /**
     * 
     * @return
     *     The calendarRange
     */
    public String getCalendarRange() {
        return calendarRange;
    }

    /**
     * 
     * @param calendarRange
     *     The calendarRange
     */
    public void setCalendarRange(String calendarRange) {
        this.calendarRange = calendarRange;
    }

    /**
     * 
     * @return
     *     The vendorId
     */
    public Integer getVendorId() {
        return vendorId;
    }

    /**
     * 
     * @param vendorId
     *     The vendorId
     */
    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    /**
     * 
     * @return
     *     The vendorResId
     */
    public Object getVendorResId() {
        return vendorResId;
    }

    /**
     * 
     * @param vendorResId
     *     The vendorResId
     */
    public void setVendorResId(Object vendorResId) {
        this.vendorResId = vendorResId;
    }

    /**
     * 
     * @return
     *     The vendorHotelId
     */
    public Object getVendorHotelId() {
        return vendorHotelId;
    }

    /**
     * 
     * @param vendorHotelId
     *     The vendorHotelId
     */
    public void setVendorHotelId(Object vendorHotelId) {
        this.vendorHotelId = vendorHotelId;
    }

    /**
     * 
     * @return
     *     The stockPurchase
     */
    public Boolean getStockPurchase() {
        return stockPurchase;
    }

    /**
     * 
     * @param stockPurchase
     *     The stockPurchase
     */
    public void setStockPurchase(Boolean stockPurchase) {
        this.stockPurchase = stockPurchase;
    }

    /**
     * 
     * @return
     *     The adultNum
     */
    public Integer getAdultNum() {
        return adultNum;
    }

    /**
     * 
     * @param adultNum
     *     The adultNum
     */
    public void setAdultNum(Integer adultNum) {
        this.adultNum = adultNum;
    }

    /**
     * 
     * @return
     *     The childNum
     */
    public Integer getChildNum() {
        return childNum;
    }

    /**
     * 
     * @param childNum
     *     The childNum
     */
    public void setChildNum(Integer childNum) {
        this.childNum = childNum;
    }

}
