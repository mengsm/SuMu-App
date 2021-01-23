

package com.sumu.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sumu.common.security.component.SuMuAuth2ExceptionSerializer;
import org.springframework.http.HttpStatus;

/**
 * @author lengleng
 * @date 2019/2/1
 */
@JsonSerialize(using = SuMuAuth2ExceptionSerializer.class)
public class MethodNotAllowed extends SuMuAuth2Exception {

	public MethodNotAllowed(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "method_not_allowed";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.METHOD_NOT_ALLOWED.value();
	}

}
