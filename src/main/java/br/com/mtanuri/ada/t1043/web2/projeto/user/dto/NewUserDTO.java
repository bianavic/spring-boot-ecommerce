package br.com.mtanuri.ada.t1043.web2.projeto.user.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewUserDTO implements Serializable {

    @NotBlank(message="The name field is required")
    @Size(min = 1, max = 50)
    private String name;
    @CPF(message="Invalid CPF")
    @NotEmpty
    String cpf;
    @Email(message="Invalid email")
    @NotEmpty(message="The email field is required")
    private String email;
    @NotNull(message="The birth date field is required")
    private LocalDate birthDate;
    private String phone;

//    Address address;
//    List<Order> orders;
    // profile

}
