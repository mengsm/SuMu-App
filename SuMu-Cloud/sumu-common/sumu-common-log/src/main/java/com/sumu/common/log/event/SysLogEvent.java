package com.sumu.common.log.event;

import com.sumu.admin.api.entity.SysLog;
import org.springframework.context.ApplicationEvent;

/**
 * @author sumu 系统日志事件
 */
public class SysLogEvent extends ApplicationEvent {

	public SysLogEvent(SysLog source) {
		super(source);
	}

}
