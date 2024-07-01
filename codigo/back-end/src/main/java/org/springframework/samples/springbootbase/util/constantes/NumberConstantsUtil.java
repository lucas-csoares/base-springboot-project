package org.springframework.samples.springbootbase.util.constantes;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.experimental.UtilityClass;


@UtilityClass
@Schema(description = "Contains numeric constants")
public class NumberConstantsUtil {

    public static final Integer ONE = 1;

    public static final Integer TWO = 2;

    public static final Integer THREE = 3;

}
