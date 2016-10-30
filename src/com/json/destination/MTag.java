package com.json.destination;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class MTag {

    @Expose
    private Integer catId;
    @Expose
    private Integer tagId;
    @Expose
    private String diyName;
    @Expose
    private Integer rank;
    @Expose
    private String tagName;
    @Expose
    private Boolean isDiyName;
    @Expose
    private List<Module> modules = new ArrayList<Module>();
    @Expose
    private Integer isHide;

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
     *     The tagId
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * 
     * @param tagId
     *     The tagId
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
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
     *     The tagName
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * 
     * @param tagName
     *     The tagName
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
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
     *     The modules
     */
    public List<Module> getModules() {
        return modules;
    }

    /**
     * 
     * @param modules
     *     The modules
     */
    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    /**
     * 
     * @return
     *     The isHide
     */
    public Integer getIsHide() {
        return isHide;
    }

    /**
     * 
     * @param isHide
     *     The isHide
     */
    public void setIsHide(Integer isHide) {
        this.isHide = isHide;
    }

}
