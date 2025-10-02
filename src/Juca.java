public class Juca implements Character {
    private int hunger;
    private int fatigue;
    private States<Juca> state;

    public Juca() {
        this.hunger = 0;
        this.fatigue = 0;
        this.state = new Working(this);
    }

    @Override
    public void update() {
        state.execute();
    }

    @Override
    public void setState(States<?> newState) {
        state.leave();
        this.state = (States<Juca>) newState;
        state.enter();
    }

    @Override
    public void printStats() {
        System.out.println("Juca -> Fome: " + hunger + " | Cansaço: " + fatigue);
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getFatigue() {
        return fatigue;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }
}
