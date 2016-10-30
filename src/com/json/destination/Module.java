package com.json.destination;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class Module {

    @Expose
    private Integer moduleId;
    @Expose
    private String title;
    @Expose
    private List<Floor> floors = new ArrayList<Floor>();

    /**
     * 
     * @return
     *     The moduleId
     */
    public Integer getModuleId() {
        return moduleId;
    }

    /**
     * 
     * @param moduleId
     *     The moduleId
     */
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

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
     *     The floors
     */
    public List<Floor> getFloors() {
        return floors;
    }

    /**
     * 
     * @param floors
     *     The floors
     */
    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

}
