package hrms.project.dataAccess.abstracts;

import hrms.project.entities.concretes.Email_verification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Email_verificationDao extends JpaRepository<Email_verification,Integer> {
}
