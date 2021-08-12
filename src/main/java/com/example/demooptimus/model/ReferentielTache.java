package com.example.demooptimus.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReferentielTache {
    @Id
    private Long idRefTache;
    private Long idActivite;
    private String codeRefTache;
    private String libelleTache;
    private String parcoursUtilisateur;
    private Long codeTacheRetour;
    private Long typecontrat;

    public Long getIdRefTache() {
        return idRefTache;
    }

    public void setIdRefTache(Long idRefTache) {
        this.idRefTache = idRefTache;
    }

    public Long getIdActivite() {
        return idActivite;
    }

    public void setIdActivite(Long idActivite) {
        this.idActivite = idActivite;
    }

    public String getCodeRefTache() {
        return codeRefTache;
    }

    public void setCodeRefTache(String codeRefTache) {
        this.codeRefTache = codeRefTache;
    }

    public String getLibelleTache() {
        return libelleTache;
    }

    public void setLibelleTache(String libelleTache) {
        this.libelleTache = libelleTache;
    }

    public String getParcoursUtilisateur() {
        return parcoursUtilisateur;
    }

    public void setParcoursUtilisateur(String parcoursUtilisateur) {
        this.parcoursUtilisateur = parcoursUtilisateur;
    }

    public Long getCodeTacheRetour() {
        return codeTacheRetour;
    }

    public void setCodeTacheRetour(Long codeTacheRetour) {
        this.codeTacheRetour = codeTacheRetour;
    }

    public Long getTypecontrat() {
        return typecontrat;
    }

    public void setTypecontrat(Long typecontrat) {
        this.typecontrat = typecontrat;
    }

    public ReferentielTache() {
    }

    public ReferentielTache(Long idRefTache, Long idActivite, String codeRefTache, String libelleTache, String parcoursUtilisateur, Long codeTacheRetour, Long typecontrat) {
        this.idRefTache = idRefTache;
        this.idActivite = idActivite;
        this.codeRefTache = codeRefTache;
        this.libelleTache = libelleTache;
        this.parcoursUtilisateur = parcoursUtilisateur;
        this.codeTacheRetour = codeTacheRetour;
        this.typecontrat = typecontrat;
    }
}
