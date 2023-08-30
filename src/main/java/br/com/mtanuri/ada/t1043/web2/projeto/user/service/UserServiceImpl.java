package br.com.mtanuri.ada.t1043.web2.projeto.user.service;

import br.com.mtanuri.ada.t1043.web2.projeto.user.dto.NewUserDTO;
import br.com.mtanuri.ada.t1043.web2.projeto.user.model.User;
import br.com.mtanuri.ada.t1043.web2.projeto.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User save(NewUserDTO newUser) {
        return userRepository.save(new User(null, newUser.getName(), newUser.getCpf(),
                newUser.getEmail(), newUser.getBirthDate(), newUser.getPhone()
        ));
    }

    @Override
    public List<User> getAll() {
        return this.userRepository.findAll();
    }

}
