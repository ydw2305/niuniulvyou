package com.json.destination;
import com.google.gson.annotations.Expose;

public class Destination {

    @Expose
    private Boolean success;
    @Expose
    private Integer errorCode;
    @Expose
    private String msg;
    @Expose
    private DestinationData data;

    /**
     * 
     * @return
     *     The success
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * 
     * @param success
     *     The success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * 
     * @return
     *     The errorCode
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * 
     * @param errorCode
     *     The errorCode
     */
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 
     * @return
     *     The msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 
     * @param msg
     *     The msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 
     * @return
     *     The data
     */
    public DestinationData getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(DestinationData data) {
        this.data = data;
    }

}
