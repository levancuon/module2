package Animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {


    @Override
    public String makeSound() {
        return "cuc tac cuc tac";
    }

    @Override
    public String howToEat() {
        return "Chien mam";
    }
}
