package org.springframework.samples.springbootbase.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.samples.springbootbase.email.Email;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Simple domain JavaBean object representing a person")
public abstract class Person extends BaseEntity{

    @Column(name = "full_name")
    @NotBlank
    private String fullName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "email_id", nullable = false)
    private Email email;

}
