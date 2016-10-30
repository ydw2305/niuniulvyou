package com.json.details.taocan;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class Data {

    @Expose
    private String streamId;
    @Expose
    private Integer pageCount;
    @Expose
    private Integer count;
    @Expose
    private List<Row> rows = new ArrayList<Row>();
    @Expose
    private Secondary secondary;
    @Expose
    private String packCacheKey;
    @Expose
    private String tagCacheKey;

    /**
     * 
     * @return
     *     The streamId
     */
    public String getStreamId() {
        return streamId;
    }

    /**
     * 
     * @param streamId
     *     The streamId
     */
    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    /**
     * 
     * @return
     *     The pageCount
     */
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * 
     * @param pageCount
     *     The pageCount
     */
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

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
     *     The rows
     */
    public List<Row> getRows() {
        return rows;
    }

    /**
     * 
     * @param rows
     *     The rows
     */
    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    /**
     * 
     * @return
     *     The secondary
     */
    public Secondary getSecondary() {
        return secondary;
    }

    /**
     * 
     * @param secondary
     *     The secondary
     */
    public void setSecondary(Secondary secondary) {
        this.secondary = secondary;
    }

    /**
     * 
     * @return
     *     The packCacheKey
     */
    public String getPackCacheKey() {
        return packCacheKey;
    }

    /**
     * 
     * @param packCacheKey
     *     The packCacheKey
     */
    public void setPackCacheKey(String packCacheKey) {
        this.packCacheKey = packCacheKey;
    }

    /**
     * 
     * @return
     *     The tagCacheKey
     */
    public String getTagCacheKey() {
        return tagCacheKey;
    }

    /**
     * 
     * @param tagCacheKey
     *     The tagCacheKey
     */
    public void setTagCacheKey(String tagCacheKey) {
        this.tagCacheKey = tagCacheKey;
    }

}
