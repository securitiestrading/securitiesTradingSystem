package com.haoding.po;

public class StockBarReply {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_bar_reply.stock_bar_reply_id
     *
     * @mbggenerated
     */
    private Integer stockBarReplyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_bar_reply.stock_bar_reply_time
     *
     * @mbggenerated
     */
    private String stockBarReplyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_bar_reply.replayed_id
     *
     * @mbggenerated
     */
    private Integer replayedId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_bar_reply.stock_bar_reply_content
     *
     * @mbggenerated
     */
    private String stockBarReplyContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_bar_reply
     *
     * @mbggenerated
     */
    public StockBarReply(Integer stockBarReplyId, String stockBarReplyTime, Integer replayedId, String stockBarReplyContent) {
        this.stockBarReplyId = stockBarReplyId;
        this.stockBarReplyTime = stockBarReplyTime;
        this.replayedId = replayedId;
        this.stockBarReplyContent = stockBarReplyContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_bar_reply.stock_bar_reply_id
     *
     * @return the value of stock_bar_reply.stock_bar_reply_id
     *
     * @mbggenerated
     */
    public Integer getStockBarReplyId() {
        return stockBarReplyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_bar_reply.stock_bar_reply_time
     *
     * @return the value of stock_bar_reply.stock_bar_reply_time
     *
     * @mbggenerated
     */
    public String getStockBarReplyTime() {
        return stockBarReplyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_bar_reply.replayed_id
     *
     * @return the value of stock_bar_reply.replayed_id
     *
     * @mbggenerated
     */
    public Integer getReplayedId() {
        return replayedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_bar_reply.stock_bar_reply_content
     *
     * @return the value of stock_bar_reply.stock_bar_reply_content
     *
     * @mbggenerated
     */
    public String getStockBarReplyContent() {
        return stockBarReplyContent;
    }
}