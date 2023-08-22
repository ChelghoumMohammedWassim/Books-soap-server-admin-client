package service;

import service.BookItem;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListHelper {

    List<BookItem> list ;

    public List<BookItem> getList() {
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
        List<BookItem> list =getList();
        for (BookItem book :list){
            if (book.getCode()==id){
                return book;
            }
        }
        return null;
    }

    public List<BookItem> getDispoBooks(){
        getList();
        List<BookItem> dispList=new ArrayList<BookItem>();
        for (BookItem book:list){
            if (book.getNbDispo()>0){
                dispList.add(book);
            }
        }
        return dispList;
    }
}

