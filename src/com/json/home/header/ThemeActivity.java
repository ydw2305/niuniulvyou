package com.json.home.header;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class ThemeActivity {

    @Expose
    private Integer index;
    @Expose
    private List<Object> blocks = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The index
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * 
     * @param index
     *     The index
     */
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * 
     * @return
     *     The blocks
     */
    public List<Object> getBlocks() {
        return blocks;
    }

    /**
     * 
     * @param blocks
     *     The blocks
     */
    public void setBlocks(List<Object> blocks) {
        this.blocks = blocks;
    }

}
