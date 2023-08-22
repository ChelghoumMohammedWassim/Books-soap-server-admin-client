import service.Auteur;
import service.BooksReader;
import service.BooksService;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class AuteurTable extends AbstractTableModel {

    static List<Auteur> list;
    private String[] entetes = {"code","Nom", "Prenom"};
    BooksReader STUB=new BooksService().getBooksReaderPort();

    public AuteurTable() {
        list = STUB.getAuteur();
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
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getNom();
            case 2:
                return list.get(rowIndex).getPNom();
            default:
                return null;
        }
    }

    public void  addAuteur(String nom,String pnom){
        STUB.addAuteur(nom,pnom);
        list=STUB.getAuteur();
        fireTableRowsInserted(list.size() -1, list.size() -1);
    }
}
