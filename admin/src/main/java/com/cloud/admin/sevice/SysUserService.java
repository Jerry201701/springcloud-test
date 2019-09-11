package com.cloud.admin.sevice;

import java.util.List;
import java.util.Set;

import com.cloud.admin.model.SysUser;
import com.cloud.admin.model.SysUserRole;
import com.cloud.core.service.CurdService;

/**
 * 用户管理
 * @author Louis
 * @date Oct 29, 2018
 */
public interface SysUserService extends CurdService<SysUser> {

	SysUser findByName(String username);

	/**
	 * 查找用户的菜单权限标识集合
	 * @param userName
	 * @return
	 */
	Set<String> findPermissions(String userName);

	/**
	 * 查找用户的角色集合
	 * @param userId
	 * @return
	 */
	List<SysUserRole> findUserRoles(Long userId);

}
