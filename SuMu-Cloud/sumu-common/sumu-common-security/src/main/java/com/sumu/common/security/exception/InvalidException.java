

package com.sumu.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sumu.common.security.component.SuMuAuth2ExceptionSerializer;

/**
 * @author sumu
 * @date 2019/2/1
 */
@JsonSerialize(using = SuMuAuth2ExceptionSerializer.class)
public class InvalidException extends SuMuAuth2Exception {

	public InvalidException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "invalid_exception";
	}

	@Override
	public int getHttpErrorCode() {
		return 426;
	}

}
