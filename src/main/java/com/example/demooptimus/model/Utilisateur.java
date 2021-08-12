package com.example.demooptimus.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Utilisateur {
    @Id
    private Long idUtilisateur;
    private String nom;
    private String prenom;
    private String userName;

    public Long getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Long idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Utilisateur() {
    }

    public Utilisateur(Long idUtilisateur, String nom, String prenom, String userName) {
        this.idUtilisateur = idUtilisateur;
        this.nom = nom;
        this.prenom = prenom;
        this.userName = userName;
    }
}
