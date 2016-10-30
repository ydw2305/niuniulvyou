package com.json.foundwodexinqu;
import com.google.gson.annotations.Expose;

public class Img {

    @Expose
    private String imgDesc;
    @Expose
    private Integer imgH;
    @Expose
    private String imgUrl;
    @Expose
    private Integer imgW;

    /**
     * 
     * @return
     *     The imgDesc
     */
    public String getImgDesc() {
        return imgDesc;
    }

    /**
     * 
     * @param imgDesc
     *     The imgDesc
     */
    public void setImgDesc(String imgDesc) {
        this.imgDesc = imgDesc;
    }

    /**
     * 
     * @return
     *     The imgH
     */
    public Integer getImgH() {
        return imgH;
    }

    /**
     * 
     * @param imgH
     *     The imgH
     */
    public void setImgH(Integer imgH) {
        this.imgH = imgH;
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
     *     The imgW
     */
    public Integer getImgW() {
        return imgW;
    }

    /**
     * 
     * @param imgW
     *     The imgW
     */
    public void setImgW(Integer imgW) {
        this.imgW = imgW;
    }

}
