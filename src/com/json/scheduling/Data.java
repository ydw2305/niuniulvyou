package com.json.scheduling;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;

public class Data {

    @Expose
    private Integer sum;
    @Expose
    private Integer totalPage;
    @Expose
    private java.util.List<List> list = new ArrayList<List>();

    /**
     * 
     * @return
     *     The sum
     */
    public Integer getSum() {
        return sum;
    }

    /**
     * 
     * @param sum
     *     The sum
     */
    public void setSum(Integer sum) {
        this.sum = sum;
    }

    /**
     * 
     * @return
     *     The totalPage
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    /**
     * 
     * @param totalPage
     *     The totalPage
     */
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    /**
     * 
     * @return
     *     The list
     */
    public java.util.List<List> getList() {
        return list;
    }

    /**
     * 
     * @param list
     *     The list
     */
    public void setList(java.util.List<List> list) {
        this.list = list;
    }

}
