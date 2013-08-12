package com.eshop.framwork.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.util.List;

import com.eshop.framwork.queryfilter.IFilter;
import com.eshop.framwork.queryfilter.QueryFilter;

/**
 * ���ݷ���ͬһ�ӿ�
 * @author chenas
 * 2013��08��11��
 */

public interface ICrudDao extends IBaseDao{
	
	/**
	 *  ��������ָ���ĳ־û����� 
	 * @param obj
	 * @return true if success
	 */
	public Boolean saveOrUpdate(Object obj);
	
	/** 
	 * ����ָ��ID�ĳ־û����� 
	 * @param clazz
	 * @param id
	 * @return
	 */
	public Object loadById(Class clazz,Serializable id);
	
	/**
	 *  ɾ��ָ��ID�ĳ־û����� 
	 * @param clazz
	 * @param id
	 * @return true if success
	 */
	@SuppressWarnings("rawtypes")
	public Boolean delById(Class clazz,Serializable id);
	
	/**
	 * ɾ���־û�����
	 * @param object
	 * @return true if success
	 */
	public Boolean delObject(Object object);
	
	/**
	 *  װ��ָ��������г־û����� 
	 * @param clazz
	 * @return
	 */
	public List findObjList(String clazz);
	
	/**
	 *  ��ҳװ��ָ��������г־û����� 
	 * @param clazz
	 * @param filter
	 * @return
	 */
	public List findObjListByFilter(String clazz,IFilter filter);
	
	/**
	 *  ͳ��ָ��������г־û����� 
	 * @param clazz
	 * @return
	 */
	public int countObj(String clazz);
	
	/**
	 *  ���ݹ�������ͳ��ָ������ 
	 * @param clazz
	 * @param filter
	 * @return
	 */
	public int countObjByFilter(String clazz, IFilter filter);
	
	/**
	 *  ������������ 
	 * @param hql
	 * @return �����µ�����
	 */
	public int update(String hql, IFilter filter);
	
	/**
	 *  �����ӳ���ȡ��һ��JDBC���� 
	 * @return
	 */
	public Connection getConnection();

}
