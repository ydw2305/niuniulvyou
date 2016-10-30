package com.json.home.header;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class RecommendForYou {

    @Expose
    private Integer groupId;
    @Expose
    private String title;
    @Expose
    private List<Module> modules = new ArrayList<Module>();

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
     *     The modules
     */
    public List<Module> getModules() {
        return modules;
    }

    /**
     * 
     * @param modules
     *     The modules
     */
    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

}
