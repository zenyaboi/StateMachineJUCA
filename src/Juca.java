public class Juca {
    private States currState;
    private int hunger;
    private int fatigue;

    public Juca() {
        this.currState = States.WORKING;
        this.hunger = 0;
        this.fatigue = 0;
        System.out.println("Hora de ir para o trabalho!");
    }

    public void tick() {
        // State Machine
        switch (currState) {
            case WORKING:
            {
                // Printing current state
                System.out.println("Trabalhando...");

                // State logic
                hunger += 2;
                fatigue += 5;

                // State Change
                if (fatigue > 50) {
                    currState = States.SLEEPING;
                    System.out.println("Bateu um sono...");
                } else if (hunger > 10) {
                    currState = States.EATING;
                    System.out.println("Bateu uma fome...");
                }

                break;
            }
            case EATING:
            {
                // Printing current state
                System.out.println("Comendo...");

                // State logic
                hunger -= 5;

                // State Change
                if (hunger <= 0) {
                    hunger = 0;
                    System.out.println("Ufa! Já estou cheio...");
                    currState = States.WORKING;
                    System.out.println("Hora de ir para o trabalho!");
                }

                break;
            }
            case SLEEPING:
            {
                // Printing current state
                System.out.println("Dormindo...");

                // State logic
                hunger += 1;
                fatigue -= 10;

                // State Change
                if (fatigue <= 0) {
                    fatigue = 0;
                    if (hunger > 10) {
                        currState = States.EATING;
                        System.out.println("Bateu uma fome...");
                    } else {
                        currState = States.WORKING;
                        System.out.println("Hora de ir para o trabalho!");
                    }
                }

                break;
            }
        }

        // Setting hunger and fatigue limit
        hunger = Math.max(hunger, 0);
        fatigue = Math.max(fatigue, 0);

        // Printing variables
        System.out.println("Fome: " + hunger);
        System.out.println("Cansaço: " + fatigue);

        System.out.println("-------------------");
    }

}
