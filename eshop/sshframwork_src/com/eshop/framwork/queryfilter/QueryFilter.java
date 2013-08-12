package com.eshop.framwork.queryfilter;

import java.util.List;
import java.util.Map;

/**
 * ��ѯ����������
 * @author chenas
 * 2013��08��11��
 */

public class QueryFilter implements IFilter{
	
	/**
	 * �Ƿ��ҳ
	 * Ĭ��Ϊtrue����ʾ��ҳ
	 */
	private boolean isLimited = true;
	
	/**
	 * ��ʾ�ڼ�ҳ
	 */
	private int pageNo = 1;
	
	/**
	 * ÿҳ�ļ�¼��
	 * Ĭ��һҳ��ʾ10��
	 */
	private int pageSize = 10;
	
	/**
	 * ���ݴ��ַ�������
	 */
	private String orderByString;
	
	/**
	 * ��������
	 */
	private List<IFilter> lstCondition;

	@Override
	public int getPageNo() {
		return pageNo;
	}

	@Override
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	@Override
	public int getPageSize() {
		return pageSize;
	}

	@Override
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String getOrderByString() {
		return orderByString;
	}

	@Override
	public void setOrderByString(String orderByString) {
		this.orderByString = orderByString;
	}

	@Override
	public List<IFilter> getLstCondition() {
		return lstCondition;
	}

	@Override
	public void setLstCondition(List<IFilter> lstCondition) {
		this.lstCondition = lstCondition;
	}

	@Override
	public void setColunmName(String colunmName) {
		
	}

	@Override
	public String getValue() {
		return null;
	}

	@Override
	public void setValue(String value) {
		
	}

	@Override
	public String getValueType() {
		return null;
	}

	@Override
	public void setValueType(String valueType) {
		
	}

	@Override
	public boolean isLimited() {
		return isLimited;
	}

	@Override
	public void setLimited(boolean isLimited) {
		this.isLimited = isLimited;
	}

	@Override
	public String getColunmName() {
		return null;
	}

}
