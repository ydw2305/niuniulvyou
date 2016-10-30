package com.json.details.taocan;
import com.google.gson.annotations.Expose;

public class SortType {

    @Expose
    private Integer optionId;
    @Expose
    private String optionName;
    @Expose
    private Boolean selected;

    /**
     * 
     * @return
     *     The optionId
     */
    public Integer getOptionId() {
        return optionId;
    }

    /**
     * 
     * @param optionId
     *     The optionId
     */
    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    /**
     * 
     * @return
     *     The optionName
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * 
     * @param optionName
     *     The optionName
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    /**
     * 
     * @return
     *     The selected
     */
    public Boolean getSelected() {
        return selected;
    }

    /**
     * 
     * @param selected
     *     The selected
     */
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

}
