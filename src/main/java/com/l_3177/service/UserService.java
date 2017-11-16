package com.l_3177.service;

import com.l_3177.entity.User;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll(RowBounds rowBounds);
}
