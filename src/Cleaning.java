public class Cleaning extends AbstractState<Bob> {
    public Cleaning(Bob character) {
        super(character);
    }

    @Override
    public void enter() {
        System.out.println("Bob começou a limpar.");
    }

    @Override
    public void execute() {
        character.setTimer(character.getTimer() - 1);

        if (character.getTimer() <= 0) {
            character.setState(new Cooking(character));
            character.setTimer(4);
        }
    }

    @Override
    public void leave() {
        System.out.println("Bob terminou de limpar.");
    }
}
