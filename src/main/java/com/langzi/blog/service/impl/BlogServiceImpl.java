package com.langzi.blog.service.impl;

import com.langzi.blog.entity.Blog;
import com.langzi.blog.mapper.BlogMapper;
import com.langzi.blog.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
