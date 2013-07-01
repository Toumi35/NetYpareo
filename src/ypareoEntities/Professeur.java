/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ypareoEntities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

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
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PROFESSEUR", nullable = false)
    private Long idProfesseur;
    @Basic(optional = false)
    @Column(name = "NOM", nullable = false, length = 100)
    private String nom;

    public Professeur(){ }

    public Professeur(Long idProfesseur)
    {
        this.idProfesseur = idProfesseur;
    }

    public Professeur(Long idProfesseur, String nom)
    {
        this.idProfesseur = idProfesseur;
        this.nom = nom;
    }

    public Long getIdProfesseur()
    {
        return idProfesseur;
    }

    public void setIdProfesseur(Long idProfesseur)
    {
        this.idProfesseur = idProfesseur;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
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
    
}
