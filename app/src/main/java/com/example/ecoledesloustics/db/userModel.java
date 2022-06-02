package com.example.ecoledesloustics.db;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class userModel implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "login")
    private String login;

    @ColumnInfo(name = "prenom")
    private String prenom;

    @ColumnInfo(name = "nom")
    private String nom;

    @ColumnInfo(name = "email")
    private String email;

    @ColumnInfo(name = "motdepasse")
    private String motdepasse;

    /*
     * Getters and Setters
     * */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getprenom() {
        return prenom;
    }

    public void setprenom(String prenom) {
        this.prenom = prenom;
    }

    public String getnom() {
        return nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getmotdepasse() {
        return motdepasse;
    }

    public void setmotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

}