package hrms.project.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "national_identity_isFake")
public class National_identity_isFake {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "identity_id")
    private int identity_id;

    @Column(name = "is_Fake")
    private boolean is_Fake;

    public National_identity_isFake(int id, int identity_id, boolean is_Fake) {
        this.id = id;
        this.identity_id = identity_id;
        this.is_Fake = is_Fake;
    }

    public National_identity_isFake() {

    }



}
