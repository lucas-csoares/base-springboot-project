package org.springframework.samples.springbootbase.user;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.samples.springbootbase.model.Person;
import org.springframework.samples.springbootbase.role.PermissionEnum;
import org.springframework.samples.springbootbase.role.Role;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static org.springframework.samples.springbootbase.util.constantes.ValidatorErrorConstantsUtil.*;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_USER")
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Details about the user")
public class User extends Person {

    @Column(name = "PASSWORD", nullable = false)
    @Size(min = 6, max = 200, message = MSG_ERROR_PASSWORD)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id"),
    uniqueConstraints = @UniqueConstraint (columnNames = {"user_id", "role_id"}))
    private List<Role> roles;


    public void addRole(PermissionEnum permissionEnum) {
        if(this.roles == null) {
            this.roles = new ArrayList<> ();
        }
        this.roles.add (new Role (permissionEnum.getCode ()));
    }

    public List<Integer> roleCodes(List<Role> roles) {
        return roles.stream()
                .map(Role::getUserProfile)
                .collect(Collectors.toList());
    }

}
