package hrms.project.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="email_verification")
public class Email_verification {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="e_mail_address")
    private String e_mail_address;

    public Email_verification(int id, String e_mail_address) {
        this.id = id;
        this.e_mail_address = e_mail_address;
    }

    public Email_verification() {

    }



}
