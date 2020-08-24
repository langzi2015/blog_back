package com.langzi.blog.service.impl;

import com.langzi.blog.entity.User;
import com.langzi.blog.mapper.UserMapper;
import com.langzi.blog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author langzi
 * @since 2020-08-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
