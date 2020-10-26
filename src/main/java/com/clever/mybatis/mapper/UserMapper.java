package com.clever.mybatis.mapper;

import com.clever.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ChenWang
 * @interfaceName UserMapper
 * @date 2020/10/26 15:03
 * @since JDK 1.8
 */
public interface UserMapper {
    int insert(@Param("user") User user);
    List<User> selectAll();
}
