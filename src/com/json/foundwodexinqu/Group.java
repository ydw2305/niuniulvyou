package com.json.foundwodexinqu;
import com.google.gson.annotations.Expose;

public class Group {

    @Expose
    private Integer groupId;
    @Expose
    private String groupName;
    @Expose
    private Boolean open;

    /**
     * 
     * @return
     *     The groupId
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * 
     * @param groupId
     *     The groupId
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 
     * @return
     *     The groupName
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 
     * @param groupName
     *     The groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * 
     * @return
     *     The open
     */
    public Boolean getOpen() {
        return open;
    }

    /**
     * 
     * @param open
     *     The open
     */
    public void setOpen(Boolean open) {
        this.open = open;
    }

}
