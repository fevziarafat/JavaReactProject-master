package hrms.project.api.controllers;

import hrms.project.business.abstracts.Job_seekersService;
import hrms.project.entities.concretes.Job_seekers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/job_seekers")
public class Job_seekersController {
    private Job_seekersService job_seekersService;

    @Autowired
    public Job_seekersController( Job_seekersService job_seekersService) {
        this.job_seekersService = job_seekersService;

    }

    public List<Job_seekers> getAll()
    {
        return this.job_seekersService.getAll();
    }
}
