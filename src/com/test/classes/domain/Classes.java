package com.test.classes.domain;

import java.util.List;

/**
 * 
 * @author Henry
 * 
 * CREATE TABLE `classes` (
  `class_id` int(11) NOT NULL AUTO_INCREMENT,
  `class_name` varchar(255) DEFAULT NULL,
  KEY `class_id` (`class_id`)
  ) ENGINE=InnoDB AUTO_INCREMENT=1003 DEFAULT CHARSET=utf8;

insert  into `classes`(`class_id`,`class_name`) values (1001,'一班'),(1002,'二班');
 *
 */
public class Classes {

	private Integer classId;  
	  
	private String className;
	
	private List<Student> student;//一对多，一个教室里面有多个学生

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}





}
