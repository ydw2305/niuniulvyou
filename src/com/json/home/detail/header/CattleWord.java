package com.json.home.detail.header;
import com.google.gson.annotations.Expose;

public class CattleWord {

    @Expose
    private String cattleSj;
    @Expose
    private String cattleDl;
    @Expose
    private String cattleXc;
    @Expose
    private String cattleZs;

    /**
     * 
     * @return
     *     The cattleSj
     */
    public String getCattleSj() {
        return cattleSj;
    }

    /**
     * 
     * @param cattleSj
     *     The cattleSj
     */
    public void setCattleSj(String cattleSj) {
        this.cattleSj = cattleSj;
    }

    /**
     * 
     * @return
     *     The cattleDl
     */
    public String getCattleDl() {
        return cattleDl;
    }

    /**
     * 
     * @param cattleDl
     *     The cattleDl
     */
    public void setCattleDl(String cattleDl) {
        this.cattleDl = cattleDl;
    }

    /**
     * 
     * @return
     *     The cattleXc
     */
    public String getCattleXc() {
        return cattleXc;
    }

    /**
     * 
     * @param cattleXc
     *     The cattleXc
     */
    public void setCattleXc(String cattleXc) {
        this.cattleXc = cattleXc;
    }

    /**
     * 
     * @return
     *     The cattleZs
     */
    public String getCattleZs() {
        return cattleZs;
    }

    /**
     * 
     * @param cattleZs
     *     The cattleZs
     */
    public void setCattleZs(String cattleZs) {
        this.cattleZs = cattleZs;
    }

}
