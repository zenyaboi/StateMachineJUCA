public class Eating extends AbstractState {
    public Eating(Juca juca) {
        super(juca);
    }

    @Override
    public void enter() {
        System.out.println("Comendo...");
    }

    @Override
    public void execute() {
        juca.decreaseHunger(5);

        if (juca.getHunger() <= 0) {
            juca.setHunger(0);
            System.out.println("Ufa! Já estou cheio...");
            juca.changeState(new Working(juca));
        }
    }

    @Override
    public void leave() {
        System.out.println("Terminei de comer...");
    }
}
