public class MultiplasThreads extends Thread{
    private int threadId;

    public MultiplasThreads(int threadId) {
        this.threadId = threadId;
    }

    @Override
    public void run() {
    for (int i = 1; i <= 10; i++) {
        System.out.println("Thread " + threadId + " - Contagem: " + i);
            try {
                Thread.sleep(500); // Pequeno atraso de 500ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
    MultiplasThreads thread = new MultiplasThreads(i);
    thread.start(); // Inicia a thread
        }
    }
}