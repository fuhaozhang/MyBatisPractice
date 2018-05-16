package com.test.classes.dao;

import java.util.List;
import java.util.Map;



import com.baomidou.mybatisplus.plugins.Page;
import com.test.classes.domain.Classes;

public interface ClassesDao {

	/**
	 * 根据班级ID查询班级信息
	 * @param classId
	 * @return
	 */
	Classes getClasses(Integer classId);   
	
	/**
	 * 查询列表
	 * @param param
	 * @return
	 */
	List<Classes> selectList(Map<String,Object> param);
	
	/**
	 * 查询总记录数 getTotal
	 */
	public int selectCount(Map<String,Object> param);
	
	/**
	 * 分页查询
	 * @param page
	 * @param state
	 * @return
	 */
	List<Classes> selectPage(Map<String,Object> param);
}
