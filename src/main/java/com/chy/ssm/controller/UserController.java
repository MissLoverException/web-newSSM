package com.chy.ssm.controller;

import com.chy.ssm.model.User;
import com.chy.ssm.service.UserService;
import com.google.common.collect.Lists;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2017/8/23 0023.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    private Logger log = Logger.getLogger(UserController.class);

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model) {
        List<User> userList = Lists.newArrayList();
        log.info("查询用户信息");
        userList = userService.getUser();
        log.info("成功");
        model.addAttribute("userList", userList);
        return "showUser";

    }
}
