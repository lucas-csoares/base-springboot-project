package org.springframework.samples.springbootbase.util.constantes;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.experimental.UtilityClass;

@UtilityClass
@Schema(description = "Contains constants for data entity validation errors")
public class ValidatorErrorConstantsUtil {

    public static final String MSG_ERROR_EMAIL = "expected format: user@email.com or user@email.com.br";

    public static final String MSG_ERROR_PASSWORD  = "password must be at least 6 characters long";


}
