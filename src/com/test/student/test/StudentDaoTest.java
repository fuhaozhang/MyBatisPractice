package com.test.student.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.chainsaw.Main;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.test.student.domain.Student;

public class StudentDaoTest {

	public static void main(String[] args) throws Exception {
		// 读取mybatis-config.xml文件
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		// 初始化mybatis，创建SqlSessionFactory类的实例
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 创建Session实例
		SqlSession session = sqlSessionFactory.openSession();
		
		/**
		 * 一对一，方法一
		 */
		List<Student> students1 =session.selectList("com.test.student.dao.StudentDao.selectAllStudent1");
		System.out.println(JSON.toJSONString(students1));  
		System.out.println("------------------------------------------");
		
		/**
		 * 一对一，方法一 ，map传参
		 */
		
		Map<String, Object> param=new HashMap<String, Object>(); 
		param.put("class_id", "1001"); 
		param.put("name", "张三"); 
		List<Student> students11=session.selectList("com.test.student.dao.StudentDao.selectAllStudent11", param);
		System.out.println(JSON.toJSONString(students11));  
		System.out.println("------------------------------------------");
		
		/**
		 * 一对一，方法二
		 */
		List<Student> students2 =session.selectList("com.test.student.dao.StudentDao.selectAllStudent2");
		System.out.println(JSON.toJSONString(students2));  
		System.out.println("------------------------------------------");
			
		
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();
	}
}
