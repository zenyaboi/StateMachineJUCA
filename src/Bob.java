public class Bob implements Character {
    private int timer;
    private States<Bob> state;

    public Bob() {
        this.timer = 5;
        this.state = new Cooking(this);
    }

    @Override
    public void update() {
        state.execute();
    }

    @Override
    public void setState(States<?> newState) {
        state.leave();
        this.state = (States<Bob>) newState;
        state.enter();
    }

    @Override
    public void printStats() {
        System.out.println("Bob -> Timer: " + timer);
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }
}
