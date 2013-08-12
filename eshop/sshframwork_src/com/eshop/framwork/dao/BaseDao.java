package com.eshop.framwork.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * ʵ��IBaseDao��
 * @author chenas
 *2013��08��11��
 */

public class BaseDao implements IBaseDao{

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
