package com.base.framwork.service;

import java.security.MessageDigest;
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
	
	/**
	 * ����ַ�����md5����
	 * @param resString
	 * @return
	 *  	md5�ַ���
	 */
	public String getMD5String(String resString){
		// MD5���롣32λ,������,���ڼ�������
			MessageDigest md5 = null;
			try {
				md5 = MessageDigest.getInstance("MD5");
			} catch (Exception e) {
				System.out.println(e.toString());
				e.printStackTrace();
				return "";
			}
			char[] charArray = resString.toCharArray();
			byte[] byteArray = new byte[charArray.length];
			for (int i = 0; i < charArray.length; i++)
				byteArray[i] = (byte) charArray[i];
			byte[] md5Bytes = md5.digest(byteArray);
			StringBuffer hexValue = new StringBuffer();
			for (int i = 0; i < md5Bytes.length; i++) {
				int val = ((int) md5Bytes[i]) & 0xff;
				if (val < 16)
					hexValue.append("0");
				hexValue.append(Integer.toHexString(val));
			}
			return hexValue.toString();
	}
	
/*	public static void main(String[] args){
		UtilService us = new UtilService();
		String str = us.getMD5String("1234");
		System.out.println(str);
	}*/
	
}
