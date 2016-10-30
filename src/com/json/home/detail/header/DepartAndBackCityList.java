package com.json.home.detail.header;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class DepartAndBackCityList {

    @Expose
    private Go go;
    @Expose
    private List<Object> backList = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The go
     */
    public Go getGo() {
        return go;
    }

    /**
     * 
     * @param go
     *     The go
     */
    public void setGo(Go go) {
        this.go = go;
    }

    /**
     * 
     * @return
     *     The backList
     */
    public List<Object> getBackList() {
        return backList;
    }

    /**
     * 
     * @param backList
     *     The backList
     */
    public void setBackList(List<Object> backList) {
        this.backList = backList;
    }

}
