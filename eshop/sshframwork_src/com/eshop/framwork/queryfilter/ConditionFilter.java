package com.eshop.framwork.queryfilter;

import java.util.List;

/**
 * ����������
 * ������ݿ���е��ֶ����������Ӧ��ֵ��ֵ����
 * @author chenas
 * 2013��08��11��
 */

public class ConditionFilter implements IFilter{
	
	/**
	 * ����
	 */
	private String colunmName;
	
	/**
	 * ֵ
	 */
	private String value;
	
	/**
	 * ֵ����
	 */
	private String valueType;

	@Override
	public String getColunmName() {
		return colunmName;
	}

	@Override
	public void setColunmName(String colunmName) {
		this.colunmName = colunmName;
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String getValueType() {
		return valueType;
	}

	@Override
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	@Override
	public int getPageNo() {
		return 0;
	}

	@Override
	public void setPageNo(int pageNo) {
		
	}

	@Override
	public int getPageSize() {
		return 0;
	}

	@Override
	public void setPageSize(int pageSize) {
		
	}

	@Override
	public String getOrderByString() {
		return null;
	}

	@Override
	public void setOrderByString(String orderByString) {
		
	}

	@Override
	public List<IFilter> getLstCondition() {
		return null;
	}

	@Override
	public void setLstCondition(List<IFilter> lstCondition) {
		
	}

	@Override
	public boolean isLimited() {
		return true;
	}

	@Override
	public void setLimited(boolean isLimited) {
		
	}
	
}
