package com.json.home.detail.header;
import com.google.gson.annotations.Expose;

public class Image {

    @Expose
    private String simage;
    @Expose
    private String bimage;

    /**
     * 
     * @return
     *     The simage
     */
    public String getSimage() {
        return simage;
    }

    /**
     * 
     * @param simage
     *     The simage
     */
    public void setSimage(String simage) {
        this.simage = simage;
    }

    /**
     * 
     * @return
     *     The bimage
     */
    public String getBimage() {
        return bimage;
    }

    /**
     * 
     * @param bimage
     *     The bimage
     */
    public void setBimage(String bimage) {
        this.bimage = bimage;
    }

}
