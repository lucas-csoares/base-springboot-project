package org.springframework.samples.springbootbase.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.hateoas.Link;

@Builder
public record UserDTO(
        UUID id,
        @JsonProperty("user_profiles") List<Integer> userProfiles,
        @JsonProperty("full_name") String fullName,
        String email,
        @JsonProperty("creation_date") LocalDateTime creationDate,
        @JsonProperty("last_modification_date") LocalDateTime lastModificationDate,
        List<Link> links) {
}
