package hrms.project.business.abstracts;

import hrms.project.entities.concretes.Job_positions;

import java.util.List;

public interface Job_positionsService {
    List<Job_positions> getAll();
}
