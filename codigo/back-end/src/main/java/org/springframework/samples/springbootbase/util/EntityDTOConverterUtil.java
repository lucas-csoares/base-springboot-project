package org.springframework.samples.springbootbase.util;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.samples.springbootbase.user.User;
import org.springframework.samples.springbootbase.user.UserControllerImpl;
import org.springframework.samples.springbootbase.user.UserDTO;

import static java.lang.String.format;
import static java.util.Collections.singletonList;

@UtilityClass
@Slf4j(topic = "ENTITY_DTO_CONVERTER_UTIL")
@Schema(description = "Utility class for converting entities to DTOs")
public class EntityDTOConverterUtil {

    @Operation(summary = "Converts Usuario entity to UsuarioDTO")
    public static UserDTO convertToDTO(@NotNull User user) {
        log.info(format(">>> convertToDTO: converting Usuario (id: %s) to DTO", user.getId()));
        return UserDTO.builder()
                .id(user.getId())
                .userProfiles(user.roleCodes (user.getRoles ()))
                .fullName(user.getFullName ())
                .email(user.getEmail().getEmailAddress ())
                .creationDate(user.getCreationDate())
                .lastModificationDate(user.getLastModificationDate())
                .links(singletonList(WebMvcLinkBuilder.linkTo(UserControllerImpl.class).slash(user.getId()).withSelfRel()))
                .build();
    }
}
