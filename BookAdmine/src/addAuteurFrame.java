
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class addAuteurFrame extends JFrame implements ActionListener {
    JButton addAut=new JButton();
    JTextField namInput=new JTextField();
    JTextField pNameInput=new JTextField();
    JLabel er=new JLabel();
    AuteurTable table;

    public addAuteurFrame(AuteurTable table) {
        this.table=table;
        JPanel AddautPannel=new JPanel();
        AddautPannel.setLayout(new GridLayout(5,0,40,10));
        JLabel name=new JLabel();
        JLabel pName=new JLabel();
        addAut.setText("Ajouter");
        addAut.addActionListener(this);
        name.setText("Nom");
        pName.setText("Prenom");
        name.setSize(new Dimension(20,20));
        pName.setSize(new Dimension(20,20));

        pNameInput.setPreferredSize(new Dimension(250,40));
        namInput.setMaximumSize(new Dimension(250,40));
        pNameInput.setPreferredSize(new Dimension(250,40));
        namInput.setMaximumSize(new Dimension(250,40));
        AddautPannel.add(name);
        AddautPannel.add(namInput);
        AddautPannel.add(pName);
        AddautPannel.add(pNameInput);
        AddautPannel.add(addAut);
        JFrame frame=new JFrame();
        frame.add(AddautPannel);
        frame.add(er);
        frame.setSize(new Dimension(300,400));
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==addAut){
            if (!namInput.getText().isEmpty()&&!pNameInput.getText().isEmpty()){
                table.addAuteur(namInput.getText(),pNameInput.getText());
                namInput.setText("");
                pNameInput.setText("");
                er.setText("");
            }else {
                er.setText("Entrer les donnees");
            }
        }
    }

}
