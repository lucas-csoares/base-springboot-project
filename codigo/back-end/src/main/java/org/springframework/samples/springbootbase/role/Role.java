package org.springframework.samples.springbootbase.role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.samples.springbootbase.model.NamedEntity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "TB_ROLE")
public class Role extends NamedEntity
{

    @Column(name = "USER_PROFILE", nullable = false)
    private Integer userProfile;

}
