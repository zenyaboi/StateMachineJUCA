public class Sleeping extends AbstractState<Juca> {
    public Sleeping(Juca character) {
        super(character);
    }

    @Override
    public void enter() {
        System.out.println("Dormindo...");
    }

    @Override
    public void execute() {
        character.setHunger(character.getHunger() + 1);
        character.setFatigue(character.getFatigue() - 10);

        if (character.getFatigue() <= 0) {
            character.setFatigue(0);
            if (character.getHunger() > 10) {
                character.setState(new Eating(character));
                System.out.println("Bateu uma fome...");
            } else {
                character.setState(new Working(character));
            }
        }
    }

    @Override
    public void leave() {
        System.out.println("Acordei, hora de trabalhar!");
    }
}
