package hrms.project.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "national_identity_verification")
public class National_identity_verification {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "is_active")
    private boolean is_active;


    @Column(name = "national_identity")
    private String national_identity;

    public National_identity_verification(boolean is_active, int id, String national_identity) {
        this.is_active = is_active;
        this.id = id;
        this.national_identity = national_identity;
    }

    public National_identity_verification() {

    }



}
