package hrms.project.api.controllers;

import hrms.project.business.abstracts.Business_ownersService;
import hrms.project.entities.concretes.Business_owners;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/business_owners")
public class Business_ownersController {
    private Business_ownersService business_ownersService;

    @Autowired
    public Business_ownersController(Business_ownersService business_ownersService) {
        this.business_ownersService = business_ownersService;
    }

    @GetMapping("/getall")
    public List<Business_owners> getAll() {
        return this.business_ownersService.getAll();
    }
    
}
