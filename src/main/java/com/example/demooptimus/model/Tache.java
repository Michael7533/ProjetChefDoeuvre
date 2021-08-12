package com.example.demooptimus.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Tache {
    @Id
    private Long idTache;
    private Long idRefTache;
    private Long idDossier;
    private Boolean maturite;
    private Date dateCreation;
    private Date dateMiseAJour;
    private String etat;
    private Boolean topErreurRelancAuto;

    public Long getIdTache() {
        return idTache;
    }

    public void setIdTache(Long idTache) {
        this.idTache = idTache;
    }

    public Long getIdRefTache() {
        return idRefTache;
    }

    public void setIdRefTache(Long idRefTache) {
        this.idRefTache = idRefTache;
    }

    public Long getIdDossier() {
        return idDossier;
    }

    public void setIdDossier(Long idDossier) {
        this.idDossier = idDossier;
    }

    public Boolean getMaturite() {
        return maturite;
    }

    public void setMaturite(Boolean maturite) {
        this.maturite = maturite;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateMiseAJour() {
        return dateMiseAJour;
    }

    public void setDateMiseAJour(Date dateMiseAJour) {
        this.dateMiseAJour = dateMiseAJour;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Boolean getTopErreurRelancAuto() {
        return topErreurRelancAuto;
    }

    public void setTopErreurRelancAuto(Boolean topErreurRelancAuto) {
        this.topErreurRelancAuto = topErreurRelancAuto;
    }

    public Tache() {
    }

    public Tache(Long idTache, Long idRefTache, Long idDossier, Boolean maturite, Date dateCreation, Date dateMiseAJour, String etat, Boolean topErreurRelancAuto) {
        this.idTache = idTache;
        this.idRefTache = idRefTache;
        this.idDossier = idDossier;
        this.maturite = maturite;
        this.dateCreation = dateCreation;
        this.dateMiseAJour = dateMiseAJour;
        this.etat = etat;
        this.topErreurRelancAuto = topErreurRelancAuto;
    }
}
