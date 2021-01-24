package com.sumu.admin.biz.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sumu.admin.api.dto.SysLogDTO;
import com.sumu.admin.api.entity.SysLog;

/**
 * <p>
 * 日志表 服务类
 * </p>
 *
 * @author sumu
 * @since 2019/2/1
 */
public interface SysLogService extends IService<SysLog> {

	/**
	 * 分页查询日志
	 * @param page
	 * @param sysLog
	 * @return
	 */
	Page getLogByPage(Page page, SysLogDTO sysLog);

}
