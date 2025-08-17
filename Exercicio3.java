import javax.swing.*;
import java.awt.*;

public class Exercicio3 extends JFrame {
    public Exercicio3() {
        setTitle("Exercício 3 - JScrollPane");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea(10, 30); // 10 linhas, 30 colunas
        textArea.setText("Java Swing é usado para interfaces gráficas. ".repeat(50));
        textArea.setBackground(Color.LIGHT_GRAY);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 12)); // Fonte monoespaçada para precisão
        textArea.setLineWrap(true); // Ativa a quebra de linha automática
        textArea.setWrapStyleWord(true); // Quebra em palavras inteiras

        JScrollPane scrollPane = new JScrollPane(textArea);//Permite que o usuario visualize todo o conteudo da pagina
        add(scrollPane, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Executa a criação da interface no Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> new Exercicio3());
    }
}