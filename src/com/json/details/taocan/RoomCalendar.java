package com.json.details.taocan;
import com.google.gson.annotations.Expose;

public class RoomCalendar {

    @Expose
    private Integer leftNumber;
    @Expose
    private Integer totalNumber;
    @Expose
    private Integer reserveNumber;
    @Expose
    private Integer outNumber;
    @Expose
    private String departsDate;
    @Expose
    private Integer adultPrice;
    @Expose
    private Integer childPrice;
    @Expose
    private Object singleChildPrice;
    @Expose
    private Integer singleAdultPrice;
    @Expose
    private Integer discountAdultPrice;
    @Expose
    private Object discountChildPrice;
    @Expose
    private Integer ruleType;

    /**
     * 
     * @return
     *     The leftNumber
     */
    public Integer getLeftNumber() {
        return leftNumber;
    }

    /**
     * 
     * @param leftNumber
     *     The leftNumber
     */
    public void setLeftNumber(Integer leftNumber) {
        this.leftNumber = leftNumber;
    }

    /**
     * 
     * @return
     *     The totalNumber
     */
    public Integer getTotalNumber() {
        return totalNumber;
    }

    /**
     * 
     * @param totalNumber
     *     The totalNumber
     */
    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    /**
     * 
     * @return
     *     The reserveNumber
     */
    public Integer getReserveNumber() {
        return reserveNumber;
    }

    /**
     * 
     * @param reserveNumber
     *     The reserveNumber
     */
    public void setReserveNumber(Integer reserveNumber) {
        this.reserveNumber = reserveNumber;
    }

    /**
     * 
     * @return
     *     The outNumber
     */
    public Integer getOutNumber() {
        return outNumber;
    }

    /**
     * 
     * @param outNumber
     *     The outNumber
     */
    public void setOutNumber(Integer outNumber) {
        this.outNumber = outNumber;
    }

    /**
     * 
     * @return
     *     The departsDate
     */
    public String getDepartsDate() {
        return departsDate;
    }

    /**
     * 
     * @param departsDate
     *     The departsDate
     */
    public void setDepartsDate(String departsDate) {
        this.departsDate = departsDate;
    }

    /**
     * 
     * @return
     *     The adultPrice
     */
    public Integer getAdultPrice() {
        return adultPrice;
    }

    /**
     * 
     * @param adultPrice
     *     The adultPrice
     */
    public void setAdultPrice(Integer adultPrice) {
        this.adultPrice = adultPrice;
    }

    /**
     * 
     * @return
     *     The childPrice
     */
    public Integer getChildPrice() {
        return childPrice;
    }

    /**
     * 
     * @param childPrice
     *     The childPrice
     */
    public void setChildPrice(Integer childPrice) {
        this.childPrice = childPrice;
    }

    /**
     * 
     * @return
     *     The singleChildPrice
     */
    public Object getSingleChildPrice() {
        return singleChildPrice;
    }

    /**
     * 
     * @param singleChildPrice
     *     The singleChildPrice
     */
    public void setSingleChildPrice(Object singleChildPrice) {
        this.singleChildPrice = singleChildPrice;
    }

    /**
     * 
     * @return
     *     The singleAdultPrice
     */
    public Integer getSingleAdultPrice() {
        return singleAdultPrice;
    }

    /**
     * 
     * @param singleAdultPrice
     *     The singleAdultPrice
     */
    public void setSingleAdultPrice(Integer singleAdultPrice) {
        this.singleAdultPrice = singleAdultPrice;
    }

    /**
     * 
     * @return
     *     The discountAdultPrice
     */
    public Integer getDiscountAdultPrice() {
        return discountAdultPrice;
    }

    /**
     * 
     * @param discountAdultPrice
     *     The discountAdultPrice
     */
    public void setDiscountAdultPrice(Integer discountAdultPrice) {
        this.discountAdultPrice = discountAdultPrice;
    }

    /**
     * 
     * @return
     *     The discountChildPrice
     */
    public Object getDiscountChildPrice() {
        return discountChildPrice;
    }

    /**
     * 
     * @param discountChildPrice
     *     The discountChildPrice
     */
    public void setDiscountChildPrice(Object discountChildPrice) {
        this.discountChildPrice = discountChildPrice;
    }

    /**
     * 
     * @return
     *     The ruleType
     */
    public Integer getRuleType() {
        return ruleType;
    }

    /**
     * 
     * @param ruleType
     *     The ruleType
     */
    public void setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
    }

}
