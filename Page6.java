import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Page6 extends MotherPage implements ActionListener {
    private JMenuBar menuBar;
    private JMenu menu, menu1, menu2;
    private JMenuItem menuItem, menuItem2, menuItem3, menuItem4, menuItem5, menuItem6;

    public Page6() {
        //asi se crea la barra
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        //crea el menu
        menu = new JMenu("Opciones");
        menuBar.add(menu);

        //crea el menu dentro de otro menu
        menu1 = new JMenu("Colores de Fondo");
        menu.add(menu1);

        menuItem = new JMenuItem("Rojo");
        menuItem.addActionListener(this);
        menu1.add(menuItem);

        menuItem2 = new JMenuItem("Verde");
        menuItem2.addActionListener(this);
        menu1.add(menuItem2);

        menuItem3 = new JMenuItem("Azul");
        menuItem3.addActionListener(this);
        menu1.add(menuItem3);

        menu2 = new JMenu("Tamaño de pagina");
        menu.add(menu2);

        menuItem4 = new JMenuItem("400*400");
        menuItem4.addActionListener(this);
        menu2.add(menuItem4);

        menuItem5 = new JMenuItem("600*600");
        menuItem5.addActionListener(this);
        menu2.add(menuItem5);

        menuItem6 = new JMenuItem("800*800");
        menuItem6.addActionListener(this);
        menu2.add(menuItem6);

        setTitle("Pagina tipo 6");
        setBounds(0, 0, 400, 400);
        super.pageDefault();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //crea un contenedor
        Container fondo = this.getContentPane();

        if (e.getSource() == menuItem) {
            fondo.setBackground(new Color(255, 0, 0));

        }else if (e.getSource() == menuItem2) {
            fondo.setBackground(new Color(0, 255, 0));
            
        }else if (e.getSource() == menuItem3) {
            fondo.setBackground(new Color(0, 0, 255));

        }else if (e.getSource() == menuItem4) {
            setSize( 400, 400);

        }else if (e.getSource() == menuItem5) {
            setSize( 600, 600);
            
        }else if (e.getSource() == menuItem6) {
            setSize( 800, 800);
            
        }
    }
}
