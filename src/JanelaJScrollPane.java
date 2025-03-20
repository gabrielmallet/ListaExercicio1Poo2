import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaJScrollPane extends JFrame{
    private JScrollPane jscrollpane;
    private JTextArea jtextarea;
    private JButton botao;

    public JanelaJScrollPane(){
        setSize(500,500);
        setLocationRelativeTo(null);
        setTitle("Janela JScrollPane");
        setLayout(new FlowLayout());

        jtextarea = new JTextArea(20,30);
        jscrollpane = new JScrollPane(jtextarea);
        jscrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jscrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        getContentPane().add(jscrollpane);

        botao = new JButton("Iniciar Processo");
        add(botao);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtextarea.append("Processo Iniciado...\n");
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        new JanelaJScrollPane();
    }
}
