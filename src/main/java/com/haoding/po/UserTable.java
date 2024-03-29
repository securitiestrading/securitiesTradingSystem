package com.haoding.po;

public class UserTable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_table.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_table.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_table.id_no
     *
     * @mbggenerated
     */
    private String idNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_table.photo_url
     *
     * @mbggenerated
     */
    private String photoUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_table.account_balance
     *
     * @mbggenerated
     */
    private Double accountBalance;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbggenerated
     */
    public UserTable(String userId, String password, String idNo, String photoUrl, Double accountBalance) {
        this.userId = userId;
        this.password = password;
        this.idNo = idNo;
        this.photoUrl = photoUrl;
        this.accountBalance = accountBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_table.user_id
     *
     * @return the value of user_table.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_table.password
     *
     * @return the value of user_table.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_table.id_no
     *
     * @return the value of user_table.id_no
     *
     * @mbggenerated
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_table.photo_url
     *
     * @return the value of user_table.photo_url
     *
     * @mbggenerated
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_table.account_balance
     *
     * @return the value of user_table.account_balance
     *
     * @mbggenerated
     */
    public Double getAccountBalance() {
        return accountBalance;
    }
}