package hrms.project.business.concretes;

import hrms.project.business.abstracts.National_identity_isFakeService;
import hrms.project.dataAccess.abstracts.National_identity_isFakeDao;
import hrms.project.entities.concretes.National_identity_isFake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class National_identity_isFakeManager implements National_identity_isFakeService {
    private National_identity_isFakeDao national_identity_isFakeDao;

    @Autowired
    public National_identity_isFakeManager(National_identity_isFakeDao national_identity_isFakeDao) {
        this.national_identity_isFakeDao = national_identity_isFakeDao;
    }

    @Override
    public List<National_identity_isFake> getAll() {
        return national_identity_isFakeDao.findAll();
    }
}
