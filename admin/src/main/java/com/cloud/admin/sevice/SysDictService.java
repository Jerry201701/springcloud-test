package com.cloud.admin.sevice;

import java.util.List;

import com.cloud.admin.model.SysDict;
import com.cloud.core.service.CurdService;
import org.springframework.stereotype.Repository;


/**
 * 字典管理
 * @author Louis
 * @date Oct 29, 2018
 */
@Repository
public interface SysDictService extends CurdService<SysDict> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysDict> findByLable(String lable);
}
