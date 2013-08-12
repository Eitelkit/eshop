package com.eshop.framwork.service;

import java.util.List;

import com.eshop.framwork.domain.BaseModel;
import com.eshop.framwork.domain.IUser;
import com.eshop.framwork.queryfilter.IFilter;

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
	public T findEntityById(long id);
	
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
	public List<T> findEntityListByFilter(IFilter filter);
	
	/**
	 * ���ݹ�������ѯ���м�¼
	 * @param filter
	 * @param isLimited 
	 * 			true��ʾ���з�ҳ
	 * 			false��ʾ�����з�ҳ
	 * @return
	 */
	public List<T> findEntityListByFilter(IFilter filter, Boolean isLimited);
	
	/**
	 * ����һ����¼
	 * @param entity
	 *            domain����
	 * @param user
	 * 			�����û�
	 * @return id
	 */
	public long insertEntity(T entity, IUser optUser);
	public long insertEntity(T entity);
	

	/**
	 * ��������idɾ�����ݿ��¼
	 * 
	 * @param id
	 *            ����id
	 * @param optUser
	 *            �����û�
	 *            
	 */         
	 
	public void deleteEntityById(long id, IUser optUser);
	
	/**
	 * ����idsɾ��������ݿ��¼
	 * 
	 * @param ids
	 *            ����id����
	 * @param optUser
	 *            �����û�
	 */
	public void deleteManyEntityById(long[] ids, IUser optUser);

	/**
	 * �������ݿ��¼
	 * 
	 * @param entity
	 *            domain����
	 * @param optUser
	 *            �����û�
	 */
	public void updateEntity(T entity, IUser optUser);
	
	/**
	 * ���ݹ������������ݿ��¼
	 * @param entity
	 *            domain����
	 * @param filter
	 * @param optUser
	 */
	public void updateEntityByFilter(T entity, IFilter filter, IUser optUser);
	
}
