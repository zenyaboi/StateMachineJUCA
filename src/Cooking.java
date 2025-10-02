public class Cooking extends AbstractState<Bob> {
    public Cooking(Bob character) {
        super(character);
    }

    @Override
    public void enter() {
        System.out.println("Bob começou a cozinhar.");
    }

    @Override
    public void execute() {
        character.setTimer(character.getTimer() - 1);

        if (character.getTimer() <= 0) {
            character.setState(new Cleaning(character));
            character.setTimer(3);
        }
    }

    @Override
    public void leave() {
        System.out.println("Bob terminou de cozinhar.");
    }
}
