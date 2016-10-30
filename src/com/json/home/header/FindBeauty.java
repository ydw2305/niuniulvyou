package com.json.home.header;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class FindBeauty {

    @Expose
    private String title;
    @Expose
    private List<Service_> services = new ArrayList<Service_>();

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
     *     The services
     */
    public List<Service_> getServices() {
        return services;
    }

    /**
     * 
     * @param services
     *     The services
     */
    public void setServices(List<Service_> services) {
        this.services = services;
    }

}
