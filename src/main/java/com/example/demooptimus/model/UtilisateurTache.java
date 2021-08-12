package com.example.demooptimus.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class UtilisateurTache {
    @Id
    private Long idUtilisateurTache;
    private Long idTache;
    private Long idUtilisateur;
    private Date dateDebut;
    private Date dateFin;
    private String statut;
    private String motifAbandon;
    private String libelleAbandon;

    public Long getIdUtilisateurTache() {
        return idUtilisateurTache;
    }

    public void setIdUtilisateurTache(Long idUtilisateurTache) {
        this.idUtilisateurTache = idUtilisateurTache;
    }

    public Long getIdTache() {
        return idTache;
    }

    public void setIdTache(Long idTache) {
        this.idTache = idTache;
    }

    public Long getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Long idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getMotifAbandon() {
        return motifAbandon;
    }

    public void setMotifAbandon(String motifAbandon) {
        this.motifAbandon = motifAbandon;
    }

    public String getLibelleAbandon() {
        return libelleAbandon;
    }

    public void setLibelleAbandon(String libelleabandon) {
        this.libelleAbandon = libelleabandon;
    }

    public UtilisateurTache() {
    }

    public UtilisateurTache(Long idUtilisateurTache, Long idTache, Long idUtilisateur, Date dateDebut, Date dateFin, String statut, String motifAbandon, String libelleAbandon) {
        this.idUtilisateurTache = idUtilisateurTache;
        this.idTache = idTache;
        this.idUtilisateur = idUtilisateur;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.statut = statut;
        this.motifAbandon = motifAbandon;
        this.libelleAbandon = libelleAbandon;
    }
}
