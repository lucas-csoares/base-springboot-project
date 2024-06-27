package org.springframework.samples.springbootbase.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;


@MappedSuperclass
@Data
@Schema(description = "Simple JavaBean domain object with an id property. Used as a base class for objects")
public abstract class BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    private UUID id;

    @Column(name = "CREATION_DATE", nullable = false, updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("creation_date")
    private LocalDateTime creationDate;

    @Column(name = "LAST_MODIFICATION_DATE", nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("last_modification_date")
    private LocalDateTime lastModificationDate;

    @PrePersist
    protected void onCreate() {
        creationDate = LocalDateTime.now();
        lastModificationDate = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        lastModificationDate = LocalDateTime.now();
    }

    public boolean isNew() {
        return this.id == null;
    }
}
