package hrms.project.api.controllers;

import hrms.project.business.abstracts.Email_verificationService;
import hrms.project.entities.concretes.Email_verification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/email_verification")
public class Email_verificationController {
    private Email_verificationService email_verificationService;

    @Autowired
    public Email_verificationController(Email_verificationService email_verificationService) {
        this.email_verificationService = email_verificationService;
    }

    @GetMapping("/getall")
    public List<Email_verification> getAll() {
        return this.email_verificationService.getAll();
    }
}
