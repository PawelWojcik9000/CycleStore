package cyclestore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cyclestore.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
