import javax.swing.*;
import java.awt.event.*;
public class Page4 extends MotherPage implements ActionListener {
    JLabel label;
    JTextField textField;
    JButton button;
    JTextArea textArea;
    JScrollPane scrollPane;
    String text = "";

    public Page4() {
        
        label = new JLabel("Chat");
        label.setBounds(10, 0, 370, 30);
        add(label);

        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 30, 370, 380);
        add(scrollPane);

        textField = new JTextField();
        textField.setBounds(10, 420, 260, 30);
        add(textField);

        button = new JButton("enviar");
        button.setBounds(280, 420, 100, 30);
        add(button);
        button.addActionListener(this);

        setTitle("Pagina Tipo 4");
        setBounds(0, 0, 400, 500);
        super.pageDefault();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            text += textField.getText() + "\n";
            textArea.setText(text);
            textField.setText("");
        }
    }
    
}
