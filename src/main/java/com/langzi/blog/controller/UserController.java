package com.langzi.blog.controller;


import com.langzi.blog.common.lang.Result;
import com.langzi.blog.entity.User;
import com.langzi.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author langzi
 * @since 2020-08-24
 */
@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("index")
    public Object test() {
        User user=userService.getById(1L);
        return Result.succ(user);
    }
}
