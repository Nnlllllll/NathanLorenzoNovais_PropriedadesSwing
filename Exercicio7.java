import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Exercicio7 extends JFrame {
    private JLabel resultadoLabel;

    public Exercicio7() {
        setTitle("Exercício 7 - JComboBox");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        // Criar JComboBox com países
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Brasil");
        comboBox.addItem("Argentina");
        comboBox.addItem("Chile");
        comboBox.setSelectedItem("Argentina"); // Seleção padrão

        resultadoLabel = new JLabel("Selecionado: Argentina");

        // Configurar ItemListener
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    resultadoLabel.setText("Selecionado: " + comboBox.getSelectedItem());
                }
            }
        });

        add(comboBox);
        add(resultadoLabel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Exercicio7();
    }
}