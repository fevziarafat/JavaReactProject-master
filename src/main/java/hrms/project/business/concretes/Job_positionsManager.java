package hrms.project.business.concretes;

import hrms.project.business.abstracts.Job_positionsService;
import hrms.project.dataAccess.abstracts.Job_positionsDao;
import hrms.project.entities.concretes.Job_positions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Job_positionsManager implements Job_positionsService {
    private Job_positionsDao job_positionsDao;

    @Autowired
    public Job_positionsManager(Job_positionsDao job_positionsDao) {
        this.job_positionsDao = job_positionsDao;
    }

    @Override
    public List<Job_positions> getAll() {
        return job_positionsDao.findAll();
    }
}
