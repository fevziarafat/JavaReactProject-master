package hrms.project.dataAccess.abstracts;

import hrms.project.entities.concretes.System_personnel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface System_personnelDao extends JpaRepository<System_personnel,Integer> {
}
