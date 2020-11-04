package model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity()
@Table(name = "table_activite")
public class Activite implements Serializable {
	
    private static final long serialVersionUID = 1L;

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ac_id")
    private long id;
    
	@Basic()
	@Column(name = "ac_année", length = 200)
	private String année;
	
	@Basic()
	@Column(name = "ac_experience", length = 200)
	private String expérience;
	
	@Basic()
	@Column(name = "ac_formation", length = 200)
	private String formation;
	
	@Basic()
	@Column(name = "ac_projets", length = 200)
	private String projets;
	
	@Basic()
	@Column(name = "ac_autre", length = 200)
	private String autre;
	
	@Basic()
	@Column(name = "ac_titre", length = 200)
	private String titre;
	
	@Basic()
	@Column(name = "ac_descriptif", length = 200)
	private String descriptif;
	
	@Basic()
	@Column(name = "ac_WEB", length = 200)
	private String WEB;
	
    @ManyToOne
    @JoinColumn(name = "cv_id", nullable = true)
    private CV cvOwner;
    
    public void setCvOwner(CV cv) {
    	this.cvOwner = cv;
    }
	

	public String getAnnee() {
        return année;
    }

    public void setAnnee(String année) {
        this.année = année;
    }
    
    public String getExeperience() {
        return expérience;
    }

    public void setExperience(String expérience) {
        this.expérience = expérience;
    }
    
    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }
    
    public String getProjet() {
        return projets;
    }

    public void setProjet(String projets) {
        this.projets = projets;
    }
    
    public String getAutre() {
        return autre;
    }

    public void setAutre(String autre) {
        this.autre = autre;
    }
    
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
    
    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }
    
    public String getWeb() {
        return WEB;
    }

    public void setWeb(String WEB) {
        this.WEB = WEB;
    }
}