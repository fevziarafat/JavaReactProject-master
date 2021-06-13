package hrms.project.business.concretes;

import hrms.project.business.abstracts.Business_ownersService;
import hrms.project.dataAccess.abstracts.Business_ownersDao;
import hrms.project.entities.concretes.Business_owners;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Business_ownersManager implements Business_ownersService {
    private Business_ownersDao productDao;

    @Autowired
    public Business_ownersManager(Business_ownersDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Business_owners> getAll() {
        return productDao.findAll();
    }
}
