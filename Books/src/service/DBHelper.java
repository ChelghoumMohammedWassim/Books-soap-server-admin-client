package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBHelper {

    List<BookItem> list ;
    List <Auteur> auteurList;
    List<Relation> reloations;

    public List<BookItem> getData() {
        this.list=new ArrayList();
        try {
            //sqlite
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ch\\IdeaProjects\\Books\\src\\books.db");
            //sql php
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Books", "root", "");
            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM Books");
            while (res.next()) {
                int code=res.getInt("code");
                String titre=res.getString("titre");
                String date=res.getString("date");
                int nbDispo=res.getInt("nbDispo");
                int nbExamp=res.getInt("nbExamp");
                BookItem book=new BookItem(code,titre,date,nbDispo,nbExamp);
                list.add(book);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }




    public BookItem getBookById(int id){
        List<BookItem> list =getData();
        for (BookItem book :list){
            if (book.getCode()==id){
                return book;
            }
        }
        return null;
    }

    public List<BookItem> getDispoBooks(){
        getData();
        List<BookItem> dispList=new ArrayList<BookItem>();
        for (BookItem book:list){
            if (book.getNbDispo()>0){
                dispList.add(book);
            }
        }
        return dispList;
    }

    public void addBookToDb(BookItem book) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Books", "root", "");
            Statement statement = conn.createStatement();
            statement.execute("INSERT INTO books VALUES('" + book.getCode()+ "','"+book.getTitre()+"','"+book.getDate()+"',"+book.getNbDispo()+","+book.getNbExamp()+")");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteBookFromeDb(int code) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Books", "root", "");
            Statement statement = conn.createStatement();
            statement.executeUpdate("DELETE FROM books WHERE code=" + code);
            deleteReloation(code);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public List<Auteur> getAuteur() {
        this.auteurList=new ArrayList();
        try {
            //sqlite
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ch\\IdeaProjects\\Books\\src\\books.db");
            //sql php
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Books", "root", "");
            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM auteurs");
            while (res.next()) {
                int id=res.getInt("id");
                String nom=res.getString("nom");
                String prenom=res.getString("prenom");
                this.auteurList.add(new Auteur(id,nom,prenom));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return auteurList;
    }

    public List<Relation> getRelation() {
        try {
            //sqlite
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ch\\IdeaProjects\\Books\\src\\books.db");
            //sql php
            this.reloations=new ArrayList<>();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Books", "root", "");
            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM cree");
            while (res.next()) {
                this.reloations.add(new Relation(res.getInt("id"),res.getInt("book_id"),res.getInt("auteur_id")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return this.reloations;
    }

    public void addRelation(int bookId,int auteurId){
        try {
            //sqlite
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ch\\IdeaProjects\\Books\\src\\books.db");
            //sql php
            this.reloations=new ArrayList<>();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Books", "root", "");
            Statement statement = conn.createStatement();
            statement.execute("INSERT INTO cree VALUES(NULL,'"+bookId+"','"+auteurId+"')");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addAuteur(Auteur auteur){
        try {
            //sqlite
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ch\\IdeaProjects\\Books\\src\\books.db");
            //sql php
            this.reloations=new ArrayList<>();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Books", "root", "");
            Statement statement = conn.createStatement();
            statement.execute("INSERT INTO auteurs VALUES(NULL,'"+auteur.getNom()+"','"+auteur.getpNom()+"')");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteReloation(int code){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Books", "root", "");
            Statement statement = conn.createStatement();
            statement.executeUpdate("DELETE FROM cree WHERE book_id=" + code);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

