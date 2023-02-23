import javax.swing.*;
public class Page3 extends MotherPage{
    JTextArea textArea;
    JLabel label;
    JTextField textField;
    JScrollPane scrollPane;

    public Page3() {
        label = new JLabel("Titulo del articulo:");
        label.setBounds(10, 10, 100, 30);
        add(label);

        textField = new JTextField();
        textField.setBounds(120, 10, 360, 30);
        add(textField);

        textArea = new JTextArea();
        //pone la area de texto dentro del ScrollPane
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10,50, 470, 400);
        add(scrollPane);

        setTitle("Pagina Tipo 3");
        setBounds(0, 0, 500, 500);
        super.pageDefault();
    }
}
