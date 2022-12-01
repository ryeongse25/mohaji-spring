package sesac.mohaji.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sesac.mohaji.domain.User;

public interface UserRepository extends JpaRepository<User, String> {
}
