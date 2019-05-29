package com.haoding.mapper;

import com.haoding.po.UserTable;
import com.haoding.po.UserTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbggenerated
     */
    int countByExample(UserTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbggenerated
     */
    int deleteByExample(UserTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbggenerated
     */
    @Insert({
        "insert into user_table (user_id, password, ",
        "id_no, photo_url, account_balance)",
        "values (#{userId,jdbcType=CHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{idNo,jdbcType=CHAR}, #{photoUrl,jdbcType=VARCHAR}, #{accountBalance,jdbcType=DOUBLE})"
    })
    int insert(UserTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbggenerated
     */
    int insertSelective(UserTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbggenerated
     */
    List<UserTable> selectByExample(UserTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserTable record, @Param("example") UserTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserTable record, @Param("example") UserTableExample example);
}