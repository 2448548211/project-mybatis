package com.clever.mybatis.mapper;

import com.clever.mybatis.entity.Cate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ChenWang
 * @interfaceName CateMapper
 * @date 2020/10/26 19:49
 * @since JDK 1.8
 */
public interface CateMapper {
    int insert(@Param("cate") Cate cate);
    List<Cate> selectAll();
}
