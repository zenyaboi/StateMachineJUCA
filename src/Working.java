public class Working extends AbstractState<Juca> {
    public Working(Juca character) {
        super(character);
    }

    @Override
    public void enter() {
        System.out.println("Juca começou a trabalhar.");
    }

    @Override
    public void execute() {
        character.setFatigue(character.getFatigue() + 2);
        character.setHunger(character.getHunger() + 1);

        if (character.getHunger() >= 10) {
            character.setState(new Eating(character));
        } else if (character.getFatigue() >= 10) {
            character.setState(new Sleeping(character));
        }
    }

    @Override
    public void leave() {
        System.out.println("Juca parou de trabalhar.");
    }
}