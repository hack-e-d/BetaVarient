package vijay.projects.betavarient.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vijay.projects.betavarient.Entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
