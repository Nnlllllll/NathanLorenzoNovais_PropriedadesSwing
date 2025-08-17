import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class Exercicio4 extends JFrame {
    public Exercicio4() {
        setTitle("Exercício 4 - JFormattedTextField");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        // Label para o campo
        add(new JLabel("Data de Nascimento:"));

        try {
            // Definir máscara "dd/mm/aaaa" com placeholder '_'
            MaskFormatter formatter = new MaskFormatter("##/##/####");//essa formatacao usa # para sinalizar que deve ser preenchido com um numero, e / como um caractere fixo 
            formatter.setPlaceholderCharacter('_');
            JFormattedTextField dateField = new JFormattedTextField(formatter);
            add(dateField);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Erro na formatação!");
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new Exercicio4();
    }
}