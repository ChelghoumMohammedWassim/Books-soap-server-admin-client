package service;

public class Auteur {
    int id;
    String nom;
    String pNom;

    public Auteur(int id, String nom, String pNom) {
        this.id = id;
        this.nom = nom;
        this.pNom = pNom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getpNom() {
        return pNom;
    }

    public void setpNom(String pNom) {
        this.pNom = pNom;
    }

    @Override
    public String toString() {
        return
                 nom + '\'' +
                " " + pNom + '\'' +
                "\n";
    }
}
