package com.base.framwork.service;

import java.util.Date;

public interface IUtilService {
	/**
	 * ȡ��ϵͳ��ǰʱ��
	 * 
	 * @return ϵͳ��ǰʱ��
	 */
	public Date getSystemDateTime();

	/**
	 * ȡ��ϵͳ��ǰ������ɵ��ַ���
	 * 
	 * @return ϵͳ��ǰ������ɵ��ַ���
	 */
	public String getSystemDateString();

	/**
	 * ȡ��ϵͳ��ǰ���ڣ�ʱ����ɵ��ַ���
	 * 
	 * @return ϵͳ��ǰ���ڣ�ʱ����ɵ��ַ���
	 */
	public String getSystemDateTimeString();

}
