package com.eshop.service;

import com.base.framwork.service.IEntityService;
import com.eshop.model.UserBuyerModel;

public interface IUserBuyerService extends IEntityService<UserBuyerModel>{
	
	/**
	 * �û��������Ƿ���ȷ
	 * @param name
	 * @param password
	 * @return
	 */
	public boolean hasUser(String name, String password);
	
}
