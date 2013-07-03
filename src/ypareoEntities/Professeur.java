/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ypareoEntities;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Carole
 */
@Entity
@Table(name = "PROFESSEUR")
@NamedQueries({
    @NamedQuery(name = "Professeur.findAll", query = "SELECT p FROM Professeur p"),
    @NamedQuery(name = "Professeur.findByIdProfesseur", query = "SELECT p FROM Professeur p WHERE p.idProfesseur = :idProfesseur"),
    @NamedQuery(name = "Professeur.findByNom", query = "SELECT p FROM Professeur p WHERE p.nom = :nom")})
public class Professeur implements Serializable
{    
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PROFESSEUR", nullable = false)
    private Long idProfesseur;
    @Basic(optional = false)
    @Column(name = "NOM", nullable = false, length = 100)
    private String nom;    
    @Basic(optional = false)
    @Column(name = "IDENTIFIANT", nullable = false, length = 50)
    private String identifiant;
    @Basic(optional = false)
    @Column(name = "MDP", nullable = false, length = 50)
    private String mdp;

    public Professeur(){ }

    public Professeur(Long idProfesseur)
    {
        this.idProfesseur = idProfesseur;
    }

    public Professeur(Long idProfesseur, String nom, String identifiant, String mdp)
    {
        this.idProfesseur = idProfesseur;
        this.nom = nom;
        this.identifiant = identifiant;
        this.mdp = mdp;
    }

    public Long getIdProfesseur()
    {
        return idProfesseur;
    }

    public void setIdProfesseur(Long idProfesseur)
    {
        Long oldIdProfesseur = this.idProfesseur;
        this.idProfesseur = idProfesseur;
        changeSupport.firePropertyChange("idProfesseur", oldIdProfesseur, idProfesseur);
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        String oldNom = this.nom;
        this.nom = nom;
        changeSupport.firePropertyChange("nom", oldNom, nom);
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idProfesseur != null ? idProfesseur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Professeur))
        {
            return false;
        }
        Professeur other = (Professeur) object;
        if ((this.idProfesseur == null && other.idProfesseur != null) || (this.idProfesseur != null && !this.idProfesseur.equals(other.idProfesseur)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "ypareoEntities.Professeur[ idProfesseur=" + idProfesseur + " ]";
    }
    
    @OneToMany(mappedBy="prof")
    Set<Cours> courses = new HashSet<Cours>();
    
    public Set<Cours> getCourses()
    {
        return courses;
    }

    public void setCourses(Set<Cours> courses)
    {
        Set<Cours> oldCourses = this.courses;
        this.courses = courses;
        changeSupport.firePropertyChange("courses", oldCourses, courses);
    }
    
    @OneToMany
    private List<Professeur> professeurs = new ArrayList<Professeur>();
    
    public List<Professeur> getProfesseurs()
    {
        return professeurs;
    }

    public void setProfesseurs(List<Professeur> professeurs)
    {
        this.professeurs = professeurs;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        String oldIdentifant = this.identifiant;
        this.identifiant = identifiant;
        changeSupport.firePropertyChange("identifiant", oldIdentifant, identifiant);
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        String oldMDP = this.mdp;
        this.mdp = mdp;
        changeSupport.firePropertyChange("mdp", oldMDP, mdp);
    }
}