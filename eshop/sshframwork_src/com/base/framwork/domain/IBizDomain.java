package com.base.framwork.domain;

/**
 * ����domain��ͨ�ýӿ�
 * @author chenas
 *2013��08��11��
 */

public interface IBizDomain {
	
	/**
	 * ȡ������
	 */
	public String getId();
	
	/**
	 * ��������
	 */
	public void setId(String id);
	
	/**
	 * equals
	 * 
	 * @param o
	 *            �Ƚ϶���
	 * @return �Ƿ����
	 */
	public boolean equals(Object o);

	/**
	 * hashCode
	 * 
	 * @return hashCodeֵ
	 */
	public int hashCode();

}
