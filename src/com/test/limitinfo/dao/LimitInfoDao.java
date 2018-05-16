package com.test.limitinfo.dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.test.limitinfo.domain.LimitInfo;


public interface LimitInfoDao {

	List<LimitInfo> selectLimitInfoList(Map<String,Object> params);
	
	List<LimitInfo> selectLimitInfoList2(@Param("customer_id") String customer_id);
	
	
}
