public class Working extends AbstractState {
    public Working(Juca juca) {
        super(juca);
    }

    @Override
    public void enter() {
        System.out.println("Hora de ir para o trabalho!");
    }

    @Override
    public void execute() {
        System.out.println("Trabalhando...");

        juca.increaseHunger(2);
        juca.increaseFatigue(5);

        if (juca.getFatigue() > 50) {
            juca.changeState(new Sleeping(juca));
            System.out.println("Bateu um sono...");
        } else if (juca.getHunger() > 10) {
            juca.changeState(new Eating(juca));
            System.out.println("Bateu uma fome...");
        }
    }

    @Override
    public void leave() {
        System.out.println("Saindo do trabalho...");
    }
}
