package hrms.project.dataAccess.abstracts;

import hrms.project.entities.concretes.Business_owners;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Business_ownersDao extends JpaRepository<Business_owners,Integer> {
}
