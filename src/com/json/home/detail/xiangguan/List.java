package com.json.home.detail.xiangguan;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;

public class List {

    @Expose
    private String productId;
    @Expose
    private String name;
    @Expose
    private String mainName;
    @Expose
    private String subName;
    @Expose
    private Integer productType;
    @Expose
    private Integer iconType;
    @Expose
    private String category;
    @Expose
    private Integer startCity;
    @Expose
    private String startCityName;
    @Expose
    private String largeImage;
    @Expose
    private String smallImage;
    @Expose
    private Integer lowestPromoPrice;
    @Expose
    private Integer lowestPrice;
    @Expose
    private Integer travelCount;
    @Expose
    private Integer remarkCount;
    @Expose
    private String countDesc;
    @Expose
    private Integer satisfaction;
    @Expose
    private String satisfactionDesc;
    @Expose
    private Integer niuLineFlag;
    @Expose
    private Integer guaGuoFlag;
    @Expose
    private java.util.List<Integer> promoTypes = new ArrayList<Integer>();
    @Expose
    private String promoIcon;
    @Expose
    private String maximumStay;
    @Expose
    private String entryTimes;
    @Expose
    private PromoIcoInfo promoIcoInfo;
    @Expose
    private Boolean onSale;
    @Expose
    private String onSaleUrl;
    @Expose
    private java.util.List<String> planDates = new ArrayList<String>();
    @Expose
    private String newPicUrl;
    @Expose
    private Integer activityType;
    @Expose
    private String activityTypeDesc;
    @Expose
    private Integer distance;
    @Expose
    private String glocation;
    @Expose
    private String groupCityName;
    @Expose
    private String mainPoiCityName;
    @Expose
    private Boolean isSameTopic;
    @Expose
    private Integer topicId;
    @Expose
    private String topicImg;
    @Expose
    private Integer salePrice;
    @Expose
    private String recommend;
    @Expose
    private String brandType;
    @Expose
    private java.util.List<String> saleChannel = new ArrayList<String>();
    @Expose
    private java.util.List<String> productFeature = new ArrayList<String>();
    @Expose
    private String id;
    @Expose
    private Integer classBrandId;
    @Expose
    private java.util.List<LabelImgListNew> labelImgListNew = new ArrayList<LabelImgListNew>();

    /**
     * 
     * @return
     *     The productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 
     * @param productId
     *     The productId
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The mainName
     */
    public String getMainName() {
        return mainName;
    }

    /**
     * 
     * @param mainName
     *     The mainName
     */
    public void setMainName(String mainName) {
        this.mainName = mainName;
    }

    /**
     * 
     * @return
     *     The subName
     */
    public String getSubName() {
        return subName;
    }

    /**
     * 
     * @param subName
     *     The subName
     */
    public void setSubName(String subName) {
        this.subName = subName;
    }

    /**
     * 
     * @return
     *     The productType
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * 
     * @param productType
     *     The productType
     */
    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    /**
     * 
     * @return
     *     The iconType
     */
    public Integer getIconType() {
        return iconType;
    }

    /**
     * 
     * @param iconType
     *     The iconType
     */
    public void setIconType(Integer iconType) {
        this.iconType = iconType;
    }

    /**
     * 
     * @return
     *     The category
     */
    public String getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 
     * @return
     *     The startCity
     */
    public Integer getStartCity() {
        return startCity;
    }

    /**
     * 
     * @param startCity
     *     The startCity
     */
    public void setStartCity(Integer startCity) {
        this.startCity = startCity;
    }

    /**
     * 
     * @return
     *     The startCityName
     */
    public String getStartCityName() {
        return startCityName;
    }

    /**
     * 
     * @param startCityName
     *     The startCityName
     */
    public void setStartCityName(String startCityName) {
        this.startCityName = startCityName;
    }

    /**
     * 
     * @return
     *     The largeImage
     */
    public String getLargeImage() {
        return largeImage;
    }

    /**
     * 
     * @param largeImage
     *     The largeImage
     */
    public void setLargeImage(String largeImage) {
        this.largeImage = largeImage;
    }

    /**
     * 
     * @return
     *     The smallImage
     */
    public String getSmallImage() {
        return smallImage;
    }

    /**
     * 
     * @param smallImage
     *     The smallImage
     */
    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    /**
     * 
     * @return
     *     The lowestPromoPrice
     */
    public Integer getLowestPromoPrice() {
        return lowestPromoPrice;
    }

    /**
     * 
     * @param lowestPromoPrice
     *     The lowestPromoPrice
     */
    public void setLowestPromoPrice(Integer lowestPromoPrice) {
        this.lowestPromoPrice = lowestPromoPrice;
    }

    /**
     * 
     * @return
     *     The lowestPrice
     */
    public Integer getLowestPrice() {
        return lowestPrice;
    }

    /**
     * 
     * @param lowestPrice
     *     The lowestPrice
     */
    public void setLowestPrice(Integer lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    /**
     * 
     * @return
     *     The travelCount
     */
    public Integer getTravelCount() {
        return travelCount;
    }

    /**
     * 
     * @param travelCount
     *     The travelCount
     */
    public void setTravelCount(Integer travelCount) {
        this.travelCount = travelCount;
    }

    /**
     * 
     * @return
     *     The remarkCount
     */
    public Integer getRemarkCount() {
        return remarkCount;
    }

    /**
     * 
     * @param remarkCount
     *     The remarkCount
     */
    public void setRemarkCount(Integer remarkCount) {
        this.remarkCount = remarkCount;
    }

    /**
     * 
     * @return
     *     The countDesc
     */
    public String getCountDesc() {
        return countDesc;
    }

    /**
     * 
     * @param countDesc
     *     The countDesc
     */
    public void setCountDesc(String countDesc) {
        this.countDesc = countDesc;
    }

    /**
     * 
     * @return
     *     The satisfaction
     */
    public Integer getSatisfaction() {
        return satisfaction;
    }

    /**
     * 
     * @param satisfaction
     *     The satisfaction
     */
    public void setSatisfaction(Integer satisfaction) {
        this.satisfaction = satisfaction;
    }

    /**
     * 
     * @return
     *     The satisfactionDesc
     */
    public String getSatisfactionDesc() {
        return satisfactionDesc;
    }

    /**
     * 
     * @param satisfactionDesc
     *     The satisfactionDesc
     */
    public void setSatisfactionDesc(String satisfactionDesc) {
        this.satisfactionDesc = satisfactionDesc;
    }

    /**
     * 
     * @return
     *     The niuLineFlag
     */
    public Integer getNiuLineFlag() {
        return niuLineFlag;
    }

    /**
     * 
     * @param niuLineFlag
     *     The niuLineFlag
     */
    public void setNiuLineFlag(Integer niuLineFlag) {
        this.niuLineFlag = niuLineFlag;
    }

    /**
     * 
     * @return
     *     The guaGuoFlag
     */
    public Integer getGuaGuoFlag() {
        return guaGuoFlag;
    }

    /**
     * 
     * @param guaGuoFlag
     *     The guaGuoFlag
     */
    public void setGuaGuoFlag(Integer guaGuoFlag) {
        this.guaGuoFlag = guaGuoFlag;
    }

    /**
     * 
     * @return
     *     The promoTypes
     */
    public java.util.List<Integer> getPromoTypes() {
        return promoTypes;
    }

    /**
     * 
     * @param promoTypes
     *     The promoTypes
     */
    public void setPromoTypes(java.util.List<Integer> promoTypes) {
        this.promoTypes = promoTypes;
    }

    /**
     * 
     * @return
     *     The promoIcon
     */
    public String getPromoIcon() {
        return promoIcon;
    }

    /**
     * 
     * @param promoIcon
     *     The promoIcon
     */
    public void setPromoIcon(String promoIcon) {
        this.promoIcon = promoIcon;
    }

    /**
     * 
     * @return
     *     The maximumStay
     */
    public String getMaximumStay() {
        return maximumStay;
    }

    /**
     * 
     * @param maximumStay
     *     The maximumStay
     */
    public void setMaximumStay(String maximumStay) {
        this.maximumStay = maximumStay;
    }

    /**
     * 
     * @return
     *     The entryTimes
     */
    public String getEntryTimes() {
        return entryTimes;
    }

    /**
     * 
     * @param entryTimes
     *     The entryTimes
     */
    public void setEntryTimes(String entryTimes) {
        this.entryTimes = entryTimes;
    }

    /**
     * 
     * @return
     *     The promoIcoInfo
     */
    public PromoIcoInfo getPromoIcoInfo() {
        return promoIcoInfo;
    }

    /**
     * 
     * @param promoIcoInfo
     *     The promoIcoInfo
     */
    public void setPromoIcoInfo(PromoIcoInfo promoIcoInfo) {
        this.promoIcoInfo = promoIcoInfo;
    }

    /**
     * 
     * @return
     *     The onSale
     */
    public Boolean getOnSale() {
        return onSale;
    }

    /**
     * 
     * @param onSale
     *     The onSale
     */
    public void setOnSale(Boolean onSale) {
        this.onSale = onSale;
    }

    /**
     * 
     * @return
     *     The onSaleUrl
     */
    public String getOnSaleUrl() {
        return onSaleUrl;
    }

    /**
     * 
     * @param onSaleUrl
     *     The onSaleUrl
     */
    public void setOnSaleUrl(String onSaleUrl) {
        this.onSaleUrl = onSaleUrl;
    }

    /**
     * 
     * @return
     *     The planDates
     */
    public java.util.List<String> getPlanDates() {
        return planDates;
    }

    /**
     * 
     * @param planDates
     *     The planDates
     */
    public void setPlanDates(java.util.List<String> planDates) {
        this.planDates = planDates;
    }

    /**
     * 
     * @return
     *     The newPicUrl
     */
    public String getNewPicUrl() {
        return newPicUrl;
    }

    /**
     * 
     * @param newPicUrl
     *     The newPicUrl
     */
    public void setNewPicUrl(String newPicUrl) {
        this.newPicUrl = newPicUrl;
    }

    /**
     * 
     * @return
     *     The activityType
     */
    public Integer getActivityType() {
        return activityType;
    }

    /**
     * 
     * @param activityType
     *     The activityType
     */
    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    /**
     * 
     * @return
     *     The activityTypeDesc
     */
    public String getActivityTypeDesc() {
        return activityTypeDesc;
    }

    /**
     * 
     * @param activityTypeDesc
     *     The activityTypeDesc
     */
    public void setActivityTypeDesc(String activityTypeDesc) {
        this.activityTypeDesc = activityTypeDesc;
    }

    /**
     * 
     * @return
     *     The distance
     */
    public Integer getDistance() {
        return distance;
    }

    /**
     * 
     * @param distance
     *     The distance
     */
    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    /**
     * 
     * @return
     *     The glocation
     */
    public String getGlocation() {
        return glocation;
    }

    /**
     * 
     * @param glocation
     *     The glocation
     */
    public void setGlocation(String glocation) {
        this.glocation = glocation;
    }

    /**
     * 
     * @return
     *     The groupCityName
     */
    public String getGroupCityName() {
        return groupCityName;
    }

    /**
     * 
     * @param groupCityName
     *     The groupCityName
     */
    public void setGroupCityName(String groupCityName) {
        this.groupCityName = groupCityName;
    }

    /**
     * 
     * @return
     *     The mainPoiCityName
     */
    public String getMainPoiCityName() {
        return mainPoiCityName;
    }

    /**
     * 
     * @param mainPoiCityName
     *     The mainPoiCityName
     */
    public void setMainPoiCityName(String mainPoiCityName) {
        this.mainPoiCityName = mainPoiCityName;
    }

    /**
     * 
     * @return
     *     The isSameTopic
     */
    public Boolean getIsSameTopic() {
        return isSameTopic;
    }

    /**
     * 
     * @param isSameTopic
     *     The isSameTopic
     */
    public void setIsSameTopic(Boolean isSameTopic) {
        this.isSameTopic = isSameTopic;
    }

    /**
     * 
     * @return
     *     The topicId
     */
    public Integer getTopicId() {
        return topicId;
    }

    /**
     * 
     * @param topicId
     *     The topicId
     */
    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    /**
     * 
     * @return
     *     The topicImg
     */
    public String getTopicImg() {
        return topicImg;
    }

    /**
     * 
     * @param topicImg
     *     The topicImg
     */
    public void setTopicImg(String topicImg) {
        this.topicImg = topicImg;
    }

    /**
     * 
     * @return
     *     The salePrice
     */
    public Integer getSalePrice() {
        return salePrice;
    }

    /**
     * 
     * @param salePrice
     *     The salePrice
     */
    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * 
     * @return
     *     The recommend
     */
    public String getRecommend() {
        return recommend;
    }

    /**
     * 
     * @param recommend
     *     The recommend
     */
    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    /**
     * 
     * @return
     *     The brandType
     */
    public String getBrandType() {
        return brandType;
    }

    /**
     * 
     * @param brandType
     *     The brandType
     */
    public void setBrandType(String brandType) {
        this.brandType = brandType;
    }

    /**
     * 
     * @return
     *     The saleChannel
     */
    public java.util.List<String> getSaleChannel() {
        return saleChannel;
    }

    /**
     * 
     * @param saleChannel
     *     The saleChannel
     */
    public void setSaleChannel(java.util.List<String> saleChannel) {
        this.saleChannel = saleChannel;
    }

    /**
     * 
     * @return
     *     The productFeature
     */
    public java.util.List<String> getProductFeature() {
        return productFeature;
    }

    /**
     * 
     * @param productFeature
     *     The productFeature
     */
    public void setProductFeature(java.util.List<String> productFeature) {
        this.productFeature = productFeature;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The classBrandId
     */
    public Integer getClassBrandId() {
        return classBrandId;
    }

    /**
     * 
     * @param classBrandId
     *     The classBrandId
     */
    public void setClassBrandId(Integer classBrandId) {
        this.classBrandId = classBrandId;
    }

    /**
     * 
     * @return
     *     The labelImgListNew
     */
    public java.util.List<LabelImgListNew> getLabelImgListNew() {
        return labelImgListNew;
    }

    /**
     * 
     * @param labelImgListNew
     *     The labelImgListNew
     */
    public void setLabelImgListNew(java.util.List<LabelImgListNew> labelImgListNew) {
        this.labelImgListNew = labelImgListNew;
    }

}
