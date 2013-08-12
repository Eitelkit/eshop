package com.eshop.framwork.domain;

import java.io.Serializable;

/**
 * ����model�ĳ������
 * �������ʵ��toString��equals��hashCode����
 * @author chenas
 *2013��08��11��
 */
public abstract class BaseObject implements Serializable{
	
	/**
	 * toString����
	 * @return ��������л����
	 */
	public abstract String toString();

	/**
	 * ��д��equals����
	 * @param o �Ƚ϶���
	 * @return �ȽϽ��
	 */
	public abstract boolean equals(Object o);

	/**
	 * ��д��hashCode����
	 * @return hashCode
	 */
	public abstract int hashCode();

}
