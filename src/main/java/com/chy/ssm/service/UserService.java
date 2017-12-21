package com.chy.ssm.service;

import com.chy.ssm.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/8/22 0022.
 */
public interface UserService {

    List<User> getUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(Long userId);

}
