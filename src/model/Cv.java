package model;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity()
@Table(name = "table_cv")
public class Cv implements Serializable{
	
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="cv_id")
    int id;
    
    @ManyToOne
    @JoinColumn(name = "p_mail", nullable = true)
    private Person owner;
    	
    @OneToMany(mappedBy = "cvOwner")
	private List<Activite> listeActivites;
	
	
	private List<Activite> getListeActivites() {
		return this.listeActivites;
	}
	
	public void addActivite(Activite activite) {
		this.listeActivites.add(activite);
	}
}
