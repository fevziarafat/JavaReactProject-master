package hrms.project.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="is_approved_business_owners")
public class Is_approved_business_owners {
    @Id
    @GeneratedValue
    @Column(name="id")
   private int id;
    @Column(name="business_owners_id")

   private int business_owners_id;
    @Column(name="approved_per_id")
   private int approved_per_id;

    @Column(name="is_approved")
    private boolean is_approved;



    public void Is_approved_business_owners(){}

    public Is_approved_business_owners(int id, int business_owners_id, int approved_per_id, boolean is_approved) {
        this.id = id;
        this.business_owners_id = business_owners_id;
        this.approved_per_id = approved_per_id;
        this.is_approved = is_approved;
    }

}
