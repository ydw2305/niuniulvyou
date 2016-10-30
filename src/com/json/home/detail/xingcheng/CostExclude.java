package com.json.home.detail.xingcheng;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class CostExclude {

    @Expose
    private String title;
    @Expose
    private List<String> content = new ArrayList<String>();

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
     *     The content
     */
    public List<String> getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The content
     */
    public void setContent(List<String> content) {
        this.content = content;
    }

}
