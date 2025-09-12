public class Main {
    public static void main(String[] args) {
        Juca juca = new Juca();

        for (int i = 0; i < 30; i++) {
            System.out.println("Tick: " + (i + 1));
            juca.doAction();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
