package com.json.home.header;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class CategoryNew {

    @Expose
    private String title;
    @Expose
    private Integer style;
    @Expose
    private List<Ad> ads = new ArrayList<Ad>();

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

}
