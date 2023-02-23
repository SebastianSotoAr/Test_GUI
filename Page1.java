import javax.swing.*;
import java.awt.event.*;
public class Page1 extends MotherPage implements ActionListener{
    private JLabel label, label1;
    private JButton button, button1, button2, button3;

    public Page1(){
        //es una etiqueta 
        label = new JLabel("etiqueta 1");
        //limites y uicacion de la etiqueta (Bounds : Limites)
        label.setBounds(10, 0, 100, 30);
        //añade la etiqueta a la interfaz
        add(label);

        label1 = new JLabel("etiqueta 2");
        label1.setBounds(10, 20, 100, 30);
        add(label1);

        //es un boton con el texto "cerrar"
        button = new JButton("Cerrar");
        button.setBounds(270, 330, 100, 20);
        add(button);
        // se agrega sensor de acciones
        button.addActionListener(this);

        //selecion de tipo de empleado
        button1 = new JButton("Empleado tipo 1");
        button1.setBounds(10, 50, 150, 20);
        add(button1);
        button1.addActionListener(this);

        button2 = new JButton("Empleado tipo 2");
        button2.setBounds(10, 80, 150, 20);
        add(button2);
        button2.addActionListener(this);

        button3 = new JButton("Empleado tipo 3");
        button3.setBounds(10, 110, 150, 20);
        add(button3);
        button3.addActionListener(this);

        //titulo de la pagina
        setTitle("Pagina Tipo 1");
        setBounds(0, 0, 400, 400);
        super.pageDefault();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //realiza una accion dependeiendo del boton que se preciono (Source : Origen)
        if(e.getSource() == button){
            System.exit(0);

        }else if(e.getSource() == button1) {
            setTitle("Empleado tipo 1");

        }else if(e.getSource() == button2) {      
            setTitle("Empleado tipo 2");

        }else if(e.getSource() == button3) {      
            setTitle("Empleado tipo 3");
        }
    }
}
