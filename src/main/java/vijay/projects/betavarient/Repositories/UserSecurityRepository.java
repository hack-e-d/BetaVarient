package vijay.projects.betavarient.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vijay.projects.betavarient.Entities.UserSecurity;

import java.util.Optional;

public interface UserSecurityRepository extends JpaRepository<UserSecurity, Integer> {

    UserSecurity findByUsername(String userName);
}
