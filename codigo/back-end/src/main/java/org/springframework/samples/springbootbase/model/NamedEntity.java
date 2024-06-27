package org.springframework.samples.springbootbase.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Simple JavaBean domain object adds a name property to <code>BaseEntity</code>. Used as a base " +
        "class for objects needing these properties.")
public abstract class NamedEntity extends BaseEntity{
    @Column(name = "name")
    private String name;
}
