package com.clever.mybatis.sstest;

import com.clever.mybatis.entity.User;
import com.clever.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

/**
 * @author ChenWang
 * @className UserService
 * @date 2020/10/26 18:37
 * @since JDK 1.8
 */
public class UserTest {
    public static void main(String[] args) {
        //工厂模式创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
                UserTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        //通过工厂打开SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //通过SqlSession以及传入的指定类对象获取mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAll();

        System.out.println(users);

    }
}
