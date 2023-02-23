import java.awt.event.*;
import javax.swing.*;
public class Page2 extends MotherPage implements ActionListener, ItemListener{
    //(field : campo)
    private JTextField textField;
    private JLabel label;
    private JButton button;
    private JComboBox comboBox;
    private String name;
    private String itemSelectedString;


    public Page2(){

        label = new JLabel("Nombre:");
        label.setBounds(10, 10, 50, 30);
        add(label);

        button = new JButton("Aceptar");
        button.setBounds(270, 80, 100, 20);
        add(button);
        button.addActionListener(this);

        textField = new JTextField();
        textField.setBounds(70, 10, 180, 30);
        add(textField);

        comboBox = new JComboBox();
        comboBox.setBounds(270, 10, 100, 30);
        add(comboBox);
        comboBox.addItem("");
        comboBox.addItem("tipo 1");
        comboBox.addItem("tipo 2");
        comboBox.addItem("tipo 3");
        comboBox.addItemListener(this);

        setTitle("Pagina Tipo 2");
        setBounds( 0, 0, 400, 150);
        super.pageDefault();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            name = textField.getText();
            this.setTitle(name + " " + itemSelectedString);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == comboBox) {
            itemSelectedString = e.getItem().toString();
            this.setTitle(name + " " + itemSelectedString);
        }
    }
}
