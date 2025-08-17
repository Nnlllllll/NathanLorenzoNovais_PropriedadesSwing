import javax.swing.*;
import java.awt.*;

public class Exercicio6 extends JFrame {
    public Exercicio6() {
        setTitle("Exercício 6 - JSplitPane");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Painel esquerdo (vermelho)
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.RED);
        leftPanel.add(new JLabel("Esquerda"));

        // Painel direito (azul)
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.BLUE);
        rightPanel.add(new JLabel("Direita"));

        // Criar JSplitPane vertical
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
        splitPane.setDividerLocation(0.4); // 40% da largura, é um metodo que serve para dizer aonde esse divisor do SPlitPane vai começar
        //Com base no setSize ele vai multiplicar o width por 0.4
        add(splitPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Exercicio6();
    }
}