class Cucitura extends Thread {
    @Override
    public void run() {
        System.out.println("Inizio a cucire le borse...");
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finito di cucire le borse.");
    }
}