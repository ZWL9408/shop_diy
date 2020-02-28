package com.ssh.shop.category.dao;

import com.ssh.shop.category.vo.Category;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class CategoryDao extends HibernateDaoSupport {

	//DAO层的查询所有一级分类的方法
	public List<Category> findAll() {
		String hql = "from Category";
		List<Category> list = (List<Category>) this.getHibernateTemplate().find(hql);
		return list;
	}

	// Dao中的保存一级分类的方法
	public void save(Category category) {
		this.getHibernateTemplate().save(category);
	}

	// Dao中根据一级分类id查询一级分类
	public Category findByCid(Integer cid) {
		return this.getHibernateTemplate().get(Category.class, cid);
	}

	// DAO中删除一级分类
	public void delete(Category category) {
		this.getHibernateTemplate().delete(category);
	}

	// Dao中修改一级分类
	public void update(Category category) {
		this.getHibernateTemplate().update(category);
	}

}
