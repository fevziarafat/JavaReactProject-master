package hrms.project.dataAccess.abstracts;

import hrms.project.entities.concretes.National_identity_isFake;
import org.springframework.data.jpa.repository.JpaRepository;

public interface National_identity_isFakeDao extends JpaRepository<National_identity_isFake,Integer> {
}
