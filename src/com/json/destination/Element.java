package com.json.destination;
import com.google.gson.annotations.Expose;

public class Element {

    @Expose
    private String description;
    @Expose
    private String appUrl;
    @Expose
    private Boolean isDiyName;
    @Expose
    private Boolean isHide;
    @Expose
    private String mUrl;
    @Expose
    private String imgUrl;
    @Expose
    private Integer catId;
    @Expose
    private Integer touristNum;
    public Integer getTouristNum() {
		return touristNum;
	}

	public void setTouristNum(Integer touristNum) {
		this.touristNum = touristNum;
	}

	@Expose
    private Integer playId;
    public String getmUrl() {
		return mUrl;
	}

	public void setmUrl(String mUrl) {
		this.mUrl = mUrl;
	}

	@Expose
    private String diyName;
    @Expose
    private Integer rank;
    @Expose
    private Integer style;
    @Expose
    private String hdUrl;
    @Expose
    private String eleName;

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The appUrl
     */
    public String getAppUrl() {
        return appUrl;
    }

    /**
     * 
     * @param appUrl
     *     The appUrl
     */
    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    /**
     * 
     * @return
     *     The isDiyName
     */
    public Boolean getIsDiyName() {
        return isDiyName;
    }

    /**
     * 
     * @param isDiyName
     *     The isDiyName
     */
    public void setIsDiyName(Boolean isDiyName) {
        this.isDiyName = isDiyName;
    }

    /**
     * 
     * @return
     *     The isHide
     */
    public Boolean getIsHide() {
        return isHide;
    }

    /**
     * 
     * @param isHide
     *     The isHide
     */
    public void setIsHide(Boolean isHide) {
        this.isHide = isHide;
    }

    /**
     * 
     * @return
     *     The mUrl
     */
    public String getMUrl() {
        return mUrl;
    }

    /**
     * 
     * @param mUrl
     *     The mUrl
     */
    public void setMUrl(String mUrl) {
        this.mUrl = mUrl;
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
     *     The catId
     */
    public Integer getCatId() {
        return catId;
    }

    /**
     * 
     * @param catId
     *     The catId
     */
    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    /**
     * 
     * @return
     *     The playId
     */
    public Integer getPlayId() {
        return playId;
    }

    /**
     * 
     * @param playId
     *     The playId
     */
    public void setPlayId(Integer playId) {
        this.playId = playId;
    }

    /**
     * 
     * @return
     *     The diyName
     */
    public String getDiyName() {
        return diyName;
    }

    /**
     * 
     * @param diyName
     *     The diyName
     */
    public void setDiyName(String diyName) {
        this.diyName = diyName;
    }

    /**
     * 
     * @return
     *     The rank
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * 
     * @param rank
     *     The rank
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * 
     * @return
     *     The style
     */
    public Integer getStyle() {
        return style;
    }

    /**
     * 
     * @param style
     *     The style
     */
    public void setStyle(Integer style) {
        this.style = style;
    }

    /**
     * 
     * @return
     *     The hdUrl
     */
    public String getHdUrl() {
        return hdUrl;
    }

    /**
     * 
     * @param hdUrl
     *     The hdUrl
     */
    public void setHdUrl(String hdUrl) {
        this.hdUrl = hdUrl;
    }

    /**
     * 
     * @return
     *     The eleName
     */
    public String getEleName() {
        return eleName;
    }

    /**
     * 
     * @param eleName
     *     The eleName
     */
    public void setEleName(String eleName) {
        this.eleName = eleName;
    }

}
