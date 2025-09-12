public abstract class AbstractState implements States {
    protected Juca juca;

    public AbstractState(Juca juca) {
        this.juca = juca;
    }

    @Override
    public void enter() { }

    @Override
    public void leave() { }
}
