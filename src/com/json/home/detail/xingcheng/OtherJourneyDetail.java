package com.json.home.detail.xingcheng;
import com.google.gson.annotations.Expose;

public class OtherJourneyDetail {

    @Expose
    private String image;
    @Expose
    private String fileName;
    @Expose
    private String pdfPath;

    /**
     * 
     * @return
     *     The image
     */
    public String getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 
     * @param fileName
     *     The fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 
     * @return
     *     The pdfPath
     */
    public String getPdfPath() {
        return pdfPath;
    }

    /**
     * 
     * @param pdfPath
     *     The pdfPath
     */
    public void setPdfPath(String pdfPath) {
        this.pdfPath = pdfPath;
    }

}
