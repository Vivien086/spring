package com.leven.spring.mapper;

import com.leven.spring.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {
    /**
     * 查询全部用户信息
     * @return
     */
    List<User> getAll();

    /**
     * 根据用户名查询单个用户信息
     * @param username
     * @return
     */
    @Select("select * from t_user where username=#{username}")
    User getUserByName(String username);

    /**
     * 根据ID 查询用户信息
     * @param id
     * @return
     */
    @Select("select * from t_user where id=#{id}")
    User getUserById(Integer id);

    @Insert("insert into t_user(username,password) values (#{username},#{password})")
    void insert(User user);

    @Insert("delete from t_user where id=#{#id}")
    void delete(Integer id);

    @Update("delete from t_user where id=#{#id}")
    void update(Integer id);
}
