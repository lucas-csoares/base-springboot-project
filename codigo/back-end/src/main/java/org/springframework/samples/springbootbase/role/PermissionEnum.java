package org.springframework.samples.springbootbase.role;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.Arrays;
import static org.springframework.samples.springbootbase.util.constantes.NumberConstantsUtil.*;

@Getter
@AllArgsConstructor
@Schema(description = "Contains all user roles")
public enum PermissionEnum {

    ADMIN(ONE, "ROLE_ADMIN"),

    USER(TWO, "ROLE_USUARIO"),

    GUARDIAN(THREE, "ROLE_GUARDIAN"); // example profile

    private final Integer code;

    private final String description;

    @Operation(summary = "Gets the Profile object related to an integer code",
            description = "Fetches the user profile corresponding to the provided code.")
    public static PermissionEnum getUserProfile(int code) {
        return Arrays.stream(PermissionEnum.values())
                .filter(permissionEnum -> permissionEnum.code == code)
                .findFirst()
                .orElse(null);
    }
}
