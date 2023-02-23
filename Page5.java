import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Page5 extends MotherPage implements ActionListener{
    private JLabel label, label1, label2;
    private JComboBox comboBox, comboBox1, comboBox2;
    private JButton button, button1;

    public void num0to255(JComboBox combo) {
        for (int i = 0; i <= 255; i++) {
            combo.addItem(String.valueOf(i));
        }
    }

    public Page5() {
        label = new JLabel("Rojo:");
        label.setBounds(10, 10, 100, 30);
        add(label);

        comboBox = new JComboBox();
        comboBox.setBounds(120, 10, 100, 30);
        num0to255(comboBox);
        add(comboBox);
        
        label1 = new JLabel("Verde:");
        label1.setBounds(10, 50, 100, 30);
        add(label1);

        comboBox1 = new JComboBox();
        comboBox1.setBounds(120, 50, 100, 30);
        num0to255(comboBox1);
        add(comboBox1);

        label2 = new JLabel("Azul:");
        label2.setBounds(10, 90, 100, 30);
        add(label2);

        comboBox2 = new JComboBox();
        comboBox2.setBounds(120, 90, 100, 30);
        num0to255(comboBox2);
        add(comboBox2);

        button = new JButton("Fijas Color");
        button.setBounds(10, 130, 100, 30);
        add(button);
        button.addActionListener(this);

        button1 = new JButton("Color");
        button1.setBounds(120, 130, 100, 30);
        add(button1);

        setBounds( 0, 0, 240, 210);
        setTitle("Pagina Tipo 5");
        super.pageDefault();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            int rojo = Integer.parseInt(comboBox.getSelectedItem().toString());
            int verde = Integer.parseInt(comboBox1.getSelectedItem().toString());
            int azul = Integer.parseInt(comboBox2.getSelectedItem().toString());

            Color color = new Color(rojo, verde, azul);
            button1.setBackground(color);
        }
    }
}
