package com.json.home.header;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class Specials {

    @Expose
    private String style;
    @Expose
    private List<Content_> content = new ArrayList<Content_>();

    /**
     * 
     * @return
     *     The style
     */
    public String getStyle() {
        return style;
    }

    /**
     * 
     * @param style
     *     The style
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * 
     * @return
     *     The content
     */
    public List<Content_> getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The content
     */
    public void setContent(List<Content_> content) {
        this.content = content;
    }

}
