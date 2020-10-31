package model;


import java.io.Serializable;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity()
@Table(name = "table_person")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Basic()
	@Column(name = "p_name", length = 200, nullable = false, unique = true)
    private String name;
	
	@Basic()
	@Column(name = "p_prenom", length = 200, nullable = false, unique = true)
    private String prenom;
    
    @Id()
	@Basic()
	@Column(name = "p_mail", length = 200)
	private String mail;
   
	@Basic()
	@Column(name = "p_siteWeb", length = 200)
	private String siteWeb;
	
	@Basic()
	@Column(name = "p_naissance")
    private Date naissance;
	
	@Basic()
	@Column(name = "p_motdepasse", length = 200)
    private String motdepasse;
    

	@OneToMany(mappedBy= "owner")
    private List<Cv> cvs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public String getWeb() {
        return siteWeb;
    }

    public void setWeb(String siteWeb) {
        this.siteWeb = siteWeb;
        
    }
    
    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }
    
    public String getMotPasse() {
        return motdepasse;
    }

    public void setMotPasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }
    
}
