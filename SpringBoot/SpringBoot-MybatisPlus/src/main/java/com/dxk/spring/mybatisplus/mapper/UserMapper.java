package com.dxk.spring.mybatisplus.mapper;

import com.dxk.spring.mybatisplus.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Date: 2021/10/10 23:46
 * @Author: DingXingKai
 * @Description: 用户操作持久层Mapper
 */
@Mapper
public interface UserMapper {
    @Select("select * from t_user")
    List<User> getAllUsers();
}
