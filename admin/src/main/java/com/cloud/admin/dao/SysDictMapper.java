package com.cloud.admin.dao;

import java.util.List;

import com.cloud.admin.model.SysDict;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysDictMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysDict record);

    int insertSelective(SysDict record);

    SysDict selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysDict record);

    int updateByPrimaryKey(SysDict record);
    
    List<SysDict> findPage();
    
    List<SysDict> findPageByLabel(@Param(value = "label") String label);

    List<SysDict> findByLable(@Param(value = "label") String label);
}