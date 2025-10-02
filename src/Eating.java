public class Eating extends AbstractState<Juca> {
    public Eating(Juca character) {
        super(character);
    }

    @Override
    public void enter() {
        System.out.println("Comendo...");
    }

    @Override
    public void execute() {
        character.setHunger(character.getHunger() - 5);

        if (character.getHunger() <= 0) {
            character.setHunger(0);
            System.out.println("Ufa! Já estou cheio...");
            character.setState(new Working(character));
        }
    }

    @Override
    public void leave() {
        System.out.println("Terminei de comer...");
    }
}
