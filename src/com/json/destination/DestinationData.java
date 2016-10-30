package com.json.destination;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class DestinationData {

    @Expose
    private List<MTag> tags = new ArrayList<MTag>();

    /**
     * 
     * @return
     *     The tags
     */
    public List<MTag> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    public void setTags(List<MTag> tags) {
        this.tags = tags;
    }

}
