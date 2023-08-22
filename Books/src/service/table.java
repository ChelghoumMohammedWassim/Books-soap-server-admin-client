package service;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class table extends AbstractTableModel {
    private static List<BookItem> list ;

    JTable table;
    public List<BookItem> getList() {
        return list;
    }
    private String[] entetes = {"Code", "Titre", "Date", "Disponible", "Example","Auteurs"};
    public table() {
        super();
        list=new DBHelper().getData();
        setAuteursList();
        //entetes=new DBHelper().getCollumns().toArray(new String[0]);
    }
    public int getRowCount() {
        return list.size();
    }
    public int getColumnCount() {
        return entetes.length;
    }
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getCode();
            case 1:
                return list.get(rowIndex).getTitre();
            case 2:
                return list.get(rowIndex).getDate();
            case 3:
                return list.get(rowIndex).getNbDispo();
            case 4:
                return list.get(rowIndex).getNbExamp();
            case 5:
                return list.get(rowIndex).getAuteurs();
            default:
                return null;
        }
    }
    public void addBook(BookItem book) {
        DBHelper helper=new DBHelper();
        helper.addBookToDb(book);
        list=helper.getData();
        setAuteursList();
        fireTableRowsInserted(list.size() -1, list.size() -1);
    }
    public void removeBook(int rowIndex) {

        new DBHelper().deleteBookFromeDb(list.get(rowIndex).getCode());
        list.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    public void getdispo(){
        list=new DBHelper().getDispoBooks();
        setAuteursList();
        fireTableRowsDeleted(0,list.size());
    }
    public void getData(){
        list=new DBHelper().getData();
        setAuteursList();
        fireTableRowsDeleted(0,list.size());
    }
    public void setAuteursList(){
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
    }
}