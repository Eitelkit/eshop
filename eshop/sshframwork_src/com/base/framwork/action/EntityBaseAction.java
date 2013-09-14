package com.base.framwork.action;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;

import com.base.framwork.domain.BaseModel;
import com.base.framwork.service.EntityService;


/**
 * ����ʵ����action�Ļ���
 * @author chenas
 *
 * @param <T>
 */
public class EntityBaseAction<T extends BaseModel> extends BaseAction {
	
	//action���ô��ݵ�����
	private String id;
	
	@Resource
	protected EntityService<T> entityService;

	/**
	 * ��ͨ������ͨ������У��
	 * 
	 * @throws Exception
	 *             �׳����쳣
	 */
	protected void commonOperations() throws Exception {
	}

	/**
	 * ������ʾ��Ϣ
	 * 
	 * @param paramString
	 *            ��ʾ��Ϣ
	 */
	protected void saveMessage(String paramString) {
		//String str = MessageUtils.getMessage(paramString);
		String str = getText(paramString);//�޸�by suntao ����Ӧ���ʻ�Ҫ��
		//getRequest().getSession().setAttribute(Constants.POP_MESSAGE_KEY, str);
	}
	/**
	 * ���ǰ̨�ύ��id
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * ����ǰ̨�ύ��id
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * ���ǰ̨�ύ�Ķ��id
	 * @return id����
	 */
	public String[] getIds() {
		if (StringUtils.isNotEmpty(id)) {
			return id.split(", ");// struts2���ύ�Ƕ��żӿո������
		} else {
			return new String[0];
		}
	}

}
