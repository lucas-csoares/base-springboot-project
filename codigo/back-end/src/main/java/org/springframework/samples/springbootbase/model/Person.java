package org.spring.springbootbase.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Objeto JavaBean simples de domínio representando uma pessoa")
public abstract class Person extends BaseEntity{

    @Column(name = "full_name")
    @NotBlank
    private String fullName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "email_id", nullable = false)
    private Email email;

    @Column(name = "DATA_CRIACAO", nullable = false, updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("data_criacao")
    private LocalDateTime dataCriacao;

    @Column(name = "DATA_ULTIMA_MODIFICACAO", nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("data_ultima_modificacao")
    private LocalDateTime dataUltimaModificacao;

    @PrePersist
    protected void onCreate() {
        dataCriacao = LocalDateTime.now();
        dataUltimaModificacao = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        dataUltimaModificacao = LocalDateTime.now();
    }

}
