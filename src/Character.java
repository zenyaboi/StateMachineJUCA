public interface Character {
    void update();
    void setState(States<?> state);
    void printStats();
}