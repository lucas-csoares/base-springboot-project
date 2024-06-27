package org.spring.springbootbase.enums;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

import static org.spring.springbootbase.util.constantes.ConstantesNumUtil.DOIS;
import static org.spring.springbootbase.util.constantes.ConstantesNumUtil.UM;

@Getter
@AllArgsConstructor
@Schema(description = "Contém todos os papeis de usuário")
public enum Profile {

    ADMIN(UM, "ROLE_ADMIN"),
    USUARIO(DOIS, "ROLE_USUARIO");

    private final Integer codigo;
    private final String descricao;

    @Operation(description = "Obtém o objeto Profile relacionado a um código inteiro")
    public static Profile getPerfilUsuario(int codigo) {
        return Arrays.stream(Profile.values())
                .filter(perfil -> perfil.codigo == codigo)
                .findFirst()
                .orElse(null);
    }
}
