package com.json.home.more;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class Product {

    @Expose
    private String productTypeName;
    @Expose
    private String departCityName;
    @Expose
    private Integer iconType;
    @Expose
    private String imgUrl;
    @Expose
    private String url;
    @Expose
    private String title;
    @Expose
    private String activityIconUrl;
    @Expose
    private String subTitle;
    @Expose
    private String promotionDesc;
    @Expose
    private Integer promotionPrice;
    @Expose
    private Integer originalPrice;
    @Expose
    private List<Object> brandLabels = new ArrayList<Object>();
    @Expose
    private String satisfaction;
    @Expose
    private Integer peopleCount;

    /**
     * 
     * @return
     *     The productTypeName
     */
    public String getProductTypeName() {
        return productTypeName;
    }

    /**
     * 
     * @param productTypeName
     *     The productTypeName
     */
    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    /**
     * 
     * @return
     *     The departCityName
     */
    public String getDepartCityName() {
        return departCityName;
    }

    /**
     * 
     * @param departCityName
     *     The departCityName
     */
    public void setDepartCityName(String departCityName) {
        this.departCityName = departCityName;
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
     *     The imgUrl
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 
     * @param imgUrl
     *     The imgUrl
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The activityIconUrl
     */
    public String getActivityIconUrl() {
        return activityIconUrl;
    }

    /**
     * 
     * @param activityIconUrl
     *     The activityIconUrl
     */
    public void setActivityIconUrl(String activityIconUrl) {
        this.activityIconUrl = activityIconUrl;
    }

    /**
     * 
     * @return
     *     The subTitle
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * 
     * @param subTitle
     *     The subTitle
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
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
     *     The promotionPrice
     */
    public Integer getPromotionPrice() {
        return promotionPrice;
    }

    /**
     * 
     * @param promotionPrice
     *     The promotionPrice
     */
    public void setPromotionPrice(Integer promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    /**
     * 
     * @return
     *     The originalPrice
     */
    public Integer getOriginalPrice() {
        return originalPrice;
    }

    /**
     * 
     * @param originalPrice
     *     The originalPrice
     */
    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * 
     * @return
     *     The brandLabels
     */
    public List<Object> getBrandLabels() {
        return brandLabels;
    }

    /**
     * 
     * @param brandLabels
     *     The brandLabels
     */
    public void setBrandLabels(List<Object> brandLabels) {
        this.brandLabels = brandLabels;
    }

    /**
     * 
     * @return
     *     The satisfaction
     */
    public String getSatisfaction() {
        return satisfaction;
    }

    /**
     * 
     * @param satisfaction
     *     The satisfaction
     */
    public void setSatisfaction(String satisfaction) {
        this.satisfaction = satisfaction;
    }

    /**
     * 
     * @return
     *     The peopleCount
     */
    public Integer getPeopleCount() {
        return peopleCount;
    }

    /**
     * 
     * @param peopleCount
     *     The peopleCount
     */
    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

}
