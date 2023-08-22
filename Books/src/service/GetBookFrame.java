package service;

import service.BookItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GetBookFrame extends JFrame implements ActionListener{
    //element of app
    JButton button=new JButton();
    JButton Cbutton=new JButton();
    JTextField output=new JTextField();
    JTextField input=new JTextField();
    GetBookFrame() {
        //Create Input
        input.setPreferredSize(new Dimension(300,25));
        input.setMinimumSize(new Dimension(300,25));
        input.setFont(new Font("SansSerif", Font.BOLD, 20));

        //accept only numbers
        input.addKeyListener(new KeyAdapter() {
                                 public void keyTyped(KeyEvent e) {
                                     char c = e.getKeyChar();
                                     System.out.println(c);
                                     if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                                         e.consume();  // if it's not a number, ignore the event
                                     }
                                 }
                             }
        );

        //Create output For result
        output.setPreferredSize(new Dimension(300,100));
        output.setMinimumSize(new Dimension(300,100));
        output.setEditable(false);
        output.setFont(new Font("SansSerif",0, 12));

        //Create Button
        button.setText("Chercher");
        button.addActionListener(this);
        Cbutton.setText("Annuler");
        Cbutton.addActionListener(this);

        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(1,2,20,0));
        panel.setSize(new Dimension(500,70));
        panel.add(button);
        panel.add(Cbutton);

        //create Frame
        JFrame frame = new JFrame();
        frame.setLocationRelativeTo(null);
        frame.setTitle("Chercher livre");
        frame.setSize(400,300);
        frame.setResizable(false);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 20));
        frame.add(input);
        frame.add(output);
        frame.add(panel);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button && !input.getText().isEmpty()){
            try {
                BookItem result=new DBHelper().getBookById(Integer.parseInt(input.getText()));
                if (result==null){
                    output.setText("le livre  nexiste pas");
                }else {
                    output.setText(result.getTitre()+" "+result.getDate()+" disponble "+result.getNbDispo());
                }
            }
            catch(Exception error) {
            }
        }else {
            output.setText("Please enter number");
        }
        if (e.getSource()==Cbutton){
            button.setEnabled(true);
            input.setEditable(true);
            input.setText("");
            output.setText("");
        }
    }
}
