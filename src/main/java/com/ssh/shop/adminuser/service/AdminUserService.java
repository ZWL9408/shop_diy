package com.ssh.shop.adminuser.service;

import com.ssh.shop.adminuser.dao.AdminUserDao;
import com.ssh.shop.adminuser.vo.AdminUser;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AdminUserService {
	// 注入Dao
	private AdminUserDao adminUserDao;

	public void setAdminUserDao(AdminUserDao adminUserDao) {
		this.adminUserDao = adminUserDao;
	}


	public AdminUser login(AdminUser adminUser) {
		return adminUserDao.login(adminUser);
	}

}