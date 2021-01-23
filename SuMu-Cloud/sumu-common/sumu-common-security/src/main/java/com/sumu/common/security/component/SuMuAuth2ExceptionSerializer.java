

package com.sumu.common.security.component;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.sumu.common.core.constant.CommonConstants;
import com.sumu.common.security.exception.SuMuAuth2Exception;
import lombok.SneakyThrows;

/**
 * @author lengleng
 * @date 2019/2/1
 * <p>
 * OAuth2 异常格式化
 */
public class SuMuAuth2ExceptionSerializer extends StdSerializer<SuMuAuth2Exception> {

	public SuMuAuth2ExceptionSerializer() {
		super(SuMuAuth2Exception.class);
	}

	@Override
	@SneakyThrows
	public void serialize(SuMuAuth2Exception value, JsonGenerator gen, SerializerProvider provider) {
		gen.writeStartObject();
		gen.writeObjectField("code", CommonConstants.FAIL);
		gen.writeStringField("msg", value.getMessage());
		gen.writeStringField("data", value.getErrorCode());
		gen.writeEndObject();
	}

}
