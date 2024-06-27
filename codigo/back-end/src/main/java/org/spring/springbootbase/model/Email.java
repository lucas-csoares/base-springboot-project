package org.spring.springbootbase.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.EqualsAndHashCode;
import static org.spring.springbootbase.util.constantes.ConstantesErroValidadorUtil.MSG_ERRO_EMAIL;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "TB_EMAIL")
@Schema(description = "Objeto JavaBean simples de domínio representando e-mail")
public class Email extends BaseEntity{

    @Column(name = "email_address", unique = true, nullable = false)
    @Pattern (regexp = "(^\\d{1,2}).?(\\d{3}).?(\\d{2})-?(\\d|X|x$)", message = MSG_ERRO_EMAIL)
    private String emailAddress;
}
