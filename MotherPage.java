import javax.swing.*;
public class MotherPage extends JFrame{
    public void pageDefault() {
        //permite agragar componentes o diseñar la pagina (Layout : diseño)
        setLayout(null);
        //hace visible la ventana, recarga la pagina (para cuando no se carga bien la pagina)
        setVisible(true);
        //obliga a que la ventana aparesca en el centro de la pantalla
        setLocationRelativeTo(null);
        //permite que el usuario modifique el tamaño de la ventana
        setResizable(false);
    }
}
