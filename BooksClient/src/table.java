import service.*;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class table extends AbstractTableModel {
    private static List<BookItem> list ;

    static JTable table;
    public List<BookItem> getList() {
        return list;
    }
    private String[] entetes = {"Code", "Titre", "Date", "Disponible", "Example","Auteurs"};
    BooksReader STUB=new BooksService().getBooksReaderPort();
    public table() {
        super();
        list=STUB.readBooks();
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

         STUB.addBook(book.getCode(),book.getTitre(),book.getDate(),book.getNbDispo(),book.getNbExamp());
         addRelation(book);
        list=STUB.readBooks();
        fireTableRowsInserted(list.size() -1, list.size() -1);
    }
    public void removeBook(int rowIndex) {
        STUB.deleteBook(list.get(rowIndex).getCode());
        list.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    public void getdispo(){
        list=STUB.getDispoBook();
        fireTableRowsDeleted(0,list.size());
    }
    public void getData(){
        list=STUB.readBooks();
        fireTableRowsDeleted(0,list.size());
    }

    void addRelation(BookItem book){
        for (Auteur i : book.getAuteurs()){
            STUB.addRelation(book.getCode(),i.getId());
        }
    }

    public static void setList(List<BookItem> list) {
       list = list;
    }
}