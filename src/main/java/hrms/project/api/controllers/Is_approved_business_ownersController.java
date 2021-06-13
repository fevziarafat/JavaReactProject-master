package hrms.project.api.controllers;

import hrms.project.business.abstracts.Is_approved_business_ownersService;
import hrms.project.entities.concretes.Is_approved_business_owners;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Is_approved_business")
public class Is_approved_business_ownersController {
    private Is_approved_business_ownersService is_approved_business_ownersService;

    @Autowired
    public Is_approved_business_ownersController(Is_approved_business_ownersService is_approved_business_ownersService) {
        this.is_approved_business_ownersService = is_approved_business_ownersService;
    }

    @GetMapping("/getall")
    public List<Is_approved_business_owners> getAll() {
        return this.is_approved_business_ownersService.getAll();
    }
}
