package hrms.project.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="check_email_isFake")
public class Check_email_isFake {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "email_id")
    private int email_id;

    @Column(name = "is_Fake")
    private boolean is_Fake;

    public Check_email_isFake(int id, int email_id, boolean is_Fake) {
        this.id = id;
        this.email_id = email_id;
        this.is_Fake = is_Fake;
    }

    public Check_email_isFake() {

    }



}
