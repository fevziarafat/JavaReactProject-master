package hrms.project.business.concretes;

import hrms.project.business.abstracts.Is_approved_business_ownersService;
import hrms.project.dataAccess.abstracts.Is_approved_business_ownersDao;
import hrms.project.entities.concretes.Is_approved_business_owners;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Is_approved_business_ownersManager implements Is_approved_business_ownersService {
    private Is_approved_business_ownersDao is_approved_business_ownersDao;

    @Autowired
    public Is_approved_business_ownersManager(Is_approved_business_ownersDao is_approved_business_ownersDao) {
        this.is_approved_business_ownersDao = is_approved_business_ownersDao;
    }

    @Override
    public List<Is_approved_business_owners> getAll() {
        return is_approved_business_ownersDao.findAll();
    }
}
