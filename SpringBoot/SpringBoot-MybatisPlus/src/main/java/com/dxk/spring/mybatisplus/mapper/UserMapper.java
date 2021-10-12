package com.dxk.spring.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dxk.spring.mybatisplus.domain.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Date: 2021/10/10 23:46
 * @Author: DingXingKai
 * @Description: 用户操作持久层Mapper
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
