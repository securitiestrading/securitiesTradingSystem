package com.haoding.po;

import java.util.Date;

public class EntrustTable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_table.entrust_id
     *
     * @mbggenerated
     */
    private String entrustId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_table.stock_id
     *
     * @mbggenerated
     */
    private Integer stockId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_table.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_table.resting_order_time
     *
     * @mbggenerated
     */
    private Date restingOrderTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_table.cancellation_time
     *
     * @mbggenerated
     */
    private Date cancellationTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_table.entrust_time
     *
     * @mbggenerated
     */
    private Date entrustTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_table.price
     *
     * @mbggenerated
     */
    private Double price;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust_table
     *
     * @mbggenerated
     */
    public EntrustTable(String entrustId, Integer stockId, Integer userId, Date restingOrderTime, Date cancellationTime, Date entrustTime, Double price) {
        this.entrustId = entrustId;
        this.stockId = stockId;
        this.userId = userId;
        this.restingOrderTime = restingOrderTime;
        this.cancellationTime = cancellationTime;
        this.entrustTime = entrustTime;
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_table.entrust_id
     *
     * @return the value of entrust_table.entrust_id
     *
     * @mbggenerated
     */
    public String getEntrustId() {
        return entrustId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_table.stock_id
     *
     * @return the value of entrust_table.stock_id
     *
     * @mbggenerated
     */
    public Integer getStockId() {
        return stockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_table.user_id
     *
     * @return the value of entrust_table.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_table.resting_order_time
     *
     * @return the value of entrust_table.resting_order_time
     *
     * @mbggenerated
     */
    public Date getRestingOrderTime() {
        return restingOrderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_table.cancellation_time
     *
     * @return the value of entrust_table.cancellation_time
     *
     * @mbggenerated
     */
    public Date getCancellationTime() {
        return cancellationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_table.entrust_time
     *
     * @return the value of entrust_table.entrust_time
     *
     * @mbggenerated
     */
    public Date getEntrustTime() {
        return entrustTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_table.price
     *
     * @return the value of entrust_table.price
     *
     * @mbggenerated
     */
    public Double getPrice() {
        return price;
    }
}