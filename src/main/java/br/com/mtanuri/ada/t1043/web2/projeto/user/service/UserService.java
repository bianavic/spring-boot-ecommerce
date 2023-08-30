package br.com.mtanuri.ada.t1043.web2.projeto.user.service;

import br.com.mtanuri.ada.t1043.web2.projeto.user.dto.NewUserDTO;
import br.com.mtanuri.ada.t1043.web2.projeto.user.model.User;

import java.util.List;

public interface UserService {

    User save(NewUserDTO newUser);

    List<User> getAll();

}
