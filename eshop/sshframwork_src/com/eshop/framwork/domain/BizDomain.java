package com.eshop.framwork.domain;

/**
 * ����domain��ͨ�ýӿ�
 * @author chenas
 *2013��08��11��
 */

public interface BizDomain {
	
	/**
	 * ȡ������
	 */
	public long getId();
	
	/**
	 * ��������
	 */
	public void setId(long id);
	
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
