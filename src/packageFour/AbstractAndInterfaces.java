package packageFour;

abstract class Parent { // Whtsapp
    String mother;
    String father;

    public Parent(String mother, String father) {
        this.father = father;
        this.mother = mother;
    }

    abstract public void display(); // Adding document

    public void greeting() {
        System.out.println("Good Morning" + this.mother + " and " + this.father);
    }
}

abstract class Child extends Parent { // Feature - 1
    String childName;
    public Child(String childName) {
        super("Eve", "Adam");
        this.childName = childName;
    }

//    abstract public void display();

    public void printChild() {
        System.out.println(this.childName);
    }
}

class ToBorn extends Child { // Feature - 2
    String nameToBorn;
    public ToBorn(String nameToBorn) {
        super("Mohammed");
        this.nameToBorn = nameToBorn;
    }

    //    abstract public void display();
    public void display() {
        System.out.println(this.father + this.mother + this.childName + this.nameToBorn);
    }
}

interface Mammals {
    public void printMammals();
    public void typesOfMammals();
}

interface Humans extends Mammals {
    public void printHumanCategories();
//    public Humans() {
//        System.out.println("Default constructor invoked!");
//    }
////    public void printMammals();
//    public void printMammals() {
//        System.out.println("printing Mammals!");
//    }
////    public void typesOfMammals();
//    public void typesOfMammals() {
//        System.out.println("Printing Types of Mammals!");
//    }
}

class Male implements Humans {
    public void printMammals(){

    }
    public void typesOfMammals(){

    }
    public void printHumanCategories(){

    }
}

public class AbstractAndInterfaces {

    public static void main(String[] args) {
//        Parent parent = new Parent("Eve", "Adam");
        Parent obj = new ToBorn("Moses");

//        Mammals obj1 = new Mammals(); // Cant create object for interface
        Mammals male = new Male(); // Polymorphism
        male.printMammals();
        male.typesOfMammals();

    }
}
