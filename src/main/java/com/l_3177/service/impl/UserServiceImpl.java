package com.l_3177.service.impl;


import com.l_3177.dao.UserDao;
import com.l_3177.entity.User;
import com.l_3177.service.UserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Long id) {
        return userDao.findById(id);
    }

    @Override
    public List<User> findAll(RowBounds rowBounds) {
        return userDao.findAll(rowBounds);
    }
}
