package com.test.example.constructorexample;

public class PointExample {

    public static void main(String[] args) {

        Point p = new Point(3,5);
        Point p2 = new Point(4,6);
        Point p3 = new Point(1,7);
        //p.x = 3;
        //p.y = 4;
        System.out.println("p.x =" + p.x + ", p.y =" + p.y);
        System.out.println("p2.x =" + p2.x + ", p2.y =" + p2.y);
        System.out.println("p3.x =" + p3.x + ", p3.y =" + p3.y);

        Car[] cars = new Car[4];
        cars[0] = new Car("Opel");
        cars[1] = new Car("Audi");
        cars[2] = new Car("BMW");
        cars[3] = new Car("Nissan");

        System.out.println();
        System.out.println("Car: ");
        System.out.println(cars[0].getName());
        System.out.println(cars[1].getName());
        System.out.println(cars[2].getName());
        System.out.println(cars[3].getName());
    }
}

class Point{
    Point(){
        System.out.println("Induce constructor default");
    }
    Point(int x, int y){
        System.out.println("Induce constructor with two parameters");
        this.x = x;
        this.y = y;
    }

    int x;
    int y;
}

class Car{
    Car(String name){
        this.name = name;
    }

    String name;

    String getName(){
        return name;
    }
}