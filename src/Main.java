public class Main {
    public static void main(String[] args) {
        Juca j = new Juca();

        for (int i = 0; i < 30; i++) {
            System.out.println("Tick: " + (i + 1));
            j.tick();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}