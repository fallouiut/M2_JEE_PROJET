package model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "table_activite")
public class Activite implements Serializable {
	
    private static final long serialVersionUID = 1L;
    
    @Id()
    int id;

	@Basic()
	@Column(name = "année", length = 200)
	private String année;
	
	@Basic()
	@Column(name = "experience", length = 200)
	private String expérience;
	
	@Basic()
	@Column(name = "formation", length = 200)
	private String formation;
	
	@Basic()
	@Column(name = "projets", length = 200)
	private String projets;
	
	@Basic()
	@Column(name = "autre", length = 200)
	private String autre;
	
	@Basic()
	@Column(name = "titre", length = 200)
	private String titre;
	
	@Basic()
	@Column(name = "descriptif", length = 200)
	private String descriptif;
	
	@Basic()
	@Column(name = "WEB", length = 200)
	private String WEB;
	
	@ManyToOne
	@JoinColumn(name="cv_id")
	private Cv cvOwner;
	

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
