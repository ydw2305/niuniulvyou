package com.json.home.header;
import com.google.gson.annotations.Expose;

public class Content_ {

    @Expose
    private String title;
    @Expose
    private Object subTitle;
    @Expose
    private String imgUrl;
    @Expose
    private String url;
    @Expose
    private Object titleColor;
    @Expose
    private Object promotionName;
    @Expose
    private Object promotionDiscount;
    @Expose
    private Object promotionStartTime;
    @Expose
    private Object promotionDeadline;
    @Expose
    private Integer promotionPrice;
    @Expose
    private Integer originPrice;

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
     *     The subTitle
     */
    public Object getSubTitle() {
        return subTitle;
    }

    /**
     * 
     * @param subTitle
     *     The subTitle
     */
    public void setSubTitle(Object subTitle) {
        this.subTitle = subTitle;
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
     *     The titleColor
     */
    public Object getTitleColor() {
        return titleColor;
    }

    /**
     * 
     * @param titleColor
     *     The titleColor
     */
    public void setTitleColor(Object titleColor) {
        this.titleColor = titleColor;
    }

    /**
     * 
     * @return
     *     The promotionName
     */
    public Object getPromotionName() {
        return promotionName;
    }

    /**
     * 
     * @param promotionName
     *     The promotionName
     */
    public void setPromotionName(Object promotionName) {
        this.promotionName = promotionName;
    }

    /**
     * 
     * @return
     *     The promotionDiscount
     */
    public Object getPromotionDiscount() {
        return promotionDiscount;
    }

    /**
     * 
     * @param promotionDiscount
     *     The promotionDiscount
     */
    public void setPromotionDiscount(Object promotionDiscount) {
        this.promotionDiscount = promotionDiscount;
    }

    /**
     * 
     * @return
     *     The promotionStartTime
     */
    public Object getPromotionStartTime() {
        return promotionStartTime;
    }

    /**
     * 
     * @param promotionStartTime
     *     The promotionStartTime
     */
    public void setPromotionStartTime(Object promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    /**
     * 
     * @return
     *     The promotionDeadline
     */
    public Object getPromotionDeadline() {
        return promotionDeadline;
    }

    /**
     * 
     * @param promotionDeadline
     *     The promotionDeadline
     */
    public void setPromotionDeadline(Object promotionDeadline) {
        this.promotionDeadline = promotionDeadline;
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
     *     The originPrice
     */
    public Integer getOriginPrice() {
        return originPrice;
    }

    /**
     * 
     * @param originPrice
     *     The originPrice
     */
    public void setOriginPrice(Integer originPrice) {
        this.originPrice = originPrice;
    }

}
