package hrms.project.entities.concretes;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "job_seekers")
public class Job_seekers {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "date_of_birth")
    private java.sql.Date date_of_birth;

    @Column(name = "password")
    private String password;

    @Column(name = "is_active")
    private boolean is_active;

    @Column(name = "e_mail")
    private int e_mail;

    @Column(name = "national_identity_id")
    private int national_identity_id;

    public Job_seekers(int id, String first_name, String last_name, Date date_of_birth, String password, boolean is_active, int e_mail, int national_identity_id) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.password = password;
        this.is_active = is_active;
        this.e_mail = e_mail;
        this.national_identity_id = national_identity_id;
    }

    public Job_seekers() {

    }



}
