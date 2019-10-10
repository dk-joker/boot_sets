package org.joker.springboot.mybatismultisource.db1.dao;

import org.apache.ibatis.annotations.Select;
import org.joker.springboot.mybatismultisource.entity.User;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author tangkun
 * @version 1.0.0
 * @since 2019-10-09 20:00
 */
@Qualifier("db1SqlSessionTemplate")
public interface UserDao {
    /**
     * 通过名字查询用户信息
     */
    @Select("SELECT * FROM user WHERE name = #{name}")
    User findUserByName(String name);

}

