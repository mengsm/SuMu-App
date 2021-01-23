

package com.sumu.common.core.exception;

import lombok.NoArgsConstructor;

/**
 * @author lengleng
 * @date 2018年06月22日16:22:03 403 授权拒绝
 */
@NoArgsConstructor
public class SuMuDeniedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SuMuDeniedException(String message) {
		super(message);
	}

	public SuMuDeniedException(Throwable cause) {
		super(cause);
	}

	public SuMuDeniedException(String message, Throwable cause) {
		super(message, cause);
	}

	public SuMuDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
