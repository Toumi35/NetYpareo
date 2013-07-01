package ypareoEntities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Carole
 */
@Entity
@Table(name = "UTILISATEUR", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"IDENTIFIANT"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Utilisateur.findAll", query = "SELECT u FROM Utilisateur u"),
    @NamedQuery(name = "Utilisateur.findByIdUser", query = "SELECT u FROM Utilisateur u WHERE u.idUser = :idUser"),
    @NamedQuery(name = "Utilisateur.findByIdentifiant", query = "SELECT u FROM Utilisateur u WHERE u.identifiant = :identifiant"),
    @NamedQuery(name = "Utilisateur.findByMdp", query = "SELECT u FROM Utilisateur u WHERE u.mdp = :mdp")})
public class Utilisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_USER", nullable = false)
    private Long idUser;
    @Basic(optional = false)
    @Column(name = "IDENTIFIANT", nullable = false, length = 50)
    private String identifiant;
    @Basic(optional = false)
    @Column(name = "MDP", nullable = false, length = 50)
    private String mdp;

    public Utilisateur() {
    }

    public Utilisateur(Long idUser) {
        this.idUser = idUser;
    }

    public Utilisateur(Long idUser, String identifiant, String mdp) {
        this.idUser = idUser;
        this.identifiant = identifiant;
        this.mdp = mdp;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur))
        {
            return false;
        }
        
        Utilisateur other = (Utilisateur) object;
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "ypareoEntities.Utilisateur[ idUser=" + idUser + " ]";
    }
}