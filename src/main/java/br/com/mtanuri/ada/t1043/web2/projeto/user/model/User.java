package br.com.mtanuri.ada.t1043.web2.projeto.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * to think about
 * user registration: a new user, a new account
 * user as a costumer, as a client:
 * user details
 * address deetails
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;
    private String email;
    private LocalDate birthDate;
    private String phone;


//    Address address;
//    List<Order> orders;

}
