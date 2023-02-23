import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Page8 extends MotherPage implements ActionListener, ChangeListener{
    private JLabel label;
    private JButton button;
    private JCheckBox checkBox;
    
    public Page8() {
        label = new JLabel("Acepta terminos y condiciones");
        label.setBounds(10, 10, 200, 30);
        add(label);

        checkBox = new JCheckBox("Acepto");
        checkBox.setBounds(10, 50, 100, 30);
        checkBox.addChangeListener(this);
        add(checkBox);

        button = new JButton("Continuar");
        button.setBounds(10, 90, 100, 30);
        button.addActionListener(this);
        add(button);
        //Habilita el boton (Enabled : Habilitado)
        button.setEnabled(false);

        setTitle("Pagina Tipo 8");
        setBounds(0, 0, 220, 170);
        super.pageDefault();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (checkBox.isSelected()) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.exit(0);
        }
    }
}
