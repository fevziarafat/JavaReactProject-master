package hrms.project.api.controllers;

import hrms.project.business.abstracts.Job_positionsService;
import hrms.project.entities.concretes.Job_positions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/job_positions")
public class Job_positionsController {
    private Job_positionsService job_positionsService;

    @Autowired
    public Job_positionsController(Job_positionsService job_positionsService) {
        this.job_positionsService = job_positionsService;
    }

    @GetMapping("/getall")
    public List<Job_positions> getAll() {
        return this.job_positionsService.getAll();
    }
}
