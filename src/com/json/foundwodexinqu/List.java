package com.json.foundwodexinqu;
import java.util.ArrayList;
import com.google.gson.annotations.Expose;

public class List {

    @Expose
    private String activityImgUrl;
    @Expose
    private String activityUrl;
    @Expose
    private long adminUpdateTime;
    @Expose
    private Boolean anonymous;
    @Expose
    private String appCommentNavUrl;
    @Expose
    private String appNavUrl;
    @Expose
    private Integer applyCnt;
    @Expose
    private String applyEndDate;
    @Expose
    private Integer applyLimitCnt;
    @Expose
    private Integer applyRemainCnt;
    @Expose
    private String applyStartDate;
    @Expose
    private Integer applyState;
    @Expose
    private Boolean canApply;
    @Expose
    private Boolean canComment;
    @Expose
    private Integer commentCnt;
    @Expose
    private java.util.List<Object> contentCells = new ArrayList<Object>();
    @Expose
    private Integer contentId;
    @Expose
    private long countDownTime;
    @Expose
    private long createTime;
    @Expose
    private Object destPoiInfo;
    @Expose
    private Boolean excellent;
    @Expose
    private Group group;
    @Expose
    private String h5Url;
    @Expose
    private Boolean hasApplied;
    @Expose
    private Boolean hasPraised;
    @Expose
    private Integer hotIndex;
    @Expose
    private Integer imgCnt;
    @Expose
    private Integer imgTemplate;
    @Expose
    private java.util.List<Img> imgs = new ArrayList<Img>();
    @Expose
    private Mate mate;
    @Expose
    private Integer mateId;
    @Expose
    private Integer originId;
    @Expose
    private Integer praiseCnt;
    @Expose
    private Integer remainSeconds;
    @Expose
    private java.util.List<String> schedulePlaces = new ArrayList<String>();
    @Expose
    private Integer shareCnt;
    @Expose
    private Boolean showChat;
    @Expose
    private Integer source;
    @Expose
    private Integer status;
    @Expose
    private java.util.List<Tag> tags = new ArrayList<Tag>();
    @Expose
    private String text;
    @Expose
    private String time;
    @Expose
    private String title;
    @Expose
    private Boolean top;
    @Expose
    private Integer type;
    @Expose
    private UserInfo userInfo;

    /**
     * 
     * @return
     *     The activityImgUrl
     */
    public String getActivityImgUrl() {
        return activityImgUrl;
    }

    /**
     * 
     * @param activityImgUrl
     *     The activityImgUrl
     */
    public void setActivityImgUrl(String activityImgUrl) {
        this.activityImgUrl = activityImgUrl;
    }

    /**
     * 
     * @return
     *     The activityUrl
     */
    public String getActivityUrl() {
        return activityUrl;
    }

    /**
     * 
     * @param activityUrl
     *     The activityUrl
     */
    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }

    /**
     * 
     * @return
     *     The adminUpdateTime
     */
    public long getAdminUpdateTime() {
        return adminUpdateTime;
    }

    /**
     * 
     * @param adminUpdateTime
     *     The adminUpdateTime
     */
    public void setAdminUpdateTime(long adminUpdateTime) {
        this.adminUpdateTime = adminUpdateTime;
    }

    /**
     * 
     * @return
     *     The anonymous
     */
    public Boolean getAnonymous() {
        return anonymous;
    }

    /**
     * 
     * @param anonymous
     *     The anonymous
     */
    public void setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }

    /**
     * 
     * @return
     *     The appCommentNavUrl
     */
    public String getAppCommentNavUrl() {
        return appCommentNavUrl;
    }

    /**
     * 
     * @param appCommentNavUrl
     *     The appCommentNavUrl
     */
    public void setAppCommentNavUrl(String appCommentNavUrl) {
        this.appCommentNavUrl = appCommentNavUrl;
    }

    /**
     * 
     * @return
     *     The appNavUrl
     */
    public String getAppNavUrl() {
        return appNavUrl;
    }

    /**
     * 
     * @param appNavUrl
     *     The appNavUrl
     */
    public void setAppNavUrl(String appNavUrl) {
        this.appNavUrl = appNavUrl;
    }

    /**
     * 
     * @return
     *     The applyCnt
     */
    public Integer getApplyCnt() {
        return applyCnt;
    }

    /**
     * 
     * @param applyCnt
     *     The applyCnt
     */
    public void setApplyCnt(Integer applyCnt) {
        this.applyCnt = applyCnt;
    }

    /**
     * 
     * @return
     *     The applyEndDate
     */
    public String getApplyEndDate() {
        return applyEndDate;
    }

    /**
     * 
     * @param applyEndDate
     *     The applyEndDate
     */
    public void setApplyEndDate(String applyEndDate) {
        this.applyEndDate = applyEndDate;
    }

    /**
     * 
     * @return
     *     The applyLimitCnt
     */
    public Integer getApplyLimitCnt() {
        return applyLimitCnt;
    }

    /**
     * 
     * @param applyLimitCnt
     *     The applyLimitCnt
     */
    public void setApplyLimitCnt(Integer applyLimitCnt) {
        this.applyLimitCnt = applyLimitCnt;
    }

    /**
     * 
     * @return
     *     The applyRemainCnt
     */
    public Integer getApplyRemainCnt() {
        return applyRemainCnt;
    }

    /**
     * 
     * @param applyRemainCnt
     *     The applyRemainCnt
     */
    public void setApplyRemainCnt(Integer applyRemainCnt) {
        this.applyRemainCnt = applyRemainCnt;
    }

    /**
     * 
     * @return
     *     The applyStartDate
     */
    public String getApplyStartDate() {
        return applyStartDate;
    }

    /**
     * 
     * @param applyStartDate
     *     The applyStartDate
     */
    public void setApplyStartDate(String applyStartDate) {
        this.applyStartDate = applyStartDate;
    }

    /**
     * 
     * @return
     *     The applyState
     */
    public Integer getApplyState() {
        return applyState;
    }

    /**
     * 
     * @param applyState
     *     The applyState
     */
    public void setApplyState(Integer applyState) {
        this.applyState = applyState;
    }

    /**
     * 
     * @return
     *     The canApply
     */
    public Boolean getCanApply() {
        return canApply;
    }

    /**
     * 
     * @param canApply
     *     The canApply
     */
    public void setCanApply(Boolean canApply) {
        this.canApply = canApply;
    }

    /**
     * 
     * @return
     *     The canComment
     */
    public Boolean getCanComment() {
        return canComment;
    }

    /**
     * 
     * @param canComment
     *     The canComment
     */
    public void setCanComment(Boolean canComment) {
        this.canComment = canComment;
    }

    /**
     * 
     * @return
     *     The commentCnt
     */
    public Integer getCommentCnt() {
        return commentCnt;
    }

    /**
     * 
     * @param commentCnt
     *     The commentCnt
     */
    public void setCommentCnt(Integer commentCnt) {
        this.commentCnt = commentCnt;
    }

    /**
     * 
     * @return
     *     The contentCells
     */
    public java.util.List<Object> getContentCells() {
        return contentCells;
    }

    /**
     * 
     * @param contentCells
     *     The contentCells
     */
    public void setContentCells(java.util.List<Object> contentCells) {
        this.contentCells = contentCells;
    }

    /**
     * 
     * @return
     *     The contentId
     */
    public Integer getContentId() {
        return contentId;
    }

    /**
     * 
     * @param contentId
     *     The contentId
     */
    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    /**
     * 
     * @return
     *     The countDownTime
     */
    public long getCountDownTime() {
        return countDownTime;
    }

    /**
     * 
     * @param countDownTime
     *     The countDownTime
     */
    public void setCountDownTime(long countDownTime) {
        this.countDownTime = countDownTime;
    }

    /**
     * 
     * @return
     *     The createTime
     */
    public long getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime
     *     The createTime
     */
    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     * @return
     *     The destPoiInfo
     */
    public Object getDestPoiInfo() {
        return destPoiInfo;
    }

    /**
     * 
     * @param destPoiInfo
     *     The destPoiInfo
     */
    public void setDestPoiInfo(Object destPoiInfo) {
        this.destPoiInfo = destPoiInfo;
    }

    /**
     * 
     * @return
     *     The excellent
     */
    public Boolean getExcellent() {
        return excellent;
    }

    /**
     * 
     * @param excellent
     *     The excellent
     */
    public void setExcellent(Boolean excellent) {
        this.excellent = excellent;
    }

    /**
     * 
     * @return
     *     The group
     */
    public Group getGroup() {
        return group;
    }

    /**
     * 
     * @param group
     *     The group
     */
    public void setGroup(Group group) {
        this.group = group;
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
     *     The hasApplied
     */
    public Boolean getHasApplied() {
        return hasApplied;
    }

    /**
     * 
     * @param hasApplied
     *     The hasApplied
     */
    public void setHasApplied(Boolean hasApplied) {
        this.hasApplied = hasApplied;
    }

    /**
     * 
     * @return
     *     The hasPraised
     */
    public Boolean getHasPraised() {
        return hasPraised;
    }

    /**
     * 
     * @param hasPraised
     *     The hasPraised
     */
    public void setHasPraised(Boolean hasPraised) {
        this.hasPraised = hasPraised;
    }

    /**
     * 
     * @return
     *     The hotIndex
     */
    public Integer getHotIndex() {
        return hotIndex;
    }

    /**
     * 
     * @param hotIndex
     *     The hotIndex
     */
    public void setHotIndex(Integer hotIndex) {
        this.hotIndex = hotIndex;
    }

    /**
     * 
     * @return
     *     The imgCnt
     */
    public Integer getImgCnt() {
        return imgCnt;
    }

    /**
     * 
     * @param imgCnt
     *     The imgCnt
     */
    public void setImgCnt(Integer imgCnt) {
        this.imgCnt = imgCnt;
    }

    /**
     * 
     * @return
     *     The imgTemplate
     */
    public Integer getImgTemplate() {
        return imgTemplate;
    }

    /**
     * 
     * @param imgTemplate
     *     The imgTemplate
     */
    public void setImgTemplate(Integer imgTemplate) {
        this.imgTemplate = imgTemplate;
    }

    /**
     * 
     * @return
     *     The imgs
     */
    public java.util.List<Img> getImgs() {
        return imgs;
    }

    /**
     * 
     * @param imgs
     *     The imgs
     */
    public void setImgs(java.util.List<Img> imgs) {
        this.imgs = imgs;
    }

    /**
     * 
     * @return
     *     The mate
     */
    public Mate getMate() {
        return mate;
    }

    /**
     * 
     * @param mate
     *     The mate
     */
    public void setMate(Mate mate) {
        this.mate = mate;
    }

    /**
     * 
     * @return
     *     The mateId
     */
    public Integer getMateId() {
        return mateId;
    }

    /**
     * 
     * @param mateId
     *     The mateId
     */
    public void setMateId(Integer mateId) {
        this.mateId = mateId;
    }

    /**
     * 
     * @return
     *     The originId
     */
    public Integer getOriginId() {
        return originId;
    }

    /**
     * 
     * @param originId
     *     The originId
     */
    public void setOriginId(Integer originId) {
        this.originId = originId;
    }

    /**
     * 
     * @return
     *     The praiseCnt
     */
    public Integer getPraiseCnt() {
        return praiseCnt;
    }

    /**
     * 
     * @param praiseCnt
     *     The praiseCnt
     */
    public void setPraiseCnt(Integer praiseCnt) {
        this.praiseCnt = praiseCnt;
    }

    /**
     * 
     * @return
     *     The remainSeconds
     */
    public Integer getRemainSeconds() {
        return remainSeconds;
    }

    /**
     * 
     * @param remainSeconds
     *     The remainSeconds
     */
    public void setRemainSeconds(Integer remainSeconds) {
        this.remainSeconds = remainSeconds;
    }

    /**
     * 
     * @return
     *     The schedulePlaces
     */
    public java.util.List<String> getSchedulePlaces() {
        return schedulePlaces;
    }

    /**
     * 
     * @param schedulePlaces
     *     The schedulePlaces
     */
    public void setSchedulePlaces(java.util.List<String> schedulePlaces) {
        this.schedulePlaces = schedulePlaces;
    }

    /**
     * 
     * @return
     *     The shareCnt
     */
    public Integer getShareCnt() {
        return shareCnt;
    }

    /**
     * 
     * @param shareCnt
     *     The shareCnt
     */
    public void setShareCnt(Integer shareCnt) {
        this.shareCnt = shareCnt;
    }

    /**
     * 
     * @return
     *     The showChat
     */
    public Boolean getShowChat() {
        return showChat;
    }

    /**
     * 
     * @param showChat
     *     The showChat
     */
    public void setShowChat(Boolean showChat) {
        this.showChat = showChat;
    }

    /**
     * 
     * @return
     *     The source
     */
    public Integer getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * 
     * @return
     *     The status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The time
     */
    public String getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    public void setTime(String time) {
        this.time = time;
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
     *     The top
     */
    public Boolean getTop() {
        return top;
    }

    /**
     * 
     * @param top
     *     The top
     */
    public void setTop(Boolean top) {
        this.top = top;
    }

    /**
     * 
     * @return
     *     The type
     */
    public Integer getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The userInfo
     */
    public UserInfo getUserInfo() {
        return userInfo;
    }

    /**
     * 
     * @param userInfo
     *     The userInfo
     */
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

}
