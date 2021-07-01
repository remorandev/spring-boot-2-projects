package es.remoran.dev.springboot2intro.repo;

import es.remoran.dev.springboot2intro.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
