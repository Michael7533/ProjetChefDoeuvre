package com.example.demooptimus.model;

import javax.persistence.*;

@Entity
public class Activite {

    @Id
    private Long idActivite;
    private String codeActivite;
    private String libelleActivite;
    private Long ordre;



    public Activite(Long idActivite, String codeActivite, String libelleActivite, Long ordre, Boolean test) {
        this.idActivite = idActivite;
        this.codeActivite = codeActivite;
        this.libelleActivite = libelleActivite;
        this.ordre = ordre;
    }

    public Activite() {

    }

    public Long getIdActivite() {
        return idActivite;
    }

    public void setIdActivite(Long id) {
        this.idActivite = id;
    }

    public String getCodeActivite() {
        return codeActivite;
    }

    public void setCodeActivite(String codeActivite) {
        this.codeActivite = codeActivite;
    }

    public String getLibelleActivite() {
        return libelleActivite;
    }

    public void setLibelleActivite(String libelleActivite) {
        this.libelleActivite = libelleActivite;
    }

    public Long getOrdre() {
        return ordre;
    }

    public void setOrdre(Long ordre) {
        this.ordre = ordre;
    }

    public Activite(Long idActivite, String codeActivite, String libelleActivite, Long ordre) {
        this.idActivite = idActivite;
        this.codeActivite = codeActivite;
        this.libelleActivite = libelleActivite;
        this.ordre = ordre;
    }
}

