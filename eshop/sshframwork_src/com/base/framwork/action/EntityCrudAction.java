package com.base.framwork.action;

import org.apache.struts2.interceptor.validation.SkipValidation;

import com.base.framwork.domain.BaseModel;

/**
 * 增删改查通用action
 * @author chenas
 *
 * @param <T>
 */
public class EntityCrudAction<T extends BaseModel> extends EntityBaseAction<T>{
	
	protected T entity;
	
	//设置提示信息是否开启
	private boolean enableMessage = true;
	
	/**
	 * 进入新增页面
	 * @return 进入成功
	 * @throws Exception
	 */
	@SkipValidation
	public String intoAdd() throws Exception{
		commonOperations();
		return SUCCESS;
	}


	/**
	 * 进入修改页执行的方法
	 * @return 执行成功
	 * @throws Exception
	 */
	@SkipValidation
	public String intoEdit() throws Exception {
		commonOperations();
		setEntity(entityService.findEntityById(getId()));
		return SUCCESS;
	}
	
	/**
	 * 进入查看执行的方法
	 * @return 执行成功
	 * @throws Exception
	 */
	@SkipValidation
	public String intoView() throws Exception {
		commonOperations();
		setEntity(entityService.findEntityById(getId()));
		return SUCCESS;
	}

	/**
	 * 提交新增执行的方法
	 * @return 列表页
	 * @throws Exception
	 */
	public String submitAdd() throws Exception {
		entityService.insertEntity(getEntity(), getLoginUser());
		if (isEnableMessage()) {
			savedMessage();
		}
		return "list";
	}
	
	/**
	 * 提交修改执行的方法
	 * @return 列表页
	 * @throws Exception
	 */
	public String submitEdit() throws Exception {
		entityService.updateEntity(getEntity(), getLoginUser());
		if (isEnableMessage()) {
			updatedMessage();
		}
		return "list";
	}

	/**
	 * 提交删除执行的方法
	 * @return 列表页
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

	/**
	 * 提交批量删除执行的方法
	 * @return 列表页
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


	/**
	 * 添加的提示信息
	 * 
	 */
	protected void savedMessage() {
		saveMessage("common.messages.saveSuccess");
	}

	/**
	 * 修改的提示信息
	 * 
	 */
	protected void updatedMessage() {
		saveMessage("common.messages.updateSuccess");
	}

	/**
	 * 删除提示信息
	 * 
	 */
	protected void deletedOneMessage() {
		saveMessage("common.messages.deleteOneSuccess");
	}

	/**
	 * 删除选中提示信息
	 * 
	 */
	protected void deletedManyMessage() {
		saveMessage("common.messages.deleteManySuccess");
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
