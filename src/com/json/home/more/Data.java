package com.json.home.more;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class Data {

    @Expose
    private Integer totalPageCount;
    @Expose
    private List<Product> products = new ArrayList<Product>();

    /**
     * 
     * @return
     *     The totalPageCount
     */
    public Integer getTotalPageCount() {
        return totalPageCount;
    }

    /**
     * 
     * @param totalPageCount
     *     The totalPageCount
     */
    public void setTotalPageCount(Integer totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    /**
     * 
     * @return
     *     The products
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * 
     * @param products
     *     The products
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
