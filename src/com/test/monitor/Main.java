package com.test.monitor;

public class Main {

    static int a = 5;
    static void test(){
        System.out.println("aa");
    }

    public static void main(String[] args) {

        Main a = new Main();
        a.test();

        Monitor samsung = new Monitor();
        Monitor sony = new Monitor();

        samsung.height = 45;
        samsung.name = "Samsung";
        System.out.println(samsung.name);
        samsung.turnOn();
        samsung.turnOff();
        System.out.println("Samsung height is: "+ samsung.height);

        sony.name = "Sony";
        sony.width = 32;
        System.out.println(sony.name);
        sony.turnOn();
        sony.turnOff();
        System.out.println("Sony width is: " + sony.width);

        String name2 = "Tomek";
        System.out.println(name2.charAt(0));


    }
}

class Monitor {

    int height;
    int width;
    String name;

    void turnOn(){
        System.out.println("Monitor is turn on");
    }

    void turnOff(){
        System.out.println("Monitor is turn off");
    }
}