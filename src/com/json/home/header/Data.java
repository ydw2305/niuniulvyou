package com.json.home.header;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class Data {

    @Expose
    private List<Advertise> advertises = new ArrayList<Advertise>();
    @Expose
    private List<CategoryNew> categoryNew = new ArrayList<CategoryNew>();
    @Expose
    private SmallCategory smallCategory;
    @Expose
    private Registration registration;
    @Expose
    private Specials specials;
    @Expose
    private HotRecommend hotRecommend;
    @Expose
    private FindBeauty findBeauty;
    @Expose
    private List<FindBeautyRight> findBeautyRight = new ArrayList<FindBeautyRight>();
    @Expose
    private SignIn signIn;
    @Expose
    private Integer priceStyle;
    @Expose
    private OfflineInfo offlineInfo;
    @Expose
    private Object destRecommend;
    @Expose
    private List<ThemeActivity> themeActivities = new ArrayList<ThemeActivity>();
    @Expose
    private Object loginGift;
    @Expose
    private List<RecommendForYou> recommendForYou = new ArrayList<RecommendForYou>();
    @Expose
    private Push push;
    @Expose
    private Integer activeEventFlag;

    /**
     * 
     * @return
     *     The advertises
     */
    public List<Advertise> getAdvertises() {
        return advertises;
    }

    /**
     * 
     * @param advertises
     *     The advertises
     */
    public void setAdvertises(List<Advertise> advertises) {
        this.advertises = advertises;
    }

    /**
     * 
     * @return
     *     The categoryNew
     */
    public List<CategoryNew> getCategoryNew() {
        return categoryNew;
    }

    /**
     * 
     * @param categoryNew
     *     The categoryNew
     */
    public void setCategoryNew(List<CategoryNew> categoryNew) {
        this.categoryNew = categoryNew;
    }

    /**
     * 
     * @return
     *     The smallCategory
     */
    public SmallCategory getSmallCategory() {
        return smallCategory;
    }

    /**
     * 
     * @param smallCategory
     *     The smallCategory
     */
    public void setSmallCategory(SmallCategory smallCategory) {
        this.smallCategory = smallCategory;
    }

    /**
     * 
     * @return
     *     The registration
     */
    public Registration getRegistration() {
        return registration;
    }

    /**
     * 
     * @param registration
     *     The registration
     */
    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    /**
     * 
     * @return
     *     The specials
     */
    public Specials getSpecials() {
        return specials;
    }

    /**
     * 
     * @param specials
     *     The specials
     */
    public void setSpecials(Specials specials) {
        this.specials = specials;
    }

    /**
     * 
     * @return
     *     The hotRecommend
     */
    public HotRecommend getHotRecommend() {
        return hotRecommend;
    }

    /**
     * 
     * @param hotRecommend
     *     The hotRecommend
     */
    public void setHotRecommend(HotRecommend hotRecommend) {
        this.hotRecommend = hotRecommend;
    }

    /**
     * 
     * @return
     *     The findBeauty
     */
    public FindBeauty getFindBeauty() {
        return findBeauty;
    }

    /**
     * 
     * @param findBeauty
     *     The findBeauty
     */
    public void setFindBeauty(FindBeauty findBeauty) {
        this.findBeauty = findBeauty;
    }

    /**
     * 
     * @return
     *     The findBeautyRight
     */
    public List<FindBeautyRight> getFindBeautyRight() {
        return findBeautyRight;
    }

    /**
     * 
     * @param findBeautyRight
     *     The findBeautyRight
     */
    public void setFindBeautyRight(List<FindBeautyRight> findBeautyRight) {
        this.findBeautyRight = findBeautyRight;
    }

    /**
     * 
     * @return
     *     The signIn
     */
    public SignIn getSignIn() {
        return signIn;
    }

    /**
     * 
     * @param signIn
     *     The signIn
     */
    public void setSignIn(SignIn signIn) {
        this.signIn = signIn;
    }

    /**
     * 
     * @return
     *     The priceStyle
     */
    public Integer getPriceStyle() {
        return priceStyle;
    }

    /**
     * 
     * @param priceStyle
     *     The priceStyle
     */
    public void setPriceStyle(Integer priceStyle) {
        this.priceStyle = priceStyle;
    }

    /**
     * 
     * @return
     *     The offlineInfo
     */
    public OfflineInfo getOfflineInfo() {
        return offlineInfo;
    }

    /**
     * 
     * @param offlineInfo
     *     The offlineInfo
     */
    public void setOfflineInfo(OfflineInfo offlineInfo) {
        this.offlineInfo = offlineInfo;
    }

    /**
     * 
     * @return
     *     The destRecommend
     */
    public Object getDestRecommend() {
        return destRecommend;
    }

    /**
     * 
     * @param destRecommend
     *     The destRecommend
     */
    public void setDestRecommend(Object destRecommend) {
        this.destRecommend = destRecommend;
    }

    /**
     * 
     * @return
     *     The themeActivities
     */
    public List<ThemeActivity> getThemeActivities() {
        return themeActivities;
    }

    /**
     * 
     * @param themeActivities
     *     The themeActivities
     */
    public void setThemeActivities(List<ThemeActivity> themeActivities) {
        this.themeActivities = themeActivities;
    }

    /**
     * 
     * @return
     *     The loginGift
     */
    public Object getLoginGift() {
        return loginGift;
    }

    /**
     * 
     * @param loginGift
     *     The loginGift
     */
    public void setLoginGift(Object loginGift) {
        this.loginGift = loginGift;
    }

    /**
     * 
     * @return
     *     The recommendForYou
     */
    public List<RecommendForYou> getRecommendForYou() {
        return recommendForYou;
    }

    /**
     * 
     * @param recommendForYou
     *     The recommendForYou
     */
    public void setRecommendForYou(List<RecommendForYou> recommendForYou) {
        this.recommendForYou = recommendForYou;
    }

    /**
     * 
     * @return
     *     The push
     */
    public Push getPush() {
        return push;
    }

    /**
     * 
     * @param push
     *     The push
     */
    public void setPush(Push push) {
        this.push = push;
    }

    /**
     * 
     * @return
     *     The activeEventFlag
     */
    public Integer getActiveEventFlag() {
        return activeEventFlag;
    }

    /**
     * 
     * @param activeEventFlag
     *     The activeEventFlag
     */
    public void setActiveEventFlag(Integer activeEventFlag) {
        this.activeEventFlag = activeEventFlag;
    }

}
