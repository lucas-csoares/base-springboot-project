package org.springframework.samples.springbootbase.email;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.samples.springbootbase.model.BaseEntity;
import static org.springframework.samples.springbootbase.util.constantes.ValidatorErrorConstantsUtil.MSG_ERROR_EMAIL;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "TB_EMAIL")
@Schema(description = "Simple domain JavaBean object representing an email")
public class Email extends BaseEntity {

    @Column(name = "email_address", unique = true, nullable = false)
    @Pattern (regexp = "(^\\d{1,2}).?(\\d{3}).?(\\d{2})-?(\\d|X|x$)", message = MSG_ERROR_EMAIL)
    private String emailAddress;
}
