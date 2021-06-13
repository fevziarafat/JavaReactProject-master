package hrms.project.api.controllers;

import hrms.project.business.abstracts.Check_email_isFakeService;
import hrms.project.entities.concretes.Check_email_isFake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/check_email_isFake")
public class Check_email_isFakeController {
    private Check_email_isFakeService check_email_isFakeService;

    @Autowired
    public Check_email_isFakeController(Check_email_isFakeService check_email_isFakeService) {
        this.check_email_isFakeService = check_email_isFakeService;
    }

    @GetMapping("/getAll")
    public List<Check_email_isFake> getAll() {
        return this.check_email_isFakeService.getAll();
    }
}
