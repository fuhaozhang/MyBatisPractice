package com.test.user.test;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.test.user.domain.User;



public class UserMapperTest {

	public static void main(String[] args) throws Exception {
		// 读取mybatis-config.xml文件
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		// 初始化mybatis，创建SqlSessionFactory类的实例
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		/**
		 * 新增
		 */
		// 创建Session实例
		SqlSession session = sqlSessionFactory.openSession();
		// 创建User对象
		User user = new User("test", "男", 30);
		// 插入数据
		session.insert("com.test.user.mapper.UserMapper.save", user);
		// 提交事务
		session.commit();
		System.out.println("插入成功！");
		// 关闭Session
		session.close();
		
		/**
		 * 更新
		 */
		// 创建Session实例
		SqlSession session2 = sqlSessionFactory.openSession();
		// 创建User对象
		/**
		 * 查询
		 */
		User user2 = session2.selectOne("com.test.user.mapper.UserMapper.selectUser",1);
		System.out.println("查询成功 user2:"+user2);
		// 修改User对象的属性值
		user2.setName("tom");
		user2.setAge(25);
		// 修改User对象
		session2.update("com.test.user.mapper.UserMapper.modifyUser", user2);
		// 提交事务
		session2.commit();
		System.out.println("更新成功！");
		// 关闭Session
		session2.close();
		

		/**
		 * 删除
		 */
		// 创建Session实例
		SqlSession session3 = sqlSessionFactory.openSession();
		session3.delete("com.test.user.mapper.UserMapper.removeUser", 2);
		// 提交事务
		session3.commit();
		System.out.println("删除成功！");
		// 关闭Session
		session3.close();
	}

}
