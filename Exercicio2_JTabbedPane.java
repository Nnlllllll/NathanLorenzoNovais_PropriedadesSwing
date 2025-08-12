import javax.swing.*;
import java.awt.*;
public class Exercicio2_JTabbedPane {
    public static void main(String[] args) {
        // Criação do frame
        JFrame frame = new JFrame("Exercício 2");
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel painel = new JPanel();//Adiciona o Painel 1
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 0,250));//Centraliza
        painel.setPreferredSize(new Dimension(1000,600));//Dimensiona
        painel.add(new JLabel("Bem vindo às configurações"));//adiciona e importa o JLabel no painel 1
        tabbedPane.addTab("Configurações", painel);//Adiciona o painel ao conjunto de guias

        JPanel painel2 = new JPanel();//Adiciona o Painel 2
        painel2.setLayout(new FlowLayout(FlowLayout.CENTER, 0,250));//Centraliza
        painel2.setPreferredSize(new Dimension(1000,600));//Dimensiona
        painel2.setBackground(Color.BLUE);//Muda a cor do painel para Azul
        JTextField textField = new JTextField("Digite seu nome aqui...");
        textField.setBounds(50, 50, 200, 30); // Definindo posição e tamanho
        painel2.add(textField);//importa a variavel de campo de  texto
        tabbedPane.addTab("Perfil", painel2);//Importa o painel 2
       
        JPanel painel3 = new JPanel();//Adiciona o Painel 3
        painel3.setLayout(new FlowLayout(FlowLayout.CENTER, 0,250));//Centraliza
        painel3.setPreferredSize(new Dimension(1000,600));//Dimensiona
        JTextArea texto = new JTextArea("Digite suas dúvidas aqui");//Adiciona a variavel de texto
        painel3.add(texto);//Importa a variavel de texto
        tabbedPane.addTab("Ajuda", painel3);//Importa o painel 3

        // Adicionando componentes ao frame
        frame.add(tabbedPane);
        
        // Exibir a janela
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
