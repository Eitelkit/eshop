package com.base.framwork.service;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.base.framwork.util.DateUtil;

/**
 * ����Service
 * @author chenas
 *
 */
@Component
public class UtilService implements IUtilService{

	/**
	 * ȡ��ϵͳ��ǰʱ��
	 * 
	 * @return ϵͳ��ǰʱ��
	 */
	public Date getSystemDateTime() {
		Calendar cal = Calendar.getInstance();
		return cal.getTime();
	}

	/**
	 * ȡ��ϵͳ��ǰ������ɵ��ַ��� Ĭ�ϸ�ʽΪ��yyyy-MM-dd
	 * 
	 * @return ϵͳ��ǰ������ɵ��ַ���
	 */
	public String getSystemDateString() {
		return DateUtil.getDateTime("yyyy-MM-dd", getSystemDateTime());
	}

	/**
	 * ȡ��ϵͳ��ǰ���ڣ�ʱ����ɵ��ַ��� Ĭ�ϸ�ʽΪ��yyyy-MM-dd HH:mm:ss
	 * 
	 * @return ϵͳ��ǰ���ڣ�ʱ����ɵ��ַ���
	 */
	public String getSystemDateTimeString() {
		return DateUtil.getDateTime("yyyy-MM-dd HH:mm:ss", getSystemDateTime());
	}
}
