import javax.swing.*;
import javax.swing.event.*;
public class Page7 extends MotherPage implements ChangeListener {
    private JCheckBox checkBox, checkBox2, checkBox3;

    public Page7() {
        checkBox = new JCheckBox("Inglés");
        checkBox.setBounds(10, 10, 100, 30);
        checkBox.addChangeListener(this);
        add(checkBox);

        checkBox2 = new JCheckBox("Frances");
        checkBox2.setBounds(10, 50, 100, 30);
        checkBox2.addChangeListener(this);
        add(checkBox2);
        
        checkBox3 = new JCheckBox("Aleman");
        checkBox3.setBounds(10, 90, 100, 30);
        checkBox3.addChangeListener(this);
        add(checkBox3);

        setTitle("Pagina Tipo 7");
        setBounds(10, 10, 400, 160);
        super.pageDefault();
    }
    
    @Override
    //revisa si las casillas estan selecionadas
    public void stateChanged(ChangeEvent e) {
        String title = "";
        String a = "";
        String b = "";
        String c = "";
        if(checkBox.isSelected()) {
            a = "Inglés  ";
        }
        if (checkBox2.isSelected()) {
            b = "  Frances  ";
        }
        if (checkBox3.isSelected()) {
            c = "  Aleman";
        }
        title = a + b + c;
        setTitle(title);
    }
}
