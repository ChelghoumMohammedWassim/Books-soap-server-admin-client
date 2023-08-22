package service;

public class Relation {
    int id;
    int book_id;
    int auteur_id;

    public Relation(int id, int book_id, int auteur_id) {
        this.id = id;
        this.book_id = book_id;
        this.auteur_id = auteur_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getAuteur_id() {
        return auteur_id;
    }

    public void setAuteur_id(int auteur_id) {
        this.auteur_id = auteur_id;
    }

    @Override
    public String toString() {
        return "Reloation{" +
                "id=" + id +
                ", book_id=" + book_id +
                ", auteur_id=" + auteur_id +
                '}';
    }
}
