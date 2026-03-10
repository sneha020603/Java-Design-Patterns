package DesignPattern;

abstract class Burger {
    abstract void prepare();
}

class Basic extends Burger{

    @Override
    void prepare(){
        System.out.println("Preparing the classic basic burger with buns, patty and sauses..");
    }
}

class Standerd extends Burger{

    @Override
     void prepare(){
        System.out.println("Preparing the classic Standerd burger with buns, patty, veggies and sauses..");
    }
}

class Premium extends Burger{

    @Override
     void prepare(){
        System.out.println("Preparing the classic Premium burger with best buns, patty , veggies, cheeses and sauses..");
    }
}

class BurgerFactory{

    public static Burger createBurger(String type){
        if(type.equals("basic")){
            return new Basic();
        }else if(type.equals("standard")){
            return new Standerd();
        }else if(type.equals("premium")){
            return new Premium();
        }else{
             throw new IllegalArgumentException("Invalid burger type  :");
        }
    }
}

//Simple Factory Design Pattern is a creational design pattern that provides an interface for creating objects in a super class, but allows subclasses to alter the type of objects that will be created. In this example, we have a BurgerFactory class that creates different types of burgers (Basic, Standerd, Premium) based on the input string. The client code can simply call the createBurger method with the desired type of burger, and the factory will handle the instantiation and preparation of the burger.

    public class SimpleFactoryDesignPattern {
    public static void main(String[] args) {
        Burger orderBurger1 = BurgerFactory.createBurger("premium");
        orderBurger1.prepare();

        Burger orderBurger2 = BurgerFactory.createBurger("basic");
        orderBurger2.prepare();

        
    }
}
