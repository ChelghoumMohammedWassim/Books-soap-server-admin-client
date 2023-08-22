import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    private JTable table;
    table InTable=new table();
    JFrame frame=new JFrame();
    JButton button;

    public Frame() {
        super();
        setTitle("Books");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        table = new JTable(InTable);
        table.setRowHeight(table.getRowHeight() + 20);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        Dimension width=getContentPane().getSize();
        table.getColumnModel().getColumn(0).setPreferredWidth(40);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);
        table.getColumnModel().getColumn(4).setPreferredWidth(100);
        table.getColumnModel().getColumn(4).setPreferredWidth(100);
        table.getColumnModel().getColumn(5).setPreferredWidth(510);
        getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
        JPanel boutons = new JPanel();
        //boutons.setLayout(new GridLayout(0,4));
        //button=new JButton(new AddAction());
        //boutons.add(button);
       // boutons.add(new JButton(new RemoveAction()));
        boutons.add(new JButton(new getData()));
        boutons.add(new JButton(new getDispo()));
        boutons.add(new JButton(new getById()));
        getContentPane().add(boutons, BorderLayout.SOUTH);
        setSize(new Dimension(900, 700));
        setMinimumSize(new Dimension(996,700));
        getContentPane().remove(table);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(button==e.getSource()){
            System.out.println("clicked");
        }

    }

    private class AddAction extends AbstractAction{
        private AddAction()  {
            super("Ajouter");
        }
        public void actionPerformed(ActionEvent e) {

           // new AddFrame(InTable);
            dispose();
        }
    }

    private class RemoveAction extends AbstractAction {
        private RemoveAction() {
            super("Supprimmer");
            setBackground(new Color(51, 51, 51));
        }

        public void actionPerformed(ActionEvent e) {
            int[] selection = table.getSelectedRows();
            for (int i = selection.length - 1; i >= 0; i--) {
                InTable.removeBook(selection[i]);
            }
        }
    }

    private class getData extends AbstractAction {
        private getData() {
            super("Touts les livres");
        }

        public void actionPerformed(ActionEvent e) {
            InTable.getData();

        }
    }

    private class getDispo extends AbstractAction {
        private getDispo() {
            super("Disponible");
        }

        public void actionPerformed(ActionEvent e) {
            InTable.getdispo();
        }
    }

    private class getById extends AbstractAction {
        private getById() {
            super("Rechercher par id");
        }

        public void actionPerformed(ActionEvent e) {
            new GetBookFrame();
        }
    }

}


