package hrms.project.business.concretes;

import hrms.project.business.abstracts.National_identity_verificationService;
import hrms.project.dataAccess.abstracts.National_identity_verificationDao;
import hrms.project.entities.concretes.National_identity_verification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class National_identity_verificationManager implements National_identity_verificationService {
    private National_identity_verificationDao national_identity_verificationDao;

    @Autowired
    public National_identity_verificationManager(National_identity_verificationDao national_identity_verificationDao) {
        this.national_identity_verificationDao = national_identity_verificationDao;
    }

    @Override
    public List<National_identity_verification> getAll() {
        return national_identity_verificationDao.findAll();
    }
}
