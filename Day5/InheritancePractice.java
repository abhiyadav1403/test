class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name ;
        this.age = age;
        System.out.println("Animal conructor called");

    }
    public void makeSound(){
        System.out.println(name + " makes some sound");

    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public void displayInfo(){
        System.out.println("Name:" + name + ", Age:" + 
        age + "years");

    }
}


class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
        System.out.println("Dog constructor called ");
    }

    @Override
    public void makeSound(){
        System.out.println(name + "says: Woof! Woof!");
    }

    public void wagTail(){
        System.out.println(name + "is wagging its tail");
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Breed:" + breed);
    }

}

class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color){
        super(name, age);
        this.color = color;
        System.out.println("Cat constructor called");
    }
    @Override
    public void makeSound(){
        System.out.println(name  + "says: Meow! Meow!");
    }
    public void purr(){
        System.out.println(name + "is purring contentedly");

    }

    @Override 
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Color:" + color);
    }
}



public class InheritancePractice {
    public static void main(String[] args){
        System.out.println("== Creating Animal Objects ===");
        Dog myDog  = new Dog("Buddy", 3, "Golden Retriever");
        Cat myCat = new Cat("Whiskers", 2, "Orange");
        System.out.println("\n -- Dog Behavior --");
        myDog.displayInfo();
        myDog.makeSound();
        myDog.sleep();
        myDog.wagTail();
        

        System.out.println("\n -- Cat Behavior --");
        myCat.displayInfo();
        myCat.makeSound();
        myCat.sleep();
        myCat.purr();

        System.out.println("\n -- Polymorphism is Action");
        Animal animal1 = new Dog("Rex", 3, "German Shepherd");
        Animal animal2 = new Cat("Fluffy", 1, "White");
        animal1.makeSound();
        animal2.makeSound();




    }
}
