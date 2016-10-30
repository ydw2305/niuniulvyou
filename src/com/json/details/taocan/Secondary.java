package com.json.details.taocan;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class Secondary {

    @Expose
    private List<HotelStar> hotelStars = new ArrayList<HotelStar>();
    @Expose
    private List<Transportation> transportations = new ArrayList<Transportation>();
    @Expose
    private List<SortType> sortTypes = new ArrayList<SortType>();

    /**
     * 
     * @return
     *     The hotelStars
     */
    public List<HotelStar> getHotelStars() {
        return hotelStars;
    }

    /**
     * 
     * @param hotelStars
     *     The hotelStars
     */
    public void setHotelStars(List<HotelStar> hotelStars) {
        this.hotelStars = hotelStars;
    }

    /**
     * 
     * @return
     *     The transportations
     */
    public List<Transportation> getTransportations() {
        return transportations;
    }

    /**
     * 
     * @param transportations
     *     The transportations
     */
    public void setTransportations(List<Transportation> transportations) {
        this.transportations = transportations;
    }

    /**
     * 
     * @return
     *     The sortTypes
     */
    public List<SortType> getSortTypes() {
        return sortTypes;
    }

    /**
     * 
     * @param sortTypes
     *     The sortTypes
     */
    public void setSortTypes(List<SortType> sortTypes) {
        this.sortTypes = sortTypes;
    }

}
