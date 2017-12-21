package com.chy.ssm.service.impl;

import com.chy.ssm.mapper.UserMapper;
import com.chy.ssm.model.User;
import com.chy.ssm.service.UserService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/8/22 0022.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;


    public List<User> getUser() {
        List<User> userList = Lists.newArrayList();
        userList = userMapper.selectAllUser();
        return userList;
    }

    public User getUserByPhoneOrEmail(String emailOrPhone, Short state) {
        User user;
        user = userMapper.selectUserByPhoneOrEmail(emailOrPhone, state);
        return user;
    }

    public User getUserById(Long userId) {
        User user;
        user = userMapper.selectUserById(userId);
        return user;
    }
}
