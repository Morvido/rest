package apirest.Cotroller.repository;

import apirest.Cotroller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

