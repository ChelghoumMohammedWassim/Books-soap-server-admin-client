package service;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class AuteurTable extends AbstractTableModel {

    List<Auteur> list;
    private String[] entetes = {"code","Nom", "Prenom"};

    public AuteurTable() {
        this.list = new DBHelper().getAuteur();
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
                return list.get(rowIndex).getpNom();
            default:
                return null;
        }
    }
}
