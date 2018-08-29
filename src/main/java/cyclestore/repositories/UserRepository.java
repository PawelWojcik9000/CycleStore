package cyclestore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cyclestore.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUserName(String userName);
	
}
