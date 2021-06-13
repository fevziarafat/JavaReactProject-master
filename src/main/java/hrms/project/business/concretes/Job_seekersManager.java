package hrms.project.business.concretes;

import hrms.project.business.abstracts.Job_seekersService;
import hrms.project.dataAccess.abstracts.Job_seekersDao;
import hrms.project.entities.concretes.Job_seekers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Job_seekersManager implements Job_seekersService {
    private Job_seekersDao job_seekersDao;

    @Autowired
    public Job_seekersManager(Job_seekersDao job_seekersDao) {
        this.job_seekersDao = job_seekersDao;
    }

    @Override
    public List<Job_seekers> getAll() {
        return job_seekersDao.findAll();
    }
}
