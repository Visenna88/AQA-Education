package part4task1;

public class Dog {
    String name;
    int weight;
    int age;
    String color;
    String breed;
    String food;
    int energy = 5;

    public void walk (){
        while (energy > 0) {
            System.out.println("We are walking now");
            energy--;
        }
        System.out.println("I am tired");
    }
    public void bark (){
        System.out.println("I want to walk");
    }

    public void feed () {
        this.food = food;
    }

}