package com.json.home.detail.xingcheng;
import com.google.gson.annotations.Expose;

public class FoodAndStays {

    @Expose
    private String food;
    @Expose
    private String stay;

    /**
     * 
     * @return
     *     The food
     */
    public String getFood() {
        return food;
    }

    /**
     * 
     * @param food
     *     The food
     */
    public void setFood(String food) {
        this.food = food;
    }

    /**
     * 
     * @return
     *     The stay
     */
    public String getStay() {
        return stay;
    }

    /**
     * 
     * @param stay
     *     The stay
     */
    public void setStay(String stay) {
        this.stay = stay;
    }

}
