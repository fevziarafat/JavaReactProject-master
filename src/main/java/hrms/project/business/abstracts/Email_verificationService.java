package hrms.project.business.abstracts;

import hrms.project.entities.concretes.Email_verification;

import java.util.List;

public interface Email_verificationService {
    List<Email_verification> getAll();
}
