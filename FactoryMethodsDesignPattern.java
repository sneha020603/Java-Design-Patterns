package DesignPattern;

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

abstract class BurgerFactory{
    abstract Burger createBurger(String type);
}

class BurgerKing extends BurgerFactory{
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
}

class BurgerSingh extends BurgerFactory{
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
}

public class FactoryMethodsDesignPattern {

      public static void main(String[] args) {

        BurgerFactory myFactory = new BurgerKing();
        Burger myOrder = myFactory.createBurger("basic");
        myOrder.prepare();

        System.out.println();

        BurgerFactory wheatFactory = new BurgerSingh();
        Burger wheatOrder = wheatFactory.createBurger("premium");
        wheatOrder.prepare();
    }
    
}
