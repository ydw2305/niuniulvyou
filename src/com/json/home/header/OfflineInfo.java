package com.json.home.header;
import com.google.gson.annotations.Expose;

public class OfflineInfo {

    @Expose
    private String title;

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
