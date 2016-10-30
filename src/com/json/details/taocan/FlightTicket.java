package com.json.details.taocan;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class FlightTicket {

    @Expose
    private Integer journeyNum;
    @Expose
    private String departsDate;
    @Expose
    private Integer resourceId;
    @Expose
    private Integer resourceType;
    @Expose
    private Integer resourceSubType;
    @Expose
    private Integer adultPrice;
    @Expose
    private Integer childPrice;
    @Expose
    private Integer inftPrice;
    @Expose
    private Integer singleAdultPrice;
    @Expose
    private Integer singleChildPrice;
    @Expose
    private Integer singleInftPrice;
    @Expose
    private Integer adultTaxes;
    @Expose
    private Integer childTaxes;
    @Expose
    private Object inftTaxes;
    @Expose
    private Integer adultDiscount;
    @Expose
    private Integer childDiscount;
    @Expose
    private Integer inftDiscount;
    @Expose
    private String seatStatus;
    @Expose
    private Object solutionId;
    @Expose
    private List<Flight> flights = new ArrayList<Flight>();
    @Expose
    private Object externalInfo;
    @Expose
    private Object queryId;
    @Expose
    private Integer policyId;
    @Expose
    private String seatTypeCode;
    @Expose
    private Object seatCode;
    @Expose
    private Object seatTypeCodeBack;
    @Expose
    private Object seatCodeBack;
    @Expose
    private Object saleControl;
    @Expose
    private Object saleControlBack;
    @Expose
    private Integer nationType;
    @Expose
    private Object nationTypeBack;
    @Expose
    private String resourceKey;
    @Expose
    private Object resourceKeyBack;
    @Expose
    private Object flightTips;
    @Expose
    private Object flightTipsBack;
    @Expose
    private Integer averagePrice;

    /**
     * 
     * @return
     *     The journeyNum
     */
    public Integer getJourneyNum() {
        return journeyNum;
    }

    /**
     * 
     * @param journeyNum
     *     The journeyNum
     */
    public void setJourneyNum(Integer journeyNum) {
        this.journeyNum = journeyNum;
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
     *     The resourceId
     */
    public Integer getResourceId() {
        return resourceId;
    }

    /**
     * 
     * @param resourceId
     *     The resourceId
     */
    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * 
     * @return
     *     The resourceType
     */
    public Integer getResourceType() {
        return resourceType;
    }

    /**
     * 
     * @param resourceType
     *     The resourceType
     */
    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * 
     * @return
     *     The resourceSubType
     */
    public Integer getResourceSubType() {
        return resourceSubType;
    }

    /**
     * 
     * @param resourceSubType
     *     The resourceSubType
     */
    public void setResourceSubType(Integer resourceSubType) {
        this.resourceSubType = resourceSubType;
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
     *     The inftPrice
     */
    public Integer getInftPrice() {
        return inftPrice;
    }

    /**
     * 
     * @param inftPrice
     *     The inftPrice
     */
    public void setInftPrice(Integer inftPrice) {
        this.inftPrice = inftPrice;
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
     *     The singleChildPrice
     */
    public Integer getSingleChildPrice() {
        return singleChildPrice;
    }

    /**
     * 
     * @param singleChildPrice
     *     The singleChildPrice
     */
    public void setSingleChildPrice(Integer singleChildPrice) {
        this.singleChildPrice = singleChildPrice;
    }

    /**
     * 
     * @return
     *     The singleInftPrice
     */
    public Integer getSingleInftPrice() {
        return singleInftPrice;
    }

    /**
     * 
     * @param singleInftPrice
     *     The singleInftPrice
     */
    public void setSingleInftPrice(Integer singleInftPrice) {
        this.singleInftPrice = singleInftPrice;
    }

    /**
     * 
     * @return
     *     The adultTaxes
     */
    public Integer getAdultTaxes() {
        return adultTaxes;
    }

    /**
     * 
     * @param adultTaxes
     *     The adultTaxes
     */
    public void setAdultTaxes(Integer adultTaxes) {
        this.adultTaxes = adultTaxes;
    }

    /**
     * 
     * @return
     *     The childTaxes
     */
    public Integer getChildTaxes() {
        return childTaxes;
    }

    /**
     * 
     * @param childTaxes
     *     The childTaxes
     */
    public void setChildTaxes(Integer childTaxes) {
        this.childTaxes = childTaxes;
    }

    /**
     * 
     * @return
     *     The inftTaxes
     */
    public Object getInftTaxes() {
        return inftTaxes;
    }

    /**
     * 
     * @param inftTaxes
     *     The inftTaxes
     */
    public void setInftTaxes(Object inftTaxes) {
        this.inftTaxes = inftTaxes;
    }

    /**
     * 
     * @return
     *     The adultDiscount
     */
    public Integer getAdultDiscount() {
        return adultDiscount;
    }

    /**
     * 
     * @param adultDiscount
     *     The adultDiscount
     */
    public void setAdultDiscount(Integer adultDiscount) {
        this.adultDiscount = adultDiscount;
    }

    /**
     * 
     * @return
     *     The childDiscount
     */
    public Integer getChildDiscount() {
        return childDiscount;
    }

    /**
     * 
     * @param childDiscount
     *     The childDiscount
     */
    public void setChildDiscount(Integer childDiscount) {
        this.childDiscount = childDiscount;
    }

    /**
     * 
     * @return
     *     The inftDiscount
     */
    public Integer getInftDiscount() {
        return inftDiscount;
    }

    /**
     * 
     * @param inftDiscount
     *     The inftDiscount
     */
    public void setInftDiscount(Integer inftDiscount) {
        this.inftDiscount = inftDiscount;
    }

    /**
     * 
     * @return
     *     The seatStatus
     */
    public String getSeatStatus() {
        return seatStatus;
    }

    /**
     * 
     * @param seatStatus
     *     The seatStatus
     */
    public void setSeatStatus(String seatStatus) {
        this.seatStatus = seatStatus;
    }

    /**
     * 
     * @return
     *     The solutionId
     */
    public Object getSolutionId() {
        return solutionId;
    }

    /**
     * 
     * @param solutionId
     *     The solutionId
     */
    public void setSolutionId(Object solutionId) {
        this.solutionId = solutionId;
    }

    /**
     * 
     * @return
     *     The flights
     */
    public List<Flight> getFlights() {
        return flights;
    }

    /**
     * 
     * @param flights
     *     The flights
     */
    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    /**
     * 
     * @return
     *     The externalInfo
     */
    public Object getExternalInfo() {
        return externalInfo;
    }

    /**
     * 
     * @param externalInfo
     *     The externalInfo
     */
    public void setExternalInfo(Object externalInfo) {
        this.externalInfo = externalInfo;
    }

    /**
     * 
     * @return
     *     The queryId
     */
    public Object getQueryId() {
        return queryId;
    }

    /**
     * 
     * @param queryId
     *     The queryId
     */
    public void setQueryId(Object queryId) {
        this.queryId = queryId;
    }

    /**
     * 
     * @return
     *     The policyId
     */
    public Integer getPolicyId() {
        return policyId;
    }

    /**
     * 
     * @param policyId
     *     The policyId
     */
    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    /**
     * 
     * @return
     *     The seatTypeCode
     */
    public String getSeatTypeCode() {
        return seatTypeCode;
    }

    /**
     * 
     * @param seatTypeCode
     *     The seatTypeCode
     */
    public void setSeatTypeCode(String seatTypeCode) {
        this.seatTypeCode = seatTypeCode;
    }

    /**
     * 
     * @return
     *     The seatCode
     */
    public Object getSeatCode() {
        return seatCode;
    }

    /**
     * 
     * @param seatCode
     *     The seatCode
     */
    public void setSeatCode(Object seatCode) {
        this.seatCode = seatCode;
    }

    /**
     * 
     * @return
     *     The seatTypeCodeBack
     */
    public Object getSeatTypeCodeBack() {
        return seatTypeCodeBack;
    }

    /**
     * 
     * @param seatTypeCodeBack
     *     The seatTypeCodeBack
     */
    public void setSeatTypeCodeBack(Object seatTypeCodeBack) {
        this.seatTypeCodeBack = seatTypeCodeBack;
    }

    /**
     * 
     * @return
     *     The seatCodeBack
     */
    public Object getSeatCodeBack() {
        return seatCodeBack;
    }

    /**
     * 
     * @param seatCodeBack
     *     The seatCodeBack
     */
    public void setSeatCodeBack(Object seatCodeBack) {
        this.seatCodeBack = seatCodeBack;
    }

    /**
     * 
     * @return
     *     The saleControl
     */
    public Object getSaleControl() {
        return saleControl;
    }

    /**
     * 
     * @param saleControl
     *     The saleControl
     */
    public void setSaleControl(Object saleControl) {
        this.saleControl = saleControl;
    }

    /**
     * 
     * @return
     *     The saleControlBack
     */
    public Object getSaleControlBack() {
        return saleControlBack;
    }

    /**
     * 
     * @param saleControlBack
     *     The saleControlBack
     */
    public void setSaleControlBack(Object saleControlBack) {
        this.saleControlBack = saleControlBack;
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
     *     The nationTypeBack
     */
    public Object getNationTypeBack() {
        return nationTypeBack;
    }

    /**
     * 
     * @param nationTypeBack
     *     The nationTypeBack
     */
    public void setNationTypeBack(Object nationTypeBack) {
        this.nationTypeBack = nationTypeBack;
    }

    /**
     * 
     * @return
     *     The resourceKey
     */
    public String getResourceKey() {
        return resourceKey;
    }

    /**
     * 
     * @param resourceKey
     *     The resourceKey
     */
    public void setResourceKey(String resourceKey) {
        this.resourceKey = resourceKey;
    }

    /**
     * 
     * @return
     *     The resourceKeyBack
     */
    public Object getResourceKeyBack() {
        return resourceKeyBack;
    }

    /**
     * 
     * @param resourceKeyBack
     *     The resourceKeyBack
     */
    public void setResourceKeyBack(Object resourceKeyBack) {
        this.resourceKeyBack = resourceKeyBack;
    }

    /**
     * 
     * @return
     *     The flightTips
     */
    public Object getFlightTips() {
        return flightTips;
    }

    /**
     * 
     * @param flightTips
     *     The flightTips
     */
    public void setFlightTips(Object flightTips) {
        this.flightTips = flightTips;
    }

    /**
     * 
     * @return
     *     The flightTipsBack
     */
    public Object getFlightTipsBack() {
        return flightTipsBack;
    }

    /**
     * 
     * @param flightTipsBack
     *     The flightTipsBack
     */
    public void setFlightTipsBack(Object flightTipsBack) {
        this.flightTipsBack = flightTipsBack;
    }

    /**
     * 
     * @return
     *     The averagePrice
     */
    public Integer getAveragePrice() {
        return averagePrice;
    }

    /**
     * 
     * @param averagePrice
     *     The averagePrice
     */
    public void setAveragePrice(Integer averagePrice) {
        this.averagePrice = averagePrice;
    }

}
