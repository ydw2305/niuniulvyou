package com.json.details.taocan;
import com.google.gson.annotations.Expose;

public class Hotel {

    @Expose
    private Integer hotelId;
    @Expose
    private String hotelName;
    @Expose
    private Integer starCode;
    @Expose
    private Object address;
    @Expose
    private Double latitude;
    @Expose
    private Double longitude;
    @Expose
    private String starDesc;
    @Expose
    private String hotelImg;
    @Expose
    private Integer cityCode;
    @Expose
    private String cityName;
    @Expose
    private RoomInfo roomInfo;
    @Expose
    private Integer isHide;
    @Expose
    private Boolean newHotel;
    @Expose
    private Integer nationType;
    @Expose
    private Integer adult;
    @Expose
    private Integer child;
    @Expose
    private Object childAges;

    /**
     * 
     * @return
     *     The hotelId
     */
    public Integer getHotelId() {
        return hotelId;
    }

    /**
     * 
     * @param hotelId
     *     The hotelId
     */
    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * 
     * @return
     *     The hotelName
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * 
     * @param hotelName
     *     The hotelName
     */
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    /**
     * 
     * @return
     *     The starCode
     */
    public Integer getStarCode() {
        return starCode;
    }

    /**
     * 
     * @param starCode
     *     The starCode
     */
    public void setStarCode(Integer starCode) {
        this.starCode = starCode;
    }

    /**
     * 
     * @return
     *     The address
     */
    public Object getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(Object address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The starDesc
     */
    public String getStarDesc() {
        return starDesc;
    }

    /**
     * 
     * @param starDesc
     *     The starDesc
     */
    public void setStarDesc(String starDesc) {
        this.starDesc = starDesc;
    }

    /**
     * 
     * @return
     *     The hotelImg
     */
    public String getHotelImg() {
        return hotelImg;
    }

    /**
     * 
     * @param hotelImg
     *     The hotelImg
     */
    public void setHotelImg(String hotelImg) {
        this.hotelImg = hotelImg;
    }

    /**
     * 
     * @return
     *     The cityCode
     */
    public Integer getCityCode() {
        return cityCode;
    }

    /**
     * 
     * @param cityCode
     *     The cityCode
     */
    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * 
     * @return
     *     The cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 
     * @param cityName
     *     The cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 
     * @return
     *     The roomInfo
     */
    public RoomInfo getRoomInfo() {
        return roomInfo;
    }

    /**
     * 
     * @param roomInfo
     *     The roomInfo
     */
    public void setRoomInfo(RoomInfo roomInfo) {
        this.roomInfo = roomInfo;
    }

    /**
     * 
     * @return
     *     The isHide
     */
    public Integer getIsHide() {
        return isHide;
    }

    /**
     * 
     * @param isHide
     *     The isHide
     */
    public void setIsHide(Integer isHide) {
        this.isHide = isHide;
    }

    /**
     * 
     * @return
     *     The newHotel
     */
    public Boolean getNewHotel() {
        return newHotel;
    }

    /**
     * 
     * @param newHotel
     *     The newHotel
     */
    public void setNewHotel(Boolean newHotel) {
        this.newHotel = newHotel;
    }

    /**
     * 
     * @return
     *     The nationType
     */
    public Integer getNationType() {
        return nationType;
    }

    /**
     * 
     * @param nationType
     *     The nationType
     */
    public void setNationType(Integer nationType) {
        this.nationType = nationType;
    }

    /**
     * 
     * @return
     *     The adult
     */
    public Integer getAdult() {
        return adult;
    }

    /**
     * 
     * @param adult
     *     The adult
     */
    public void setAdult(Integer adult) {
        this.adult = adult;
    }

    /**
     * 
     * @return
     *     The child
     */
    public Integer getChild() {
        return child;
    }

    /**
     * 
     * @param child
     *     The child
     */
    public void setChild(Integer child) {
        this.child = child;
    }

    /**
     * 
     * @return
     *     The childAges
     */
    public Object getChildAges() {
        return childAges;
    }

    /**
     * 
     * @param childAges
     *     The childAges
     */
    public void setChildAges(Object childAges) {
        this.childAges = childAges;
    }

}
