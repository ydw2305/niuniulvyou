package com.json.foundjinxuan;
import java.util.ArrayList;
import com.google.gson.annotations.Expose;

public class Data {

    @Expose
    private Integer count;
    @Expose
    private java.util.List<List> list = new ArrayList<List>();
    @Expose
    private Integer msgCnt;
    @Expose
    private long timestamp;

    /**
     * 
     * @return
     *     The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(Integer count) {
        this.count = count;
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

    /**
     * 
     * @return
     *     The msgCnt
     */
    public Integer getMsgCnt() {
        return msgCnt;
    }

    /**
     * 
     * @param msgCnt
     *     The msgCnt
     */
    public void setMsgCnt(Integer msgCnt) {
        this.msgCnt = msgCnt;
    }

    /**
     * 
     * @return
     *     The timestamp
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *     The timestamp
     */
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

}
