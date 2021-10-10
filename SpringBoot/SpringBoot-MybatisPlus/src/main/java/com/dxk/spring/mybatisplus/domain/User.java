package com.dxk.spring.mybatisplus.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Date: 2021/10/10 23:46
 * @Author: DingXingKai
 * @Description: 用户信息实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("t_user")
public class User {
    /**
     * 主键ID
     */
    @TableId
    private Integer id;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 密码
     */
    private String pwd;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 是否有效
     */
    private Integer type;
    /**
     * 注册时间 yyyy-MM-dd hh:mm:ss
     */
    private Date regTime;
}
