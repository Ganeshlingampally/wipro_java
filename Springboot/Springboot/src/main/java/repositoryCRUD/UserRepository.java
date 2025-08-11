package repositoryCRUD;

import org.springframework.data.jpa.repository.JpaRepository;

import modelCRUD.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
