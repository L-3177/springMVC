package com.l_3177.dao;

import com.l_3177.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("SELECT user_id AS id ,user_name AS name FROM tb_user WHERE user_id= #{id} ")
    User findById(@Param("id") Long id);

    List<User> findAll( RowBounds rowBounds);
}
