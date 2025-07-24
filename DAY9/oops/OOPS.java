import java.util.*;

public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("Red");
        System.out.println(p1.getColor());
        p1.setTip(7);
        System.out.println(p1.getTip());
        BankAcc myAcc = new BankAcc();
        myAcc.username = "Deekshitha";
        myAcc.setPassword("1109");


        Fish shark = new Fish();
        shark.eat();

        Dog rocky = new Dog();
        // rocky.eat();
        rocky.legs = 4;
        System.out.println( " Rocky has no.of legs : " + rocky.legs);

    }

}

// Base class 
    class Animal {
        String color;
        void eat() {
            System.out.println("eats");
        }
        void breathe(){
            System.out.println("breathes");
        }
    }

    class Mammal extends Animal {
        int legs;
    }


    class Dog extends Mammal {
        String breed;
    }

    // derived class 
    class Fish extends Animal {
        int fins;
        void swim(){
            System.out.println("swims in water");
        }
    }




class Pen { 
   private String color;
   private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }
    

    void setColor(String newColor) {
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }

}



// Example  
class BankAcc {
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    
    }
}