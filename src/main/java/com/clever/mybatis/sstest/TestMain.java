package com.clever.mybatis.sstest;

import com.clever.mybatis.entity.Cate;
import com.clever.mybatis.entity.Product;
import com.clever.mybatis.mapper.CateMapper;
import com.clever.mybatis.mapper.ProductMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author ChenWang
 * @className TestMain
 * @date 2020/10/26 19:49
 * @since JDK 1.8
 */
public class TestMain {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
                TestMain.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
        );
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CateMapper cateMapper = sqlSession.getMapper(CateMapper.class);
        final ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
        Cate cate = new Cate();
        cate.setTitle("OPPO手机");
        int insert = cateMapper.insert(cate);
        System.out.println(insert);
        Product product = null;
        for (int i = 0; i < 2; i++) {
            product = new Product();
            product.setContent("xxx"+i);
            product.setCateId(cate.getCateId());
            product.setPrice(new BigDecimal(9999));
            product.setTitle("xiaomi"+i);
            productMapper.insert(product);
        }
        List<Cate> cates = cateMapper.selectAll();
        cates.forEach(item->{
            List<Product> products = productMapper.selectAllByCateId(item.getCateId());
            item.setList(products);
        });
        System.out.println(cates);
    }
}
