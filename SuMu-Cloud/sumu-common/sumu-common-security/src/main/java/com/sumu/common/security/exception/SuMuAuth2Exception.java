

package com.sumu.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sumu.common.security.component.SuMuAuth2ExceptionSerializer;
import lombok.Getter;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

/**
 * @author sumu
 * @date 2019/2/1 自定义OAuth2Exception
 */
@JsonSerialize(using = SuMuAuth2ExceptionSerializer.class)
public class SuMuAuth2Exception extends OAuth2Exception {

	@Getter
	private String errorCode;

	public SuMuAuth2Exception(String msg) {
		super(msg);
	}

	public SuMuAuth2Exception(String msg, String errorCode) {
		super(msg);
		this.errorCode = errorCode;
	}

}
