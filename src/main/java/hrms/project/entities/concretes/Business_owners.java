package hrms.project.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="business_owners")
public class Business_owners {
   @Id
   @GeneratedValue
   @Column(name="id")
   private int id;

   @Column(name="company_name")
   private String company_name;

   @Column(name="web_site_address")
   private String web_site_address;

   @Column(name="telephone")
   private String telephone;

   @Column(name="password")
   private String password;

   @Column(name="is_active")
   private boolean is_active;

   @Column(name="e_mail")
   private int e_mail;

   public Business_owners(int id, String company_name, String web_site_address, String telephone, String password, boolean is_active, int e_mail) {
      this.id = id;
      this.company_name = company_name;
      this.web_site_address = web_site_address;
      this.telephone = telephone;
      this.password = password;
      this.is_active = is_active;
      this.e_mail = e_mail;
   }

   public Business_owners() {

   }



}
