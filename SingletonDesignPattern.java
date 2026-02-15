package DesignPattern;

class Singleton{
    private static Singleton intance = null;

    private Singleton(){
        System.out.println("A intance of class Singleton is created..");
    }

    public static Singleton getIntance(){
        if( intance == null){
            intance = new Singleton();
        }

        return intance;
    }
}

public class SingletonDesignPattern {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getIntance();
        Singleton obj2 = Singleton.getIntance();

        System.out.print(obj1 == obj2);
    }
}
