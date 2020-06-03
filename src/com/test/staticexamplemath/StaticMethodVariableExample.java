package com.test.staticexamplemath;

public class StaticMethodVariableExample {

    int a = 4;
    void test(){
        int b = 2 + a;
    }
    public static void main(String[] args) {
    /*
    Mathe test = new Mathe();
    double score = Mathe.add(10,   15);
        System.out.println(score);
        System.out.println(Mathe.PI);
    }
    */
        StaticMethodVariableExample sample = new StaticMethodVariableExample();
        sample.test();
        
        Customer customer1 = new Customer("Tomek");
        Customer customer2 = new Customer("Tom");
        Customer customer3 = new Customer("To");

        System.out.println(customer1.id);
        System.out.println(customer2.id);
        System.out.println(customer3.id);

        System.out.println(Customer.nextID);
    }
}

class Mathe{
    static final double PI = 3.14;
    static double add(double a, double b){
        return a + b;
    }
}

class Customer{
    Customer(String name){
        this.name = name;

        id = nextID;
        nextID ++;
    }

    String name;
    int id = 0;
    static int nextID = 1;


}
