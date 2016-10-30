package com.json.home.detail.header;
import com.google.gson.annotations.Expose;

public class TeamType {

    @Expose
    private Integer teamTypeId;
    @Expose
    private String teamTypeName;

    /**
     * 
     * @return
     *     The teamTypeId
     */
    public Integer getTeamTypeId() {
        return teamTypeId;
    }

    /**
     * 
     * @param teamTypeId
     *     The teamTypeId
     */
    public void setTeamTypeId(Integer teamTypeId) {
        this.teamTypeId = teamTypeId;
    }

    /**
     * 
     * @return
     *     The teamTypeName
     */
    public String getTeamTypeName() {
        return teamTypeName;
    }

    /**
     * 
     * @param teamTypeName
     *     The teamTypeName
     */
    public void setTeamTypeName(String teamTypeName) {
        this.teamTypeName = teamTypeName;
    }

}
