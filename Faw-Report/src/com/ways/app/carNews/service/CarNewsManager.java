package com.ways.app.carNews.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.ss.usermodel.Workbook;

/**
 *成交价报表Service接口类
 */
public interface CarNewsManager {
	
	public void getBodyTypeList(HttpServletRequest request,Map<String, Object> paramsMap);
	/**初始化数据
	 * @param request
	 * @param paramsMap
	 */
	public void initData(HttpServletRequest request,Map<String, Object> paramsMap);
	
	/**查询成交价,加载DataTable数据
	 * @param paramsMap
	 * @return
	 */
	public String findNewCarsInfo(HttpServletRequest request,Map<String, Object> paramsMap);

	/**导出成交价数据
	 * @param request
	 * @param paramsMap
	 * @return
	 */
	public Workbook exportExcel(HttpServletRequest request,Map<String, Object> paramsMap);
	
	public void getSubmodelModal(HttpServletRequest request, Map<String, Object> paramsMap);
}