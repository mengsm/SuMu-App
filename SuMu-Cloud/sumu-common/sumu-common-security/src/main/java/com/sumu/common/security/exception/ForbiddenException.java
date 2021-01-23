

package com.sumu.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sumu.common.security.component.SuMuAuth2ExceptionSerializer;
import org.springframework.http.HttpStatus;

/**
 * @author lengleng
 * @date 2019/2/1
 */
@JsonSerialize(using = SuMuAuth2ExceptionSerializer.class)
public class ForbiddenException extends SuMuAuth2Exception {

	public ForbiddenException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "access_denied";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.FORBIDDEN.value();
	}

}
