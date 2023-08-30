package br.com.mtanuri.ada.t1043.web2.projeto.user.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {

    private Long id;
    private String name;
    String cpf;
    private String email;
    private LocalDate birthDate;
    private String phone;


//    Address address;
//    List<Order> orders;
    // profile

}
