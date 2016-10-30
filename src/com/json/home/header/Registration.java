package com.json.home.header;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class Registration {

    @Expose
    private Object background;
    @Expose
    private List<RegistrationLeft> registrationLeft = new ArrayList<RegistrationLeft>();
    @Expose
    private RegistrationRight registrationRight;

    /**
     * 
     * @return
     *     The background
     */
    public Object getBackground() {
        return background;
    }

    /**
     * 
     * @param background
     *     The background
     */
    public void setBackground(Object background) {
        this.background = background;
    }

    /**
     * 
     * @return
     *     The registrationLeft
     */
    public List<RegistrationLeft> getRegistrationLeft() {
        return registrationLeft;
    }

    /**
     * 
     * @param registrationLeft
     *     The registrationLeft
     */
    public void setRegistrationLeft(List<RegistrationLeft> registrationLeft) {
        this.registrationLeft = registrationLeft;
    }

    /**
     * 
     * @return
     *     The registrationRight
     */
    public RegistrationRight getRegistrationRight() {
        return registrationRight;
    }

    /**
     * 
     * @param registrationRight
     *     The registrationRight
     */
    public void setRegistrationRight(RegistrationRight registrationRight) {
        this.registrationRight = registrationRight;
    }

}
