package hrms.project.dataAccess.abstracts;

import hrms.project.entities.concretes.Is_approved_business_owners;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Is_approved_business_ownersDao extends JpaRepository<Is_approved_business_owners,Integer> {
}
