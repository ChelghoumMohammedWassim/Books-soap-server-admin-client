package service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class AddFrame extends JFrame implements ActionListener{

    JFrame frame=new JFrame();
    JButton addButton =new JButton();
    JButton closeButton=new JButton();
    JTextField titreInput=new JTextField();
    JTextField dateInput=new JTextField();
    JTextField exampInput=new JTextField();
    table table;
    JLabel er;
    JComboBox<Auteur> comboBox=new JComboBox<>();
    JButton addAuteur=new JButton();
    AuteurTable auteurTable=new AuteurTable();
    JTable table1;
    public AddFrame(table table){
        this.table=table;
        frame.setSize(new Dimension(900, 700));
        frame.setLayout(new GridLayout(1,2,40,0));
        frame.setTitle("Ajouter");
        frame.setResizable(false);
        JPanel panel= new JPanel();
        panel.setLayout(new GridLayout(8,0,10,10));
        JLabel titre=new JLabel();
        titre.setText("Titre");
        titre.setSize(new Dimension(20,20));
        titre.setFont(new Font("", 0, 16));
        JLabel date=new JLabel();
        date.setText("date");
        date.setFont(new Font("", 0, 16));
        JLabel auteur=new JLabel();
        auteur.setText("sélectionner les auteurs");
        JLabel example=new JLabel();
        example.setText("Example");
        example.setFont(new Font("", 0, 16));

        titreInput.setPreferredSize(new Dimension(250,50));

        titreInput.setPreferredSize(new Dimension(250,20));

        titreInput.setPreferredSize(new Dimension(250,20));

        titreInput.setPreferredSize(new Dimension(250,20));
        dateInput.addKeyListener(new KeyAdapter() {
                                     public void keyTyped(KeyEvent e) {
                                         char cKey = e.getKeyChar();
                                         if ( ((cKey < '0') || (cKey > '9')) && (cKey != KeyEvent.VK_BACK_SPACE)) {
                                             e.consume();
                                         }
                                     }
                                 }
        );
        exampInput.addKeyListener(new KeyAdapter() {
                                      public void keyTyped(KeyEvent e) {
                                          char cKey = e.getKeyChar();
                                          if ( ((cKey < '0') || (cKey > '9')) && (cKey != KeyEvent.VK_BACK_SPACE)) {
                                              e.consume();
                                          }
                                      }
                                  }
        );
        List<Auteur> auteurs=new DBHelper().getAuteur();
        for (Auteur aut :auteurs){
            comboBox.addItem(aut);
        }
        JPanel auteurPannel=new JPanel();
        auteurPannel.setLayout(new GridLayout(1,2,40,0));

        table1=new JTable(auteurTable);

        er=new JLabel();

        addButton.setText("Ajouter");
        closeButton.setText("Anuuler");
        addAuteur.setText("Ajouter auteur");
        addButton.addActionListener(this);
        closeButton.addActionListener(this);
        addButton.addActionListener(this);
        auteurPannel.add(comboBox);
        auteurPannel.add(addAuteur);
        panel.add(titre);
        panel.add(titreInput);
        panel.add(date);
        panel.add(dateInput);
        panel.add(example);
        panel.add(exampInput);
        panel.add(er);


        JPanel buttons=new JPanel();
        buttons.setLayout(new GridLayout(1,2,40,0));
        buttons.setSize(new Dimension(500,70));
        buttons.add(addButton);
        buttons.add(closeButton);
        panel.add(buttons);
        //panel.add(auteur);
        JPanel inputPannel=new JPanel();
        inputPannel.setSize(new Dimension(100, 700));
        inputPannel.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 20));
        inputPannel.add(panel);
        //inputPannel.add(er);


        frame.add(inputPannel);
        frame.add(new JScrollPane(table1));

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==addButton){
            String titre=titreInput.getText().toString();
            String date=dateInput.getText().toString();
            String examp=exampInput.getText();
            List<Auteur> list = new DBHelper().getAuteur();
            List<Auteur> auteurs=new ArrayList<>();
            int[] selection = table1.getSelectedRows();
            for (int i = selection.length - 1; i >= 0; i--) {
                auteurs.add(list.get(selection[i]));
            }
            if (!titre.isEmpty()&&!date.isEmpty()&&!examp.isEmpty()&&!auteurs.isEmpty()){
                   BookItem book = new BookItem(table.getList().size()+1,titre,date,Integer.parseInt(examp),Integer.parseInt(examp));
                   book.setAuteurs(auteurs);
                   table.addBook(book);
                   titreInput.setText("");
                   exampInput.setText("");
                   dateInput.setText("");
                   er.setText("");
            }
            if (titre.isEmpty()&&date.isEmpty()&&!examp.isEmpty()&&auteurs.isEmpty()){
                er.setText("Entrer les  donnees et selectioner le(s) auteur(s)");
            }
        }
        if (e.getSource()==closeButton){
            frame.dispose();
            new Frame().setVisible(true);
        }
    }
}
