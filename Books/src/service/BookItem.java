package service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookItem {
    int code;
    String titre;
    String date;
    int nbDispo;
    int nbExamp;

    List<Auteur> auteurs;

    public BookItem(int code, String titre, String date, int nbDispo, int nbExamp/*, List<Auteur> auteurs*/) {
        this.code = code;
        this.titre = titre;
        this.date = date;
        this.nbDispo = nbDispo;
        this.nbExamp = nbExamp;
        //this.auteurs = auteurs;
        this.auteurs=new ArrayList<Auteur>();
    }

    public void addAuteur(Auteur auteur){
        this.auteurs.add(auteur);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNbDispo() {
        return nbDispo;
    }

    public void setNbDispo(int nbDispo) {
        this.nbDispo = nbDispo;
    }

    public int getNbExamp() {
        return nbExamp;
    }

    public void setNbExamp(int nbExamp) {
        this.nbExamp = nbExamp;
    }

    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(List<Auteur> auteurs) {
        this.auteurs = auteurs;
    }

    @Override
    public String toString() {
        return "BookItem{" +
                "code=" + code +
                ", titre='" + titre + '\'' +
                ", date='" + date + '\'' +
                ", nbDispo=" + nbDispo +
                ", nbExamp=" + nbExamp +
                ", auteurs=" + auteurs +
                '}';
    }
}
