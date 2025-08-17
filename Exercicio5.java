import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio5 extends JFrame {
    private JLabel resultadoLabel;

    public Exercicio5() {
        setTitle("Exercício 5 - JRadioButton");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        // Criar botões de rádio
        JRadioButton masculino = new JRadioButton("Masculino");
        JRadioButton feminino = new JRadioButton("Feminino");
        JRadioButton outro = new JRadioButton("Outro");

        // Agrupar botões
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(masculino);
        grupo.add(feminino);
        grupo.add(outro);

        // Botão para confirmar seleção
        JButton botao = new JButton("Exibir Seleção");
        resultadoLabel = new JLabel("Nenhum selecionado.");

        // Adicionar componentes ao JFrame
        add(masculino);
        add(feminino);
        add(outro);
        add(botao);
        add(resultadoLabel);

        // Configurar ActionListener
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (masculino.isSelected()) {
                    resultadoLabel.setText("Masculino selecionado!");
                } else if (feminino.isSelected()) {
                    resultadoLabel.setText("Feminino selecionado!");
                } else if (outro.isSelected()) {
                    resultadoLabel.setText("Outro selecionado!");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Exercicio5();
    }
}