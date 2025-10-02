public interface States<C extends Character> {
    C getCharacter();
    void enter();
    void execute();
    void leave();
}
