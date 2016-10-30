package com.json.home.header;
import com.google.gson.annotations.Expose;

public class Push {

    @Expose
    private String title;
    @Expose
    private Integer openFlag;

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
     *     The openFlag
     */
    public Integer getOpenFlag() {
        return openFlag;
    }

    /**
     * 
     * @param openFlag
     *     The openFlag
     */
    public void setOpenFlag(Integer openFlag) {
        this.openFlag = openFlag;
    }

}
