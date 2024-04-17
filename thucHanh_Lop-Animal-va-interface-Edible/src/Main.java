import Animal.Animal;
import Animal.Chicken;
import Animal.Tiger;

public class Main {
    public static void main(String[] args) {
    Animal[] animals = new Animal[2];
    animals[0]=new Chicken();
    animals[1]=new Tiger();
    for (Animal animal:animals){
        System.out.println(animal.makeSound());
    }
    }
}