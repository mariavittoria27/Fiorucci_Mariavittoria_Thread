class Taglio extends Thread {
    @Override
    public void run() {
        System.out.println("Inizio a tagliare la pelle...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finito di tagliare la pelle.");
    }
}