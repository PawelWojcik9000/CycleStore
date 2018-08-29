package cyclestore.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cyclestore.entities.UserRole;

@Repository
public interface UserRolesRepository extends JpaRepository<UserRole, Long>{
	
	@Query("select a.role from UserRole a, User b where b.userName=?1 and a.userId=b.userId")
	public List<String> findRoleByUserName(String userName);
	
}
