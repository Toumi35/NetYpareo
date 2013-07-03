/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ypareoEntities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.jdo.annotations.Persistent;
import javax.persistence.Transient;

/**
 *
 * @author Carole
 */
@Entity
@Table(name = "ETUDIANT")
@NamedQueries({
    @NamedQuery(name = "Etudiant.findAll", query = "SELECT e FROM Etudiant e"),
    @NamedQuery(name = "Etudiant.findByIdEtudiant", query = "SELECT e FROM Etudiant e WHERE e.idEtudiant = :idEtudiant"),
    @NamedQuery(name = "Etudiant.findByNom", query = "SELECT e FROM Etudiant e WHERE e.nom = :nom"),
    @NamedQuery(name = "Etudiant.findByPrenom", query = "SELECT e FROM Etudiant e WHERE e.prenom = :prenom")})
public class Etudiant implements Serializable
{    
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ETUDIANT", nullable = false)
    private Long idEtudiant;
    @Basic(optional = false)
    @Column(name = "NOM", nullable = false, length = 100)
    private String nom;
    @Basic(optional = false)
    @Column(name = "PRENOM", nullable = false, length = 100)
    private String prenom;
    @Basic(optional = false)
    @Column(name = "IDENTIFIANT", nullable = false, length = 50)
    private String identifiant;
    @Basic(optional = false)
    @Column(name = "MDP", nullable = false, length = 50)
    private String mdp;

    public Etudiant()
    {
    }

    public Etudiant(Long idEtudiant)
    {
        this.idEtudiant = idEtudiant;
    }

    public Etudiant(Long idEtudiant, String nom, String prenom, String identifiant, String mdp)
    {
        this.idEtudiant = idEtudiant;
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.mdp = mdp;
    }

    public Long getIdEtudiant()
    {
        return idEtudiant;
    }

    public void setIdEtudiant(Long idEtudiant)
    {
        Long oldIdEtudiant = this.idEtudiant;
        this.idEtudiant = idEtudiant;
        changeSupport.firePropertyChange("idEtudiant", oldIdEtudiant, idEtudiant);
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        String oldNomEtudiant = this.nom;
        this.nom = nom;
        changeSupport.firePropertyChange("nom", oldNomEtudiant, nom);
    }

    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idEtudiant != null ? idEtudiant.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        if (!(object instanceof Etudiant))
        {
            return false;
        }
        Etudiant other = (Etudiant) object;
        if ((this.idEtudiant == null && other.idEtudiant != null) || (this.idEtudiant != null && !this.idEtudiant.equals(other.idEtudiant)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "ypareoEntities.Etudiant[ idEtudiant=" + idEtudiant + " ]";
    }
    
    @OneToMany
    private List<Etudiant> etudiants = new ArrayList<Etudiant>();
    
    public List<Etudiant> getEtudiants()
    {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants)
    {
        this.etudiants = etudiants;
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