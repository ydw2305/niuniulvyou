package com.json.foundjinxuan;
import com.google.gson.annotations.Expose;

public class UserInfo {

    @Expose
    private Integer age;
    @Expose
    private String custIndentity;
    @Expose
    private String headImage;
    @Expose
    private String largeAvatar;
    @Expose
    private Integer level;
    @Expose
    private String nickName;
    @Expose
    private Integer sex;
    @Expose
    private String tag;
    @Expose
    private Integer userFollowStatus;
    @Expose
    private Integer userId;
    @Expose
    private String userName;

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
     *     The custIndentity
     */
    public String getCustIndentity() {
        return custIndentity;
    }

    /**
     * 
     * @param custIndentity
     *     The custIndentity
     */
    public void setCustIndentity(String custIndentity) {
        this.custIndentity = custIndentity;
    }

    /**
     * 
     * @return
     *     The headImage
     */
    public String getHeadImage() {
        return headImage;
    }

    /**
     * 
     * @param headImage
     *     The headImage
     */
    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    /**
     * 
     * @return
     *     The largeAvatar
     */
    public String getLargeAvatar() {
        return largeAvatar;
    }

    /**
     * 
     * @param largeAvatar
     *     The largeAvatar
     */
    public void setLargeAvatar(String largeAvatar) {
        this.largeAvatar = largeAvatar;
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
     *     The nickName
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 
     * @param nickName
     *     The nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
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
     *     The tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * 
     * @param tag
     *     The tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * 
     * @return
     *     The userFollowStatus
     */
    public Integer getUserFollowStatus() {
        return userFollowStatus;
    }

    /**
     * 
     * @param userFollowStatus
     *     The userFollowStatus
     */
    public void setUserFollowStatus(Integer userFollowStatus) {
        this.userFollowStatus = userFollowStatus;
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

    /**
     * 
     * @return
     *     The userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 
     * @param userName
     *     The userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

}
