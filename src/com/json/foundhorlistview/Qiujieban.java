package com.json.foundhorlistview;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class Qiujieban {

    @Expose
    private List<Datum> data = new ArrayList<Datum>();
    @Expose
    private Integer errorCode;
    @Expose
    private String msg;
    @Expose
    private Boolean success;

    /**
     * 
     * @return
     *     The data
     */
    public List<Datum> getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(List<Datum> data) {
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

}
