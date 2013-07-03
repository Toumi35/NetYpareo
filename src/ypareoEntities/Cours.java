/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ypareoEntities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Carole
 */
@Entity
@Table(name = "COURS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cours.findAll", query = "SELECT c FROM Cours c"),
    @NamedQuery(name = "Cours.findByIdCours", query = "SELECT c FROM Cours c WHERE c.idCours = :idCours"),
    @NamedQuery(name = "Cours.findByIntitule", query = "SELECT c FROM Cours c WHERE c.intitule = :intitule"),
    @NamedQuery(name = "Cours.findByDateCours", query = "SELECT c FROM Cours c WHERE c.dateCours = :dateCours"),
    @NamedQuery(name = "Cours.findByHeureCours", query = "SELECT c FROM Cours c WHERE c.heureCours = :heureCours")})

public class Cours implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_COURS", nullable = false)
    private Long idCours;
    @Basic(optional = false)
    @Column(name = "INTITULE", nullable = false, length = 100)
    private String intitule;
    @Column(name = "DATE_COURS")
    @Temporal(TemporalType.DATE)
    private Date dateCours;
    @Column(name = "HEURE_COURS", length = 10)
    private String heureCours;
    
    @ManyToOne
    Professeur prof = null;

    public Cours() { }

    public Cours(Long idCours)
    {
        this.idCours = idCours;
    }

    public Cours(Long idCours, String intitule)
    {
        this.idCours = idCours;
        this.intitule = intitule;
    }

    public Long getIdCours()
    {
        return idCours;
    }

    public void setIdCours(Long idCours)
    {
        this.idCours = idCours;
    }

    public String getIntitule()
    {
        return intitule;
    }

    public void setIntitule(String intitule)
    {
        this.intitule = intitule;
    }

    public Date getDateCours()
    {
        return dateCours;
    }

    public void setDateCours(Date dateCours)
    {
        this.dateCours = dateCours;
    }

    public String getHeureCours()
    {
        return heureCours;
    }

    public void setHeureCours(String heureCours)
    {
        this.heureCours = heureCours;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idCours != null ? idCours.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cours))
        {
            return false;
        }
        Cours other = (Cours) object;
        if ((this.idCours == null && other.idCours != null) || (this.idCours != null && !this.idCours.equals(other.idCours)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        //return "ypareoEntities.Cours[ idCours=" + idCours + " ]";
        return "Cours : " + intitule + " [" + dateCours + " - " + heureCours + "]";
    }
    
    @OneToMany
    private List<Cours> courses = new ArrayList<Cours>();
    
    public List<Cours> getCourses()
    {
        return courses;
    }

    public void setCourses(List<Cours> courses)
    {
        this.courses = courses;
    }
}