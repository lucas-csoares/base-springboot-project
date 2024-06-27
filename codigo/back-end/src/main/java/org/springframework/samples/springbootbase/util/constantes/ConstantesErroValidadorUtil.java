package org.spring.springbootbase.util.constantes;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.experimental.UtilityClass;

@UtilityClass
@Schema(description = "Contém constantes de erros nos dados de entidade")
public class ConstantesErroValidadorUtil {

    public static final String MSG_ERRO_CPF = "formato esperado: 000.000.000-00";

    public static final String MSG_ERRO_EMAIL = "formato esperado: usuario@email.com.br ou usuario@email.com";

    public static final String MSG_ERRO_SENHA = "a senha deve conter no mínimo 6 caracteres";

    public static final String MSG_ERRO_TELEFONE = "formato esperado: 00 00000-0000";

}
