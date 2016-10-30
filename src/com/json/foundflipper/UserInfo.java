package com.json.foundflipper;
import com.google.gson.annotations.Expose;

public class UserInfo {

    @Expose
    private String headImg;
    @Expose
    private String nickName;
    @Expose
    private Integer userId;

    /**
     * 
     * @return
     *     The headImg
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 
     * @param headImg
     *     The headImg
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
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
