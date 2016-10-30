package com.json.foundjinxuan;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
public class Tags {

    @Expose
    private List<Ad> ads = new ArrayList<Ad>();
    @Expose
    private String appNavUrl;
    @Expose
    private String background;
    @Expose
    private List<String> countList = new ArrayList<String>();
    @Expose
    private String h5NavUrl;
    @Expose
    private Integer id;
    @Expose
    private List<Line> lines = new ArrayList<Line>();
    @Expose
    private String logoBottomTxt;
    @Expose
    private String logoTopTxt;
    @Expose
    private String tagImgUrl;
    @Expose
    private String title;

    /**
     * 
     * @return
     *     The ads
     */
    public List<Ad> getAds() {
        return ads;
    }

    /**
     * 
     * @param ads
     *     The ads
     */
    public void setAds(List<Ad> ads) {
        this.ads = ads;
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
     *     The background
     */
    public String getBackground() {
        return background;
    }

    /**
     * 
     * @param background
     *     The background
     */
    public void setBackground(String background) {
        this.background = background;
    }

    /**
     * 
     * @return
     *     The countList
     */
    public List<String> getCountList() {
        return countList;
    }

    /**
     * 
     * @param countList
     *     The countList
     */
    public void setCountList(List<String> countList) {
        this.countList = countList;
    }

    /**
     * 
     * @return
     *     The h5NavUrl
     */
    public String getH5NavUrl() {
        return h5NavUrl;
    }

    /**
     * 
     * @param h5NavUrl
     *     The h5NavUrl
     */
    public void setH5NavUrl(String h5NavUrl) {
        this.h5NavUrl = h5NavUrl;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The lines
     */
    public List<Line> getLines() {
        return lines;
    }

    /**
     * 
     * @param lines
     *     The lines
     */
    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    /**
     * 
     * @return
     *     The logoBottomTxt
     */
    public String getLogoBottomTxt() {
        return logoBottomTxt;
    }

    /**
     * 
     * @param logoBottomTxt
     *     The logoBottomTxt
     */
    public void setLogoBottomTxt(String logoBottomTxt) {
        this.logoBottomTxt = logoBottomTxt;
    }

    /**
     * 
     * @return
     *     The logoTopTxt
     */
    public String getLogoTopTxt() {
        return logoTopTxt;
    }

    /**
     * 
     * @param logoTopTxt
     *     The logoTopTxt
     */
    public void setLogoTopTxt(String logoTopTxt) {
        this.logoTopTxt = logoTopTxt;
    }

    /**
     * 
     * @return
     *     The tagImgUrl
     */
    public String getTagImgUrl() {
        return tagImgUrl;
    }

    /**
     * 
     * @param tagImgUrl
     *     The tagImgUrl
     */
    public void setTagImgUrl(String tagImgUrl) {
        this.tagImgUrl = tagImgUrl;
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

}
