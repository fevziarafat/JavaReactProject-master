package hrms.project.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "system_personnel")
public class System_personnel {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="password")
    private String password;

    @Column(name="role")
    private byte role;

    @Column(name="is_active")
    private boolean is_active;

    @Column(name="system_personnel_type")
    private int system_personnel_type;

    @Column(name="e_mail")
    private int e_mail;

    @Column(name="national_identity")
    private int national_identity;

    public System_personnel(int id, String name, String surname, String password, byte role, boolean is_active, int system_personnel_type, int e_mail, int national_identity) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.role = role;
        this.is_active = is_active;
        this.system_personnel_type = system_personnel_type;
        this.e_mail = e_mail;
        this.national_identity = national_identity;
    }

    public System_personnel() {

    }



}
