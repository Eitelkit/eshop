package com.base.framwork.service;

import java.util.List;

import com.base.framwork.domain.BaseModel;
import com.base.framwork.domain.IUser;
import com.base.framwork.queryfilter.QueryFilter;

/**
 * ��ɾ�Ĳ�ҵ��ͨ�ýӿ�
 * @author chenas
 *
 * @param <T>
 * 2013.08.11
 */

public interface IEntityService<T extends BaseModel> extends IBaseService {
	
	/**
	 * ����Id����
	 * @param id
	 * 			����
	 * @return
	 */
	public T findEntityById(String id);
	
	/**
	 * �������ݿ������еļ�¼
	 * @return
	 */
	public List<T> findEntityList();
	
	/**
	 * ���ݹ�������ѯ���м�¼
	 * @param filter
	 * 			������
	 * @return
	 */
	public List<T> findEntityListByFilter(QueryFilter filter);
	
	/**
	 * ����һ����¼
	 * @param entity
	 *            domain����
	 * @param user
	 * 			�����û�
	 * @return id
	 */
	public String insertEntity(T entity, IUser optUser);

	/**
	 * ɾ���־û�ʵ��
	 * @param entity
	 * @param optUser
	 */
	public void deleteEntity(T entity, IUser optUser);
	
	/**
	 * ��������idɾ�����ݿ��¼
	 * 
	 * @param id
	 *            ����id
	 * @param optUser
	 *            �����û�
	 *            
	 */         
	public void deleteEntityById(String id, IUser optUser);
	
	/**
	 * ����idsɾ��������ݿ��¼
	 * 
	 * @param ids
	 *            ����id����
	 * @param optUser
	 *            �����û�
	 */
	public void deleteManyEntityById(String[] ids, IUser optUser);
	
	/**
	 * ����ɾ��
	 * @param entitys
	 * @param optUser
	 */
	public void deleteManyEntity(List<T> entitys, IUser optUser);

	/**
	 * �������ݿ��¼
	 * 
	 * @param entity
	 *            domain����
	 * @param optUser
	 *            �����û�
	 */
	public void updateEntity(T entity, IUser optUser);
	
}
