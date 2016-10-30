package com.json.home.detail.header;
import com.google.gson.annotations.Expose;

public class ProductFetureTag {

    @Expose
    private Integer conditionId;
    @Expose
    private String conditionName;

    /**
     * 
     * @return
     *     The conditionId
     */
    public Integer getConditionId() {
        return conditionId;
    }

    /**
     * 
     * @param conditionId
     *     The conditionId
     */
    public void setConditionId(Integer conditionId) {
        this.conditionId = conditionId;
    }

    /**
     * 
     * @return
     *     The conditionName
     */
    public String getConditionName() {
        return conditionName;
    }

    /**
     * 
     * @param conditionName
     *     The conditionName
     */
    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }

}
