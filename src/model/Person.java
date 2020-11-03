package model;


import java.io.Serializable;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@NamedQuery(name = "findAllPersons", query = "SELECT p FROM Person p")

@Entity()
@Table(name = "table_person")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "p_id")
    private long id;
    
    @Basic()
	@Column(name = "p_name", length = 200, nullable = false)
    private String name;
	
	@Basic()
	@Column(name = "p_prenom", length = 200, nullable = false)
    private String prenom;
    
	@Basic()
    @Column(name = "p_mail", unique = true)
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

	@OneToMany(mappedBy= "owner", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<CV> cvs;
/*
	@OneToMany(mappedBy= "owner")
    private List<Cv> cvs;
	*/
	public void addCv(CV cv) {
		this.cvs.add(cv);
	}
	
	public List<CV> getCvs() {
		return this.cvs;
	}
	
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", prenom=" + prenom + ", mail=" + mail + ", siteWeb=" + siteWeb
				+ ", naissance=" + naissance + ", motdepasse=" + motdepasse + "]";
	}
}
