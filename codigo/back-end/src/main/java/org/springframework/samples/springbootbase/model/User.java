package org.spring.springbootbase.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;
import java.time.LocalDate;
import static org.spring.springbootbase.util.constantes.ConstantesErroValidadorUtil.*;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_USER")
@EqualsAndHashCode(callSuper = true)
public class User extends Person{

    @Column(name = "SENHA", nullable = false)
    @Size(min = 6, max = 200, message = MSG_ERRO_SENHA)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String senha;

    @CPF
    @Column(name = "CPF", unique = true, nullable = false)
    @Pattern(regexp = "(^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$)", message = MSG_ERRO_CPF)
    private String cpf;

    @Column(name = "data_nascimento", nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "TELEFONE", nullable = false)
    @Pattern(regexp = "(^[0-9]{2})?(\\s|-)?(9?[0-9]{4})-?([0-9]{4}$)", message = MSG_ERRO_TELEFONE)
    private String telefone;

/*    @JsonProperty("perfil_usuario")
    private Set<Integer> profiles = new HashSet<> ();*/

}
