package com.test.classes.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.plugins.Page;
import com.test.classes.domain.Classes;
import com.test.classes.domain.Student;

/*
 * 测试一对多，一个教师对应多个学生
 *
 */
public class ClassesDaoTest {

	public static void main(String[] args) throws Exception {
		// 读取mybatis-config.xml文件
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		// 初始化mybatis，创建SqlSessionFactory类的实例
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 创建Session实例
		SqlSession session = sqlSessionFactory.openSession();
		
		/**
		 * 根据班级ID查询班级信息
		 */
		
		Classes cl = session.selectOne("com.test.classes.dao.ClassesDao.getClasses", 1001);
		System.out.println(JSON.toJSONString(cl)); 
		System.out.println("-------------------------------------------");
		
		/**
		 * 一对多，map传参
		 */
		
		Map<String, Object> param=new HashMap<String, Object>(); 
		param.put("class_id", "1001"); 
		//param.put("name", "张三"); 
		List<Classes> classesList=session.selectList("com.test.classes.dao.ClassesDao.selectList", param);		
		System.out.println(JSON.toJSONString(classesList));  
		System.out.println("-------------------------------------------");
		for(Classes classes : classesList){
			System.out.println(  
	                "[ " +   
	                "classId = " + classes.getClassId() + ", " +   
	                "className = " + classes.getClassName() + ", " +   
	                " ]"  
	            );  
			for(Student students : classes.getStudent()){
				System.out.println(  
		                "[ " +   
		                "studentId = " + students.getStudentId() + ", " +   
		                "name = " + students.getName() + ", " + 
		                "age = " + students.getAge() + ", " + 
		                "classId = " + students.getClassId() + ", " + 
		                " ]"  
		            ); 
			}
			
		}
		
		
		/**
		 * test分页
		 */
		System.out.println("-------------------------------------------");
		int current = 1;
		int size = 5;
		
		Page<Classes> page = new Page<Classes>(current,size);
//		page.setCurrent(current);
//		page.setSize(size);
		System.out.println("当前页:"+page.getCurrent()+" 每页记录数:"+page.getSize()+" 分页记录数:"+page.getOffsetCurrent());
		int offsetCurrent = page.getOffsetCurrent();
		
		String class_id = "1001";
		
		Map<String,Object> parama = new HashMap<String,Object>();
		parama.put("class_id", class_id);
		int total=session.selectOne("com.test.classes.dao.ClassesDao.selectCount", parama);
		System.out.println("总数total:"+total);
		System.out.println("--------------------------------------------");
		
		page.setTotal(total);
		System.out.println("总页数:"+page.getPages());
		
		Map<String,Object> paramb = new HashMap<String,Object>();
		paramb.put("class_id", class_id);
		paramb.put("offsetCurrent", offsetCurrent);
		paramb.put("size", size);
		List<Classes> pageList=session.selectList("com.test.classes.dao.ClassesDao.selectPage", paramb);
		System.out.println(JSON.toJSONString(pageList));  
		System.out.println("-------------------------------------------");
		
		page.setRecords(pageList);
		
		System.out.println("page对象:"+JSON.toJSONString(page));  

		
		
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();
	}

}
