
import Animal.Animal;
import Animal.Chicken;
import Animal.Tiger;
import Fruit.Apple;
import Fruit.Fruits;
import Fruit.Orange;
import edible.Edible;

public class Main {
    public static void main(String[] args) {
    Animal[] animals = new Animal[2];
    animals[0]= new Chicken();
    animals[1]= new Tiger();
    for (Animal item:animals){
        System.out.println(item.makeSound());
        if (item instanceof Chicken){
            Chicken chicken=(Chicken) item;
            System.out.println(chicken.howToEat());
        }
    }


    Fruits[] fruits=new Fruits[2];
    fruits[0] = new Apple();
    fruits[1] = new Orange();
    for (Fruits item:fruits){
        System.out.println(item.howToEat());
    }

    }
}