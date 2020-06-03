package com.test.example.methodexample;

public class Main {
    public static void main(String[] args) {

        Test test = new Test();
        test.unSubscribe("Tomek", "Sochacki");
        Test test1 = new Test();
        test1.unSubscribe("Tom", "Soch");

        int score = test.add(10, 20);
        System.out.println(score);

        double score2 = test.divide(15,0);
        System.out.println(score2);

    }
}

class Test{

    void unSubscribe(String name, String secondName) {
        System.out.println("Name: " + name + '\n' + "Second name: " + secondName + '\n');

    }

    int add(int x, int y){
       return x + y;
    }

    double divide(double a,double b){
        if (b==0)
            return 0;

        System.out.println("dasdadasdsa");
        return a/b;
    }

}
