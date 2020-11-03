package model;

import java.io.Serializable;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Table(name = "table_cv")
@Entity()
public class CV implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cv_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "p_id", nullable = true)
    private Person owner;
    
    /*
    @ManyToOne
    @JoinColumn(name = "p_mail")
    private Person owner;
    	/*
    @OneToMany(mappedBy = "cvOwner", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Activite> listeActivites;
	
	
@@ -37,4 +48,12 @@
	public void addActivite(Activite activite) {
		this.listeActivites.add(activite);
	}
*/
	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}
}