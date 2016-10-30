package com.json.found.jiebanghorlistview;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class Data {

    @Expose
    private List<Banner> banners = new ArrayList<Banner>();

    /**
     * 
     * @return
     *     The banners
     */
    public List<Banner> getBanners() {
        return banners;
    }

    /**
     * 
     * @param banners
     *     The banners
     */
    public void setBanners(List<Banner> banners) {
        this.banners = banners;
    }

}
