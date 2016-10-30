package com.json.destination;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class Floor {

    @Expose
    private Integer floorId;
    @Expose
    private String imgUrl;
    @Expose
    private Integer catId;
    @Expose
    private Integer count;
    @Expose
    private Integer rank;
    @Expose
    private String bgImg;
    @Expose
    private Integer style;
    @Expose
    private Boolean isHideFloor;
    @Expose
    private String floorName;
    @Expose
    private Boolean isDiyName;
    @Expose
    private Boolean isHide;
    @Expose
    private List<Element> element = new ArrayList<Element>();

    /**
     * 
     * @return
     *     The floorId
     */
    public Integer getFloorId() {
        return floorId;
    }

    /**
     * 
     * @param floorId
     *     The floorId
     */
    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
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
     *     The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(Integer count) {
        this.count = count;
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
     *     The bgImg
     */
    public String getBgImg() {
        return bgImg;
    }

    /**
     * 
     * @param bgImg
     *     The bgImg
     */
    public void setBgImg(String bgImg) {
        this.bgImg = bgImg;
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
     *     The isHideFloor
     */
    public Boolean getIsHideFloor() {
        return isHideFloor;
    }

    /**
     * 
     * @param isHideFloor
     *     The isHideFloor
     */
    public void setIsHideFloor(Boolean isHideFloor) {
        this.isHideFloor = isHideFloor;
    }

    /**
     * 
     * @return
     *     The floorName
     */
    public String getFloorName() {
        return floorName;
    }

    /**
     * 
     * @param floorName
     *     The floorName
     */
    public void setFloorName(String floorName) {
        this.floorName = floorName;
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
     *     The element
     */
    public List<Element> getElement() {
        return element;
    }

    /**
     * 
     * @param element
     *     The element
     */
    public void setElement(List<Element> element) {
        this.element = element;
    }

}
