package org.springframework.samples.springbootbase.util.constantes;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.experimental.UtilityClass;

@UtilityClass
@Schema(description = "Contains constants related to class topics")
public class TopicConstantsUtil {

    public static final String USER_SERVICE = "USER_SERVICE";

    public static final String ADDRESS_SERVICE = "ADDRESS_SERVICE";

    public static final String REQUEST_AUTHORIZATION_VALIDATOR_SERVICE = "REQUEST_AUTHORIZATION_VALIDATOR_SERVICE";

    public static final String SPRING_SECURITY_USER_SERVICE = "SPRING_SECURITY_USER_SERVICE";

    public static final String PASSWORD_ENCRYPTOR_SERVICE = "PASSWORD_ENCRYPTOR_SERVICE";

    public static final String USER_CONTROLLER = "USER_CONTROLLER";

    public static final String ADDRESS_CONTROLLER = "ADDRESS_CONTROLLER";

    public static final String SYSTEM_HEALTH_INDICATOR_COMP = "SYSTEM_HEALTH_INDICATOR_COMP";

    public static final String JWT_COMP = "JWT_COMP";

    public static final String SECURITY_CONFIG = "SECURITY_CONFIG";

    public static final String EXCEPTION_INTERCEPTOR = "EXCEPTION_INTERCEPTOR";

    public static final String JWT_AUTHENTICATION_FILTER = "JWT_AUTHENTICATION_FILTER";

    public static final String JWT_AUTHORIZATION_FILTER = "JWT_AUTHORIZATION_FILTER";

    public static final String ENTITY_DTO_CONVERTER_UTIL = "ENTITY_DTO_CONVERTER_UTIL";
}
