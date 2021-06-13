package hrms.project.business.concretes;

import hrms.project.business.abstracts.System_personnelService;
import hrms.project.dataAccess.abstracts.System_personnelDao;
import hrms.project.entities.concretes.System_personnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class System_personnelManager implements System_personnelService {
    private System_personnelDao system_personnelDao;

    @Autowired
    public System_personnelManager(System_personnelDao system_personnelDao) {
        this.system_personnelDao = system_personnelDao;
    }

    @Override
    public List<System_personnel> getAll() {
        return system_personnelDao.findAll();
    }
}
