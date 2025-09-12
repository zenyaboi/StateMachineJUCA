public class Sleeping extends AbstractState {
    public Sleeping(Juca juca) {
        super(juca);
    }

    @Override
    public void enter() {
        System.out.println("Dormindo...");
    }

    @Override
    public void execute() {
        juca.increaseHunger(1);
        juca.decreaseFatigue(10);

        if (juca.getFatigue() <= 0) {
            juca.setFatigue(0);
            if (juca.getHunger() > 10) {
                juca.changeState(new Eating(juca));
                System.out.println("Bateu uma fome...");
            } else {
                juca.changeState(new Working(juca));
            }
        }
    }

    @Override
    public void leave() {
        System.out.println("Acordei, hora de trabalhar!");
    }
}
