package com.json.found.jiebanbanner;
import com.google.gson.annotations.Expose;

public class Jiebanbanner {

    @Expose
    private Data data;
    @Expose
    private Integer errorCode;
    @Expose
    private String msg;
    @Expose
    private Boolean success;
    @Expose
    private String traceId;

    /**
     * 
     * @return
     *     The data
     */
    public Data getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(Data data) {
        this.data = data;
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
     *     The traceId
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * 
     * @param traceId
     *     The traceId
     */
    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

}
