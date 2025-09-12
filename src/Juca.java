public class Juca {
    private States currentState;
    private int hunger;
    private int fatigue;

    public Juca() {
        // Setting variables
        this.hunger = 0;
        this.fatigue = 0;

        changeState(new Working(this));
    }

    public void doAction() {
        currentState.execute();
        printStatus();
    }

    public void changeState(States newState) {
        if (currentState != null) {
            currentState.leave();
        }
        currentState = newState;
        currentState.enter();
    }

    // Getters & Setters
    public int getHunger() { return hunger; }
    public int getFatigue() { return fatigue; }

    public void setHunger(int hunger) { this.hunger = Math.max(hunger, 0); }
    public void setFatigue(int fatigue) { this.fatigue = Math.max(fatigue, 0); }

    public void increaseHunger(int value) { hunger = Math.max(0, hunger + value); }
    public void decreaseHunger(int value) { hunger = Math.max(0, hunger - value); }

    public void increaseFatigue(int value) { fatigue = Math.max(0, fatigue + value); }
    public void decreaseFatigue(int value) { fatigue = Math.max(0, fatigue - value); }

    private void printStatus() {
        System.out.println("Fome: " + hunger);
        System.out.println("Cansaço: " + fatigue);
        System.out.println("-------------------");
    }
}
