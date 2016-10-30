package com.json.home.detail.header;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class Data {

    @Expose
    private Integer productType;
    @Expose
    private String teamDesc;
    @Expose
    private Integer productId;
    @Expose
    private Integer productSource;
    @Expose
    private String name;
    @Expose
    private String category;
    @Expose
    private Integer defaultAdultNum;
    @Expose
    private Integer defaultChildNum;
    @Expose
    private Integer productLineTypeId;
    @Expose
    private List<Image> images = new ArrayList<Image>();
    @Expose
    private TeamType teamType;
    @Expose
    private Integer proMode;
    @Expose
    private String schduleRemark;
    @Expose
    private Object haveBookCity;
    @Expose
    private CattleWord cattleWord;
    @Expose
    private Integer isCattle;
    @Expose
    private List<DepartAndBackCityList> departAndBackCityList = new ArrayList<DepartAndBackCityList>();
    @Expose
    private Integer brandId;
    @Expose
    private List<ProductFetureTag> productFetureTag = new ArrayList<ProductFetureTag>();
    @Expose
    private Integer tagType;
    @Expose
    private Integer classBrandId;
    @Expose
    private List<Object> promotion = new ArrayList<Object>();
    @Expose
    private String departCity;
    @Expose
    private Integer bookCity;
    @Expose
    private String promotionDate;
    @Expose
    private Integer sharingPreferential;
    @Expose
    private Integer sharingPromotionId;
    @Expose
    private String promotionDesc;
    @Expose
    private Integer lowestPromoPrice;
    @Expose
    private Integer lowestPrice;
    @Expose
    private String departName;
    @Expose
    private List<DepartCity> departCities = new ArrayList<DepartCity>();
    @Expose
    private List<Object> guaGuoIntroduction = new ArrayList<Object>();
    @Expose
    private Integer isGuaGuo;
    @Expose
    private List<Object> baMaIntroduction = new ArrayList<Object>();
    @Expose
    private Boolean isBaMa;
    @Expose
    private Integer hasUseNewCityInfo;
    @Expose
    private String backCityCode;
    @Expose
    private Integer satisfaction;
    @Expose
    private Integer travelCount;
    @Expose
    private Integer remarkCount;
    @Expose
    private List<CompList> compList = new ArrayList<CompList>();
    @Expose
    private Integer niuLineFlag;
    @Expose
    private String htmlLink;
    @Expose
    private String niuLineIntroductionImage;
    @Expose
    private ShouHang shouHang;
    @Expose
    private Integer isStudyTour;
    @Expose
    private Integer isBeHappy;
    @Expose
    private List<Object> journeyDetails = new ArrayList<Object>();

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
     *     The teamDesc
     */
    public String getTeamDesc() {
        return teamDesc;
    }

    /**
     * 
     * @param teamDesc
     *     The teamDesc
     */
    public void setTeamDesc(String teamDesc) {
        this.teamDesc = teamDesc;
    }

    /**
     * 
     * @return
     *     The productId
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 
     * @param productId
     *     The productId
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * 
     * @return
     *     The productSource
     */
    public Integer getProductSource() {
        return productSource;
    }

    /**
     * 
     * @param productSource
     *     The productSource
     */
    public void setProductSource(Integer productSource) {
        this.productSource = productSource;
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
     *     The defaultAdultNum
     */
    public Integer getDefaultAdultNum() {
        return defaultAdultNum;
    }

    /**
     * 
     * @param defaultAdultNum
     *     The defaultAdultNum
     */
    public void setDefaultAdultNum(Integer defaultAdultNum) {
        this.defaultAdultNum = defaultAdultNum;
    }

    /**
     * 
     * @return
     *     The defaultChildNum
     */
    public Integer getDefaultChildNum() {
        return defaultChildNum;
    }

    /**
     * 
     * @param defaultChildNum
     *     The defaultChildNum
     */
    public void setDefaultChildNum(Integer defaultChildNum) {
        this.defaultChildNum = defaultChildNum;
    }

    /**
     * 
     * @return
     *     The productLineTypeId
     */
    public Integer getProductLineTypeId() {
        return productLineTypeId;
    }

    /**
     * 
     * @param productLineTypeId
     *     The productLineTypeId
     */
    public void setProductLineTypeId(Integer productLineTypeId) {
        this.productLineTypeId = productLineTypeId;
    }

    /**
     * 
     * @return
     *     The images
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(List<Image> images) {
        this.images = images;
    }

    /**
     * 
     * @return
     *     The teamType
     */
    public TeamType getTeamType() {
        return teamType;
    }

    /**
     * 
     * @param teamType
     *     The teamType
     */
    public void setTeamType(TeamType teamType) {
        this.teamType = teamType;
    }

    /**
     * 
     * @return
     *     The proMode
     */
    public Integer getProMode() {
        return proMode;
    }

    /**
     * 
     * @param proMode
     *     The proMode
     */
    public void setProMode(Integer proMode) {
        this.proMode = proMode;
    }

    /**
     * 
     * @return
     *     The schduleRemark
     */
    public String getSchduleRemark() {
        return schduleRemark;
    }

    /**
     * 
     * @param schduleRemark
     *     The schduleRemark
     */
    public void setSchduleRemark(String schduleRemark) {
        this.schduleRemark = schduleRemark;
    }

    /**
     * 
     * @return
     *     The haveBookCity
     */
    public Object getHaveBookCity() {
        return haveBookCity;
    }

    /**
     * 
     * @param haveBookCity
     *     The haveBookCity
     */
    public void setHaveBookCity(Object haveBookCity) {
        this.haveBookCity = haveBookCity;
    }

    /**
     * 
     * @return
     *     The cattleWord
     */
    public CattleWord getCattleWord() {
        return cattleWord;
    }

    /**
     * 
     * @param cattleWord
     *     The cattleWord
     */
    public void setCattleWord(CattleWord cattleWord) {
        this.cattleWord = cattleWord;
    }

    /**
     * 
     * @return
     *     The isCattle
     */
    public Integer getIsCattle() {
        return isCattle;
    }

    /**
     * 
     * @param isCattle
     *     The isCattle
     */
    public void setIsCattle(Integer isCattle) {
        this.isCattle = isCattle;
    }

    /**
     * 
     * @return
     *     The departAndBackCityList
     */
    public List<DepartAndBackCityList> getDepartAndBackCityList() {
        return departAndBackCityList;
    }

    /**
     * 
     * @param departAndBackCityList
     *     The departAndBackCityList
     */
    public void setDepartAndBackCityList(List<DepartAndBackCityList> departAndBackCityList) {
        this.departAndBackCityList = departAndBackCityList;
    }

    /**
     * 
     * @return
     *     The brandId
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * 
     * @param brandId
     *     The brandId
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * 
     * @return
     *     The productFetureTag
     */
    public List<ProductFetureTag> getProductFetureTag() {
        return productFetureTag;
    }

    /**
     * 
     * @param productFetureTag
     *     The productFetureTag
     */
    public void setProductFetureTag(List<ProductFetureTag> productFetureTag) {
        this.productFetureTag = productFetureTag;
    }

    /**
     * 
     * @return
     *     The tagType
     */
    public Integer getTagType() {
        return tagType;
    }

    /**
     * 
     * @param tagType
     *     The tagType
     */
    public void setTagType(Integer tagType) {
        this.tagType = tagType;
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
     *     The promotion
     */
    public List<Object> getPromotion() {
        return promotion;
    }

    /**
     * 
     * @param promotion
     *     The promotion
     */
    public void setPromotion(List<Object> promotion) {
        this.promotion = promotion;
    }

    /**
     * 
     * @return
     *     The departCity
     */
    public String getDepartCity() {
        return departCity;
    }

    /**
     * 
     * @param departCity
     *     The departCity
     */
    public void setDepartCity(String departCity) {
        this.departCity = departCity;
    }

    /**
     * 
     * @return
     *     The bookCity
     */
    public Integer getBookCity() {
        return bookCity;
    }

    /**
     * 
     * @param bookCity
     *     The bookCity
     */
    public void setBookCity(Integer bookCity) {
        this.bookCity = bookCity;
    }

    /**
     * 
     * @return
     *     The promotionDate
     */
    public String getPromotionDate() {
        return promotionDate;
    }

    /**
     * 
     * @param promotionDate
     *     The promotionDate
     */
    public void setPromotionDate(String promotionDate) {
        this.promotionDate = promotionDate;
    }

    /**
     * 
     * @return
     *     The sharingPreferential
     */
    public Integer getSharingPreferential() {
        return sharingPreferential;
    }

    /**
     * 
     * @param sharingPreferential
     *     The sharingPreferential
     */
    public void setSharingPreferential(Integer sharingPreferential) {
        this.sharingPreferential = sharingPreferential;
    }

    /**
     * 
     * @return
     *     The sharingPromotionId
     */
    public Integer getSharingPromotionId() {
        return sharingPromotionId;
    }

    /**
     * 
     * @param sharingPromotionId
     *     The sharingPromotionId
     */
    public void setSharingPromotionId(Integer sharingPromotionId) {
        this.sharingPromotionId = sharingPromotionId;
    }

    /**
     * 
     * @return
     *     The promotionDesc
     */
    public String getPromotionDesc() {
        return promotionDesc;
    }

    /**
     * 
     * @param promotionDesc
     *     The promotionDesc
     */
    public void setPromotionDesc(String promotionDesc) {
        this.promotionDesc = promotionDesc;
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
     *     The departName
     */
    public String getDepartName() {
        return departName;
    }

    /**
     * 
     * @param departName
     *     The departName
     */
    public void setDepartName(String departName) {
        this.departName = departName;
    }

    /**
     * 
     * @return
     *     The departCities
     */
    public List<DepartCity> getDepartCities() {
        return departCities;
    }

    /**
     * 
     * @param departCities
     *     The departCities
     */
    public void setDepartCities(List<DepartCity> departCities) {
        this.departCities = departCities;
    }

    /**
     * 
     * @return
     *     The guaGuoIntroduction
     */
    public List<Object> getGuaGuoIntroduction() {
        return guaGuoIntroduction;
    }

    /**
     * 
     * @param guaGuoIntroduction
     *     The guaGuoIntroduction
     */
    public void setGuaGuoIntroduction(List<Object> guaGuoIntroduction) {
        this.guaGuoIntroduction = guaGuoIntroduction;
    }

    /**
     * 
     * @return
     *     The isGuaGuo
     */
    public Integer getIsGuaGuo() {
        return isGuaGuo;
    }

    /**
     * 
     * @param isGuaGuo
     *     The isGuaGuo
     */
    public void setIsGuaGuo(Integer isGuaGuo) {
        this.isGuaGuo = isGuaGuo;
    }

    /**
     * 
     * @return
     *     The baMaIntroduction
     */
    public List<Object> getBaMaIntroduction() {
        return baMaIntroduction;
    }

    /**
     * 
     * @param baMaIntroduction
     *     The baMaIntroduction
     */
    public void setBaMaIntroduction(List<Object> baMaIntroduction) {
        this.baMaIntroduction = baMaIntroduction;
    }

    /**
     * 
     * @return
     *     The isBaMa
     */
    public Boolean getIsBaMa() {
        return isBaMa;
    }

    /**
     * 
     * @param isBaMa
     *     The isBaMa
     */
    public void setIsBaMa(Boolean isBaMa) {
        this.isBaMa = isBaMa;
    }

    /**
     * 
     * @return
     *     The hasUseNewCityInfo
     */
    public Integer getHasUseNewCityInfo() {
        return hasUseNewCityInfo;
    }

    /**
     * 
     * @param hasUseNewCityInfo
     *     The hasUseNewCityInfo
     */
    public void setHasUseNewCityInfo(Integer hasUseNewCityInfo) {
        this.hasUseNewCityInfo = hasUseNewCityInfo;
    }

    /**
     * 
     * @return
     *     The backCityCode
     */
    public String getBackCityCode() {
        return backCityCode;
    }

    /**
     * 
     * @param backCityCode
     *     The backCityCode
     */
    public void setBackCityCode(String backCityCode) {
        this.backCityCode = backCityCode;
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
     *     The compList
     */
    public List<CompList> getCompList() {
        return compList;
    }

    /**
     * 
     * @param compList
     *     The compList
     */
    public void setCompList(List<CompList> compList) {
        this.compList = compList;
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
     *     The htmlLink
     */
    public String getHtmlLink() {
        return htmlLink;
    }

    /**
     * 
     * @param htmlLink
     *     The htmlLink
     */
    public void setHtmlLink(String htmlLink) {
        this.htmlLink = htmlLink;
    }

    /**
     * 
     * @return
     *     The niuLineIntroductionImage
     */
    public String getNiuLineIntroductionImage() {
        return niuLineIntroductionImage;
    }

    /**
     * 
     * @param niuLineIntroductionImage
     *     The niuLineIntroductionImage
     */
    public void setNiuLineIntroductionImage(String niuLineIntroductionImage) {
        this.niuLineIntroductionImage = niuLineIntroductionImage;
    }

    /**
     * 
     * @return
     *     The shouHang
     */
    public ShouHang getShouHang() {
        return shouHang;
    }

    /**
     * 
     * @param shouHang
     *     The shouHang
     */
    public void setShouHang(ShouHang shouHang) {
        this.shouHang = shouHang;
    }

    /**
     * 
     * @return
     *     The isStudyTour
     */
    public Integer getIsStudyTour() {
        return isStudyTour;
    }

    /**
     * 
     * @param isStudyTour
     *     The isStudyTour
     */
    public void setIsStudyTour(Integer isStudyTour) {
        this.isStudyTour = isStudyTour;
    }

    /**
     * 
     * @return
     *     The isBeHappy
     */
    public Integer getIsBeHappy() {
        return isBeHappy;
    }

    /**
     * 
     * @param isBeHappy
     *     The isBeHappy
     */
    public void setIsBeHappy(Integer isBeHappy) {
        this.isBeHappy = isBeHappy;
    }

    /**
     * 
     * @return
     *     The journeyDetails
     */
    public List<Object> getJourneyDetails() {
        return journeyDetails;
    }

    /**
     * 
     * @param journeyDetails
     *     The journeyDetails
     */
    public void setJourneyDetails(List<Object> journeyDetails) {
        this.journeyDetails = journeyDetails;
    }

}
