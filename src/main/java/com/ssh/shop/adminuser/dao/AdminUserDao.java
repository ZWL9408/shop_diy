package com.ssh.shop.adminuser.dao;

import com.ssh.shop.adminuser.vo.AdminUser;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class AdminUserDao extends HibernateDaoSupport {

	// Dao完成登录的代码
	public AdminUser login(AdminUser adminUser) {
		String hql = "from AdminUser where username = ?0 and password = ?1";
		List<AdminUser> list = (List<AdminUser>) this.getHibernateTemplate().find(hql, adminUser.getUsername(),adminUser.getPassword());
		if(list != null && list.size()>0){
			return list.get(0);
		}
		return null;
	}

}