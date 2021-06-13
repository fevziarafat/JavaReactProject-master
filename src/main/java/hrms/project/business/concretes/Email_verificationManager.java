package hrms.project.business.concretes;

import hrms.project.business.abstracts.Email_verificationService;
import hrms.project.dataAccess.abstracts.Email_verificationDao;
import hrms.project.entities.concretes.Email_verification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Email_verificationManager implements Email_verificationService {
    private Email_verificationDao email_verificationDao;

    @Autowired
    public Email_verificationManager(Email_verificationDao email_verificationDao) {
        this.email_verificationDao = email_verificationDao;
    }

    @Override
    public List<Email_verification> getAll() {
        return email_verificationDao.findAll();
    }
}
