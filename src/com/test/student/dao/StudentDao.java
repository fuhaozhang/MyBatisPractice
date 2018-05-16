package com.test.student.dao;

import java.util.List;
import java.util.Map;

import com.test.student.domain.Student;


public interface StudentDao {

	/**
	 *  一对一，方式1
	 */
	List<Student> selectAllStudent1();  
	/**
	 *  一对一，方式1 ,带查询条件
	 */
	List<Student> selectAllStudent11(Map<String,Object> param);  
	/**
	 *  一对一，方式2
	 */  
    List<Student> selectAllStudent2();  
    /**
	 *  一对一，方式3
	 */
    List<Student> selectAllStudent3(); 
    
}
