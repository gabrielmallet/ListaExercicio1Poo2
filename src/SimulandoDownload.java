import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class SimulandoDownload extends JFrame{
    private JButton botao;
    private JProgressBar barraprogresso;
    private Temporizador temporizador;

    public SimulandoDownload(){
        setSize(500,300);
        setTitle("Simulando Processo de Download");
        setLocationRelativeTo(null);
        setLayout(null);

        barraprogresso = new JProgressBar(0,100);
        barraprogresso.setBounds(125,40,250,50);
        barraprogresso.setValue(0);
        barraprogresso.setStringPainted(true);
        //barraprogresso.setForeground(Color.green);
        add(barraprogresso);

        botao = new JButton("Iniciar Download");
        botao.setBounds(170,200,150,50);
        add(botao);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(temporizador != null && temporizador.getState() == SwingWorker.StateValue.STARTED){
                    JOptionPane.showMessageDialog(null,"O Download já foi iniciado!!!");
                    temporizador.execute();

                }else{
                    temporizador = new Temporizador();
                    temporizador.execute();
                }
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public class Temporizador extends SwingWorker<Void,Integer>{
        @Override
        protected Void doInBackground() throws Exception {
            for(int i = 0; i <= 100; i++) {
                Thread. sleep((long)(Math. random() * 1000));
                publish(i);
            }
            return null;
        }

        @Override
        protected void process(List<Integer> chunks) {
            int progressoAtual = chunks.get(chunks.size() -1);
            barraprogresso.setValue(progressoAtual);
        }

        @Override
        protected void done() {
            JOptionPane.showMessageDialog(null,"Download Concluido!");
        }
    }

    public static void main(String[] args){
        new SimulandoDownload();
    }
}
