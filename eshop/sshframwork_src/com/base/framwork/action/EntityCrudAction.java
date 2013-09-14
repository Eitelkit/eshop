package com.base.framwork.action;

import org.apache.struts2.interceptor.validation.SkipValidation;

import com.base.framwork.domain.BaseModel;

/**
 * ��ɾ�Ĳ�ͨ��action
 * @author chenas
 *
 * @param <T>
 */
public class EntityCrudAction<T extends BaseModel> extends EntityBaseAction<T>{
	
	protected T entity;
	
	//������ʾ��Ϣ�Ƿ���
	private boolean enableMessage = true;
	
	/**
	 * ��������ҳ��
	 * @return ����ɹ�
	 * @throws Exception
	 */
	@SkipValidation
	public String intoAdd() throws Exception{
		commonOperations();
		return SUCCESS;
	}


	/**
	 * �����޸�ҳִ�еķ���
	 * @return ִ�гɹ�
	 * @throws Exception
	 */
	@SkipValidation
	public String intoEdit() throws Exception {
		commonOperations();
		setEntity(entityService.findEntityById(getId()));
		return SUCCESS;
	}
	
	/**
	 * ����鿴ִ�еķ���
	 * @return ִ�гɹ�
	 * @throws Exception
	 */
	@SkipValidation
	public String intoView() throws Exception {
		commonOperations();
		setEntity(entityService.findEntityById(getId()));
		return SUCCESS;
	}

	/**
	 * �ύ����ִ�еķ���
	 * @return �б�ҳ
	 * @throws Exception
	 */
	public String submitAdd() throws Exception {
		entityService.insertEntity(getEntity(), getLoginUser());
		if (isEnableMessage()) {
			savedMessage();
		}
		return "list";
	}

	private void savedMessage() {
		// TODO Auto-generated method stub
		
	}


	/**
	 * �ύ�޸�ִ�еķ���
	 * @return �б�ҳ
	 * @throws Exception
	 */
	public String submitEdit() throws Exception {
		entityService.updateEntity(getEntity(), getLoginUser());
		if (isEnableMessage()) {
			updatedMessage();
		}
		return "list";
	}

	private void updatedMessage() {
		// TODO Auto-generated method stub
		
	}


	/**
	 * �ύɾ��ִ�еķ���
	 * @return �б�ҳ
	 * @throws Exception
	 */
	@SkipValidation
	public String submitDelete() throws Exception {
		entityService.deleteEntityById(getId(), getLoginUser());
		if (isEnableMessage()) {
			deletedOneMessage();
		}
		return "list";
	}
	
	private void deletedOneMessage() {
		// TODO Auto-generated method stub
		
	}


	/**
	 * �ύ����ɾ��ִ�еķ���
	 * @return �б�ҳ
	 * @throws Exception
	 */
	@SkipValidation
	public String submitDeleteMany() throws Exception {
		entityService.deleteManyEntityById(getIds(), getLoginUser());
		if (isEnableMessage()) {
			deletedOneMessage();
		}
		return "list";
	}


	public T getEntity() {
		return entity;
	}


	public void setEntity(T entity) {
		this.entity = entity;
	}


	public boolean isEnableMessage() {
		return enableMessage;
	}

	public void setEnableMessage(boolean enableMessage) {
		this.enableMessage = enableMessage;
	}

}
