package com.test.limitinfo.test;

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
import com.test.limitinfo.domain.LimitInfo;

public class LimitInfoTest {

	public static void main(String[] args) throws Exception {
		// 读取mybatis-config.xml文件
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		// 初始化mybatis，创建SqlSessionFactory类的实例
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(inputStream);
		// 创建Session实例
		SqlSession session = sqlSessionFactory.openSession();
		
		/**
		 * 根据customer_id 和 customer_name 查询总额度和分项额度信息
		 * (一对多)
		 */
		Map<String,Object> params = new HashMap<String,Object>();
		String customer_id = "200000025228";
		params.put("customer_id", customer_id);
		String customer_name = "百度公司";
		params.put("customer_name", customer_name);
		List<LimitInfo> limitInfo = session.selectList("com.test.limitinfo.dao.LimitInfoDao.selectLimitInfoList", params);
		System.out.println(JSON.toJSONString(limitInfo));  
		System.out.println("------------------------------------------");
		
		/**
		 * 根据customer_id  查询总额度和分项额度信息
		 * (一对多)
		 */
		String customer_id1="200000025228";
		List<LimitInfo> limitInfo1 = session.selectList("com.test.limitinfo.dao.LimitInfoDao.selectLimitInfoList2",customer_id1);
		System.out.println(JSON.toJSONString(limitInfo));  
		System.out.println("------------------------------------------");
		
		
		// 提交事务
		session.commit();
		// 关闭Session
		session.close();
	}

}
