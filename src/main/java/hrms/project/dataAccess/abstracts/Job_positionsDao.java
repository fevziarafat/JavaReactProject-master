package hrms.project.dataAccess.abstracts;

import hrms.project.entities.concretes.Job_positions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Job_positionsDao extends JpaRepository<Job_positions,Integer> {
}
