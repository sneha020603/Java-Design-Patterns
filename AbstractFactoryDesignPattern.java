package DesignPattern;

//product-I
abstract class Burger{
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

class BasicWheat extends Burger{

    @Override
    void prepare(){
        System.out.println("Preparing the classic Wheat basic burger with Wheatbuns, patty and sauses..");
    }
}

class StanderdWheat extends Burger{

    @Override
     void prepare(){
        System.out.println("Preparing the classic Standerd Wheat burger with Wheat buns, patty, veggies and sauses..");
    }
}

class PremiumWheat extends Burger{

    @Override
     void prepare(){
        System.out.println("Preparing the classic Wheat Premium burger with best Wheat buns, patty , veggies, cheeses and sauses..");
    }
}


//product-II
abstract class GarlicBread{
   abstract void prepare();
}

class BasicGarlicBread extends GarlicBread{

    @Override
    void prepare(){
        System.out.println("Preparing the classic basic GarlicBread with cheese and seasning...");
    }
}

class StanderdGarlicBread extends GarlicBread{

    @Override
     void prepare(){
        System.out.println("Preparing the classic Standerd GarlicBread with stuff veggies and sauses..");
    }
}

class PremiumGarlicBread extends GarlicBread{

    @Override
     void prepare(){
        System.out.println("Preparing the classic Premium GarlicBread with best buns, stuff veggies, cheese and sauses..");
    }
}

class BasicWheatGarlicBread extends GarlicBread{

    @Override
    void prepare(){
        System.out.println("Preparing the classic Wheat basic GarlicBread with Wheatbuns, and cheese..");
    }
}

class StanderdWheatGarlicBread extends GarlicBread{

    @Override
     void prepare(){
        System.out.println("Preparing the classic Standerd Wheat GarlicBread with Wheat buns, stuff veggies and sauses..");
    }
}

class PremiumWheatGarlicBread extends GarlicBread{

    @Override
     void prepare(){
        System.out.println("Preparing the classic Wheat Premium GarlicBread with best Wheat buns, stuff veggies, cheeses and sauses..");
    }
}

abstract class MyFactory{
  
    abstract Burger createBurger(String type);
    abstract GarlicBread createGarlicBread(String type);
}

class BurgerKing extends MyFactory{
    public Burger createBurger(String type){
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

    public GarlicBread createGarlicBread(String type){
        if(type.equals("basic")){
            return new BasicGarlicBread();
        }else if(type.equals("standard")){
            return new StanderdGarlicBread();
        }else if(type.equals("premium")){
            return new PremiumGarlicBread();
        }else{
             throw new IllegalArgumentException("Invalid burger type  :");
        }
    }
}

class BurgerSingh extends MyFactory{
    public Burger createBurger(String type){
        if(type.equals("basic")){
            return new BasicWheat();
        }else if(type.equals("standard")){
            return new StanderdWheat();
        }else if(type.equals("premium")){
            return new PremiumWheat();
        }else{
             throw new IllegalArgumentException("Invalid burger type  :");
        }
    }

    public GarlicBread createGarlicBread(String type){
        if(type.equals("basic")){
            return new BasicWheatGarlicBread();
        }else if(type.equals("standard")){
            return new StanderdWheatGarlicBread();
        }else if(type.equals("premium")){
            return new PremiumWheatGarlicBread();
        }else{
             throw new IllegalArgumentException("Invalid burger type  :");
        }
    }
}

public class AbstractFactoryDesignPattern {
    public static void main(String[] args) {

        System.out.println("By BurgerKing:");
       MyFactory factory1 = new BurgerKing();
       Burger getBurger1 = factory1.createBurger("standard");
       getBurger1.prepare();
       GarlicBread getGarlicBread1 =  factory1.createGarlicBread("basic");
       getGarlicBread1.prepare();

        System.out.println();

        System.out.println("By BurgerSingh:");
       MyFactory factory2 = new BurgerSingh();
       Burger getBurger2 = factory2.createBurger("standard");
       getBurger2.prepare();
       GarlicBread getGarlicBread2 =  factory2.createGarlicBread("basic");
       getGarlicBread2.prepare();

    }
    
}
