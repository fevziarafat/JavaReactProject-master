package hrms.project.business.abstracts;

import hrms.project.entities.concretes.National_identity_verification;

import java.util.List;

public interface National_identity_verificationService {
    List<National_identity_verification> getAll();
}
