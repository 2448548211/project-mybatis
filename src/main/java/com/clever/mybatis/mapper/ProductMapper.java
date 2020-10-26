package com.clever.mybatis.mapper;

import com.clever.mybatis.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ChenWang
 * @interfaceName ProductMapper
 * @date 2020/10/26 19:51
 * @since JDK 1.8
 */
public interface ProductMapper {
    int insert(@Param("product") Product product);
    List<Product> selectAllByCateId(@Param("cateId")int cateId);
}
