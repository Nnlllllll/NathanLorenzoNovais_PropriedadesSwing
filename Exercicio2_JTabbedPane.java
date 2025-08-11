import javax.swing.*;
import java.awt.*;
public class Exercicio2_JTabbedPane {
    public static void main(String[] args) {
        // Criação do frame
        JFrame frame = new JFrame("Exercício 2");
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 0,250));
        painel.setPreferredSize(new Dimension(1000,600));
        painel.setBackground(Color.GREEN);  // Define cor de fundo
        painel.setBorder(BorderFactory.createTitledBorder("Painel de Controle")); // Borda com título
        // Botão
        JButton botao = new JButton("Clique Aqui");
        
        // Adicionando componentes ao frame
        frame.add(painel);
        painel.add(botao);
        
        // Exibir a janela
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}