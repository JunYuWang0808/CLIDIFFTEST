package main;

import core.A;
import core.B;
import core.C;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");
        A a = new A();
        int n1 = a.getANumber();
        int n2 = a.addTwoNumbers();
        int n3 = a.addThreeNumbers();
        int n4 = a.addFourNumbers();

        System.out.printf("The four numbers are %d, %d, %d, and %d.\n", n1, n2, n3, n4);

        B b = new B();
        C c = new C();

        String number1 = c.getStringNumber();
        String number2 = c.getStringNumber();
        int sum = b.add(number1, number2);

        System.out.printf("The sum is %d.\n", sum);
    }
}
