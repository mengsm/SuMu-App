

package com.sumu.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sumu.common.security.component.SuMuAuth2ExceptionSerializer;
import org.springframework.http.HttpStatus;

/**
 * @author sumu
 * @date 2019/2/1
 */
@JsonSerialize(using = SuMuAuth2ExceptionSerializer.class)
public class UnauthorizedException extends SuMuAuth2Exception {

	public UnauthorizedException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "unauthorized";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.UNAUTHORIZED.value();
	}

}
