public class Processo {
    public static void main(String[] args) {
        System.out.println("Inizio processo di produzione delle borse...\n");

        // Creazione dei due thread (fasi del processo)
        Taglio fase1 = new Taglio(); // Taglio della pelle
        Cucitura fase2 = new Cucitura(); // Cucitura delle borse

        // Avvio dei thread in parallelo
        fase1.start();
        fase2.start();

        // Il "padre" attende che i due thread finiscano
        try {
            fase1.join();
            fase2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nTutte le fasi di produzione sono terminate!");
    }
}
