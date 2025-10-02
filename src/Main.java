import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> characters = new ArrayList<>();

        characters.add(new Juca());
        characters.add(new Bob());

        for (int i = 0; i <= 20; i++) {
            System.out.println("\n--- Ciclo " + i + " ---");
            for (Character c : characters) {
                c.update();
                c.printStats();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}