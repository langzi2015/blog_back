package com.langzi.blog.controller;


import com.langzi.blog.common.lang.Result;
import com.langzi.blog.entity.User;
import com.langzi.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    //测试实体校验
    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user) {
        return Result.succ(user);
    }
}
