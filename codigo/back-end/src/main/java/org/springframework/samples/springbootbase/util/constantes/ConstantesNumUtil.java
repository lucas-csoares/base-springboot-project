package org.spring.springbootbase.util.constantes;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.experimental.UtilityClass;


@UtilityClass
@Schema(description = "Contém as constantes numéricas")
public class ConstantesNumUtil {

    public static final Integer UM = 1;

    public static final Integer DOIS = 2;

    public static final Integer VINTE_E_CINCO = 25;

    public static final Integer CEM = 100;
}
