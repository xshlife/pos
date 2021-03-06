/**
 * author: 谢少华
 * 
 * date: 2014-07-01 09:46
 */
package com.web.business.system.service;

import java.util.List;
import java.util.Map;

import com.web.api.core.service.template.TemplateService;

public interface FlowService extends TemplateService {
	
	/**
	 * 职称 List 获取方法
	 */
	public List<Map<String, Object>> getComboList();
	
	/**
     * 同步 SYSTEM_MENU 表
     */
    public void synchronizationMenu();
    
    /**
     * 修改时,检查是否有存在
     */
    public boolean existsDetail(String id, String menugroupid);

}