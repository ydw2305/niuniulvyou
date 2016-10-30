package com.json.home.detail.header;
import com.google.gson.annotations.Expose;

public class CompList {

    @Expose
    private String specName;
    @Expose
    private Integer satisfaction;

    /**
     * 
     * @return
     *     The specName
     */
    public String getSpecName() {
        return specName;
    }

    /**
     * 
     * @param specName
     *     The specName
     */
    public void setSpecName(String specName) {
        this.specName = specName;
    }

    /**
     * 
     * @return
     *     The satisfaction
     */
    public Integer getSatisfaction() {
        return satisfaction;
    }

    /**
     * 
     * @param satisfaction
     *     The satisfaction
     */
    public void setSatisfaction(Integer satisfaction) {
        this.satisfaction = satisfaction;
    }

}
