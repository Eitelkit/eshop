package com.base.framwork.dao;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * ʵ��IBaseDao��
 * @author chenas
 *2013��08��11��
 */
public class BaseDao implements IBaseDao{

	@Resource
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
}
