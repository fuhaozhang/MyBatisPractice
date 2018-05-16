package com.test.classes.domain;

/**
 * 
 * @author Henry
 * 
 * CREATE TABLE `student` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  KEY `student_id` (`student_id`)
  ) ENGINE=InnoDB AUTO_INCREMENT=10004 DEFAULT CHARSET=utf8;

insert  into `student`(`student_id`,`name`,`age`,`class_id`) values (10001,'张三',20,1001),(10002,'李四',21,1001),(10003,'王五',22,1002);

 *
 */
public class Student {
	private Integer studentId;  
	  
    private String name;  
  
    private Integer age;  
  
    private Integer classId;  

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

}
