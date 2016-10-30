package com.json.details.taocan;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class Row {

    @Expose
    private String packageTitle;
    @Expose
    private Integer canChange;
    @Expose
    private Integer singlePrice;
    @Expose
    private Integer totalPrice;
    @Expose
    private Integer discountPrice;
    @Expose
    private List<Hotel> hotels = new ArrayList<Hotel>();
    @Expose
    private List<Object> trains = new ArrayList<Object>();
    @Expose
    private List<FlightTicket> flightTickets = new ArrayList<FlightTicket>();
    @Expose
    private List<String> labelList = new ArrayList<String>();
    @Expose
    private List<String> flightLabelList = new ArrayList<String>();
    @Expose
    private Object flightDiffPrice;
    @Expose
    private Object flightDiffAveragePrice;

    /**
     * 
     * @return
     *     The packageTitle
     */
    public String getPackageTitle() {
        return packageTitle;
    }

    /**
     * 
     * @param packageTitle
     *     The packageTitle
     */
    public void setPackageTitle(String packageTitle) {
        this.packageTitle = packageTitle;
    }

    /**
     * 
     * @return
     *     The canChange
     */
    public Integer getCanChange() {
        return canChange;
    }

    /**
     * 
     * @param canChange
     *     The canChange
     */
    public void setCanChange(Integer canChange) {
        this.canChange = canChange;
    }

    /**
     * 
     * @return
     *     The singlePrice
     */
    public Integer getSinglePrice() {
        return singlePrice;
    }

    /**
     * 
     * @param singlePrice
     *     The singlePrice
     */
    public void setSinglePrice(Integer singlePrice) {
        this.singlePrice = singlePrice;
    }

    /**
     * 
     * @return
     *     The totalPrice
     */
    public Integer getTotalPrice() {
        return totalPrice;
    }

    /**
     * 
     * @param totalPrice
     *     The totalPrice
     */
    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
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
     *     The hotels
     */
    public List<Hotel> getHotels() {
        return hotels;
    }

    /**
     * 
     * @param hotels
     *     The hotels
     */
    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    /**
     * 
     * @return
     *     The trains
     */
    public List<Object> getTrains() {
        return trains;
    }

    /**
     * 
     * @param trains
     *     The trains
     */
    public void setTrains(List<Object> trains) {
        this.trains = trains;
    }

    /**
     * 
     * @return
     *     The flightTickets
     */
    public List<FlightTicket> getFlightTickets() {
        return flightTickets;
    }

    /**
     * 
     * @param flightTickets
     *     The flightTickets
     */
    public void setFlightTickets(List<FlightTicket> flightTickets) {
        this.flightTickets = flightTickets;
    }

    /**
     * 
     * @return
     *     The labelList
     */
    public List<String> getLabelList() {
        return labelList;
    }

    /**
     * 
     * @param labelList
     *     The labelList
     */
    public void setLabelList(List<String> labelList) {
        this.labelList = labelList;
    }

    /**
     * 
     * @return
     *     The flightLabelList
     */
    public List<String> getFlightLabelList() {
        return flightLabelList;
    }

    /**
     * 
     * @param flightLabelList
     *     The flightLabelList
     */
    public void setFlightLabelList(List<String> flightLabelList) {
        this.flightLabelList = flightLabelList;
    }

    /**
     * 
     * @return
     *     The flightDiffPrice
     */
    public Object getFlightDiffPrice() {
        return flightDiffPrice;
    }

    /**
     * 
     * @param flightDiffPrice
     *     The flightDiffPrice
     */
    public void setFlightDiffPrice(Object flightDiffPrice) {
        this.flightDiffPrice = flightDiffPrice;
    }

    /**
     * 
     * @return
     *     The flightDiffAveragePrice
     */
    public Object getFlightDiffAveragePrice() {
        return flightDiffAveragePrice;
    }

    /**
     * 
     * @param flightDiffAveragePrice
     *     The flightDiffAveragePrice
     */
    public void setFlightDiffAveragePrice(Object flightDiffAveragePrice) {
        this.flightDiffAveragePrice = flightDiffAveragePrice;
    }

}
