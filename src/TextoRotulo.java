import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextoRotulo extends JFrame{
    private JTextField caixadetextotitulo;
    private JButton botaoconfirmar;
    private String titulodajanela;

    public TextoRotulo(){
        setSize(400,300);
        setLocationRelativeTo(null);
        setLayout(null);

        caixadetextotitulo = new JTextField();
        caixadetextotitulo.setBounds(85,70,200,50);
        add(caixadetextotitulo);

        botaoconfirmar = new JButton("Confirmar");
        botaoconfirmar.setBounds(135,120,100,50);
        add(botaoconfirmar);

        botaoconfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                titulodajanela = caixadetextotitulo.getText();
                setTitle(titulodajanela);
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main (String[] args){
        new TextoRotulo();
    }
}
