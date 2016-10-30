package com.json.found.jiebanplaylist;
import java.util.ArrayList;
import com.google.gson.annotations.Expose;

public class List {

    @Expose
    private Integer age;
    @Expose
    private Integer commentCount;
    @Expose
    private String content;
    @Expose
    private Integer destinationId;
    @Expose
    private String destinationName;
    @Expose
    private Boolean expired;
    @Expose
    private String h5Url;
    @Expose
    private Boolean isLike;
    @Expose
    private String jid;
    @Expose
    private Integer level;
    @Expose
    private String levelIcon;
    @Expose
    private Integer likeCount;
    @Expose
    private Integer messageId;
    @Expose
    private String nickname;
    @Expose
    private Integer pageView;
    @Expose
    private java.util.List<PicList> picList = new ArrayList<PicList>();
    @Expose
    private java.util.List<Object> productInfoList = new ArrayList<Object>();
    @Expose
    private Integer publishPoiId;
    @Expose
    private String publishPoiName;
    @Expose
    private String publishTime;
    @Expose
    private java.util.List<String> scenicList = new ArrayList<String>();
    @Expose
    private String serviceName;
    @Expose
    private Integer serviceType;
    @Expose
    private Integer sex;
    @Expose
    private Integer shareCount;
    @Expose
    private String showTime;
    @Expose
    private String startCity;
    @Expose
    private String startTime;
    @Expose
    private java.util.List<Tag> tags = new ArrayList<Tag>();
    @Expose
    private String title;
    @Expose
    private String userIcon;
    @Expose
    private Integer userId;

    /**
     * 
     * @return
     *     The age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 
     * @param age
     *     The age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 
     * @return
     *     The commentCount
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * 
     * @param commentCount
     *     The commentCount
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 
     * @return
     *     The content
     */
    public String getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 
     * @return
     *     The destinationId
     */
    public Integer getDestinationId() {
        return destinationId;
    }

    /**
     * 
     * @param destinationId
     *     The destinationId
     */
    public void setDestinationId(Integer destinationId) {
        this.destinationId = destinationId;
    }

    /**
     * 
     * @return
     *     The destinationName
     */
    public String getDestinationName() {
        return destinationName;
    }

    /**
     * 
     * @param destinationName
     *     The destinationName
     */
    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * 
     * @return
     *     The expired
     */
    public Boolean getExpired() {
        return expired;
    }

    /**
     * 
     * @param expired
     *     The expired
     */
    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    /**
     * 
     * @return
     *     The h5Url
     */
    public String getH5Url() {
        return h5Url;
    }

    /**
     * 
     * @param h5Url
     *     The h5Url
     */
    public void setH5Url(String h5Url) {
        this.h5Url = h5Url;
    }

    /**
     * 
     * @return
     *     The isLike
     */
    public Boolean getIsLike() {
        return isLike;
    }

    /**
     * 
     * @param isLike
     *     The isLike
     */
    public void setIsLike(Boolean isLike) {
        this.isLike = isLike;
    }

    /**
     * 
     * @return
     *     The jid
     */
    public String getJid() {
        return jid;
    }

    /**
     * 
     * @param jid
     *     The jid
     */
    public void setJid(String jid) {
        this.jid = jid;
    }

    /**
     * 
     * @return
     *     The level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 
     * @return
     *     The levelIcon
     */
    public String getLevelIcon() {
        return levelIcon;
    }

    /**
     * 
     * @param levelIcon
     *     The levelIcon
     */
    public void setLevelIcon(String levelIcon) {
        this.levelIcon = levelIcon;
    }

    /**
     * 
     * @return
     *     The likeCount
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * 
     * @param likeCount
     *     The likeCount
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * 
     * @return
     *     The messageId
     */
    public Integer getMessageId() {
        return messageId;
    }

    /**
     * 
     * @param messageId
     *     The messageId
     */
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    /**
     * 
     * @return
     *     The nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 
     * @param nickname
     *     The nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 
     * @return
     *     The pageView
     */
    public Integer getPageView() {
        return pageView;
    }

    /**
     * 
     * @param pageView
     *     The pageView
     */
    public void setPageView(Integer pageView) {
        this.pageView = pageView;
    }

    /**
     * 
     * @return
     *     The picList
     */
    public java.util.List<PicList> getPicList() {
        return picList;
    }

    /**
     * 
     * @param picList
     *     The picList
     */
    public void setPicList(java.util.List<PicList> picList) {
        this.picList = picList;
    }

    /**
     * 
     * @return
     *     The productInfoList
     */
    public java.util.List<Object> getProductInfoList() {
        return productInfoList;
    }

    /**
     * 
     * @param productInfoList
     *     The productInfoList
     */
    public void setProductInfoList(java.util.List<Object> productInfoList) {
        this.productInfoList = productInfoList;
    }

    /**
     * 
     * @return
     *     The publishPoiId
     */
    public Integer getPublishPoiId() {
        return publishPoiId;
    }

    /**
     * 
     * @param publishPoiId
     *     The publishPoiId
     */
    public void setPublishPoiId(Integer publishPoiId) {
        this.publishPoiId = publishPoiId;
    }

    /**
     * 
     * @return
     *     The publishPoiName
     */
    public String getPublishPoiName() {
        return publishPoiName;
    }

    /**
     * 
     * @param publishPoiName
     *     The publishPoiName
     */
    public void setPublishPoiName(String publishPoiName) {
        this.publishPoiName = publishPoiName;
    }

    /**
     * 
     * @return
     *     The publishTime
     */
    public String getPublishTime() {
        return publishTime;
    }

    /**
     * 
     * @param publishTime
     *     The publishTime
     */
    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * 
     * @return
     *     The scenicList
     */
    public java.util.List<String> getScenicList() {
        return scenicList;
    }

    /**
     * 
     * @param scenicList
     *     The scenicList
     */
    public void setScenicList(java.util.List<String> scenicList) {
        this.scenicList = scenicList;
    }

    /**
     * 
     * @return
     *     The serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * 
     * @param serviceName
     *     The serviceName
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * 
     * @return
     *     The serviceType
     */
    public Integer getServiceType() {
        return serviceType;
    }

    /**
     * 
     * @param serviceType
     *     The serviceType
     */
    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * 
     * @return
     *     The sex
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 
     * @param sex
     *     The sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 
     * @return
     *     The shareCount
     */
    public Integer getShareCount() {
        return shareCount;
    }

    /**
     * 
     * @param shareCount
     *     The shareCount
     */
    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    /**
     * 
     * @return
     *     The showTime
     */
    public String getShowTime() {
        return showTime;
    }

    /**
     * 
     * @param showTime
     *     The showTime
     */
    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    /**
     * 
     * @return
     *     The startCity
     */
    public String getStartCity() {
        return startCity;
    }

    /**
     * 
     * @param startCity
     *     The startCity
     */
    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    /**
     * 
     * @return
     *     The startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 
     * @param startTime
     *     The startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * 
     * @return
     *     The tags
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    public void setTags(java.util.List<Tag> tags) {
        this.tags = tags;
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
     *     The userIcon
     */
    public String getUserIcon() {
        return userIcon;
    }

    /**
     * 
     * @param userIcon
     *     The userIcon
     */
    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon;
    }

    /**
     * 
     * @return
     *     The userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId
     *     The userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
