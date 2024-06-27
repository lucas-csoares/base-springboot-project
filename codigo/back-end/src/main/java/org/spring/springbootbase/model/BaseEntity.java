package org.spring.springbootbase.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;


@MappedSuperclass
@Data
@Schema(description = "Objeto de domínio JavaBean simples com uma propriedade id. Usado como classe base para objetos")
public abstract class BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    private UUID id;

    public boolean isNew() {
        return this.id == null;
    }
}
