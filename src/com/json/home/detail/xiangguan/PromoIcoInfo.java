package com.json.home.detail.xiangguan;

import com.google.gson.annotations.Expose;

public class PromoIcoInfo {

    @Expose
    private String promoIco;
    @Expose
    private String promoIcoDesc;

    /**
     * 
     * @return
     *     The promoIco
     */
    public String getPromoIco() {
        return promoIco;
    }

    /**
     * 
     * @param promoIco
     *     The promoIco
     */
    public void setPromoIco(String promoIco) {
        this.promoIco = promoIco;
    }

    /**
     * 
     * @return
     *     The promoIcoDesc
     */
    public String getPromoIcoDesc() {
        return promoIcoDesc;
    }

    /**
     * 
     * @param promoIcoDesc
     *     The promoIcoDesc
     */
    public void setPromoIcoDesc(String promoIcoDesc) {
        this.promoIcoDesc = promoIcoDesc;
    }

}
