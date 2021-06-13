package hrms.project.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="job_positions")
public class Job_positions {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="jop_name")
    private String jop_name;

    @Column(name="is_active")
    private boolean is_active;

    public Job_positions() {

    }



    public Job_positions(int id, String jop_name, boolean is_active) {
        this.id = id;
        this.jop_name = jop_name;
        this.is_active = is_active;
    }

}
