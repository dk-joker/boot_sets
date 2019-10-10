package org.joker.springboot.mybatismultisource.db2.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.joker.springboot.mybatismultisource.entity.Money;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author tangkun
 * @version 1.0.0
 * @since 2019-10-09 20:01
 */
@Qualifier("db2SqlSessionTemplate")
public interface MoneyDao {

    /**
     * 通过id 查看工资详情
     */
    @Select("SELECT * FROM money WHERE id = #{id}")
    Money findMoneyById(@Param("id") int id);
}

