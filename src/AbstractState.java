public abstract class AbstractState<C extends Character> implements States<C> {
    protected final C character;

    public AbstractState(C character) {
        this.character = character;
    }

    @Override
    public C getCharacter() {
        return character;
    }

    @Override
    public void enter() {}

    @Override
    public void leave() {}
}
