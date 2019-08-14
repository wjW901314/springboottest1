package com.example.springboottest1.mapper;

import com.example.springboottest1.entity.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface userMapper {

    //用户登录
    user userlogin(@Param("username") String username, @Param("password") String password);

    //注册新用户(方式1)
    int adduser(@Param("username") String username, @Param("password") String password, @Param("age") int age);

    //注册新用户（方式2）
    int adduser1(@Param("username") String username, @Param("password") String password, @Param("age") int age);
}