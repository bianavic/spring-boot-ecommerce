package br.com.mtanuri.ada.t1043.web2.projeto.user.repository;

import br.com.mtanuri.ada.t1043.web2.projeto.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Transactional(readOnly=true)
    User findByEmail(String email);

}
