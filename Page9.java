import javax.swing.*;
import javax.swing.event.*;
public class Page9 extends MotherPage implements ChangeListener{
    private JRadioButton radioButton1, radioButton2, radioButton3;
    private ButtonGroup buttonGroup;

    public Page9() {
        buttonGroup = new ButtonGroup();
        
        radioButton1 = new JRadioButton("400*400");
        radioButton1.setBounds(10, 10, 100, 30);
        radioButton1.addChangeListener(this);
        add(radioButton1);
        buttonGroup.add(radioButton1);

        radioButton2 = new JRadioButton("500*500");
        radioButton2.setBounds(10, 50, 100, 30);
        radioButton2.addChangeListener(this);
        add(radioButton2);
        buttonGroup.add(radioButton2);

        radioButton3 = new JRadioButton("600*600");
        radioButton3.setBounds(10, 90, 100, 30);
        radioButton3.addChangeListener(this);
        add(radioButton3);
        buttonGroup.add(radioButton3);

        setTitle("Pagina Tipo 9");
        setBounds(0, 0, 400, 400);
        super.pageDefault();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(radioButton1.isSelected()) {
            setSize(400, 400);
        } else if(radioButton2.isSelected()) {
            setSize(500, 500);
        } else if(radioButton3.isSelected()) {
            setSize(600, 600);
        }
    }
}
