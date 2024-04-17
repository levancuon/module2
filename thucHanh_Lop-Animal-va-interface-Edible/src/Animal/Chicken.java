package Animal;

import Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return " ò ó o";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }

}

