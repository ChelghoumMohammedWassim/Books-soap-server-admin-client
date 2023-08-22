package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(name = "BooksReader")
public class books {
    DBHelper listHelper= new DBHelper();

    @WebMethod(operationName = "readBooks")
    public List<BookItem>  readBooks(){
        List<BookItem> list=listHelper.getData();
        DBHelper db=new DBHelper();
        List<Auteur> auteurList= db.getAuteur();
        List<Relation>relationList=db.getRelation();
        for (Relation r: relationList){
            for (BookItem book:list){
                if (book.getCode()==r.getBook_id()){
                    for (Auteur auteur:auteurList){
                        if (auteur.getId()==r.getAuteur_id()){
                            book.addAuteur(auteur);
                        }
                    }
                }
            }
        }
        return list;
    }

    @WebMethod(operationName = "getBookById")
    public BookItem getBookById(@WebParam int id){
        return listHelper.getBookById(id);
    }

    @WebMethod(operationName = "GetDispoBook")
    public List<BookItem> GetDispoBook(){
        List<BookItem> list=listHelper.getDispoBooks();
        DBHelper db=new DBHelper();
        List<Auteur> auteurList= db.getAuteur();
        List<Relation>relationList=db.getRelation();
        for (Relation r: relationList){
            for (BookItem book:list){
                if (book.getCode()==r.getBook_id()){
                    for (Auteur auteur:auteurList){
                        if (auteur.getId()==r.getAuteur_id()){
                            book.addAuteur(auteur);
                        }
                    }
                }
            }
        }
        return list;
    }

    @WebMethod(operationName = "AddBook")
    public void addBook(@WebParam int code,String titre,String date, int disponible,int examplaire){
        BookItem book= new BookItem(code,titre,date,disponible,examplaire);
        listHelper.addBookToDb(book);
    }

    @WebMethod(operationName = "deleteBook")
    public void deleteBook(@WebParam int book_code){
        listHelper.deleteBookFromeDb(book_code);
    }

    @WebMethod(operationName = "getAuteur")
    public List<Auteur> getAuteur(){
        return listHelper.getAuteur();
    }

    @WebMethod(operationName = "getRelation")
    public List<Relation> getRelation(){
        return listHelper.getRelation();
    }

    @WebMethod(operationName = "addRelation")
    public  void addRelation(int bookId,int auteurId){
        listHelper.addRelation(bookId,auteurId);
    }
    @WebMethod(operationName = "addAuteur")
    public  void addAuteur(String name,String Pname){
        Auteur auteur =new Auteur(0,name,Pname);
        listHelper.addAuteur(auteur);
    }

}

