package hrms.project.dataAccess.abstracts;

import hrms.project.entities.concretes.Job_seekers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Job_seekersDao extends JpaRepository<Job_seekers,Integer> {
}
