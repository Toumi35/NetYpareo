package ypareoEntities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Carole
 */
@Entity
@Table(name = "SALLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salle.findAll", query = "SELECT s FROM Salle s"),
    @NamedQuery(name = "Salle.findByIdSalle", query = "SELECT s FROM Salle s WHERE s.idSalle = :idSalle"),
    @NamedQuery(name = "Salle.findByNom", query = "SELECT s FROM Salle s WHERE s.nom = :nom")})
public class Salle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_SALLE", nullable = false)
    private Long idSalle;
    @Basic(optional = false)
    @Column(name = "NOM", nullable = false, length = 50)
    private String nom;

    public Salle() {
    }

    public Salle(Long idSalle) {
        this.idSalle = idSalle;
    }

    public Salle(Long idSalle, String nom) {
        this.idSalle = idSalle;
        this.nom = nom;
    }

    public Long getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(Long idSalle) {
        this.idSalle = idSalle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idSalle != null ? idSalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salle))
        {
            return false;
        }
        
        Salle other = (Salle) object;
        if ((this.idSalle == null && other.idSalle != null) || (this.idSalle != null && !this.idSalle.equals(other.idSalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "ypareoEntities.Salle[ idSalle=" + idSalle + " ]";
    }
    
    @OneToMany
    private List<Salle> salles = new ArrayList<Salle>();
    
    public List<Salle> getSalles()
    {
        return salles;
    }

    public void setSalles(List<Salle> salles)
    {
        this.salles = salles;
    }
}