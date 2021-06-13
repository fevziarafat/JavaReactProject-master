package hrms.project.business.concretes;

import hrms.project.business.abstracts.Check_email_isFakeService;
import hrms.project.dataAccess.abstracts.Check_email_isFakeDao;
import hrms.project.entities.concretes.Check_email_isFake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Check_email_isFakeManager implements Check_email_isFakeService {
    private Check_email_isFakeDao check_email_isFakeDao;

    @Autowired
    public Check_email_isFakeManager(Check_email_isFakeDao check_email_isFakeDao) {
        this.check_email_isFakeDao = check_email_isFakeDao;
    }

    @Override
    public List<Check_email_isFake> getAll() {
        return check_email_isFakeDao.findAll();
    }
}
