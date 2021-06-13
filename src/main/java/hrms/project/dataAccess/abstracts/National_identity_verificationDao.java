package hrms.project.dataAccess.abstracts;

import hrms.project.entities.concretes.National_identity_verification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface National_identity_verificationDao extends JpaRepository<National_identity_verification,Integer> {
}
