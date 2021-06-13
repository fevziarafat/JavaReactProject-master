package hrms.project.dataAccess.abstracts;

import hrms.project.entities.concretes.Check_email_isFake;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Check_email_isFakeDao extends JpaRepository<Check_email_isFake,Integer> {
}
