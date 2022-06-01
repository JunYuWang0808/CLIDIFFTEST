package core;

public class A {

    public int getANumber() {
        B b = new B();
        C c = new C();
        int number1 = c.getIntNumber();
        int number2 = 0;
        int sum = b.add(number1, number2);
        return sum;
    }

    public int addTwoNumbers() {
        C c = new C();
        B b = new B();
        int number1 = c.getIntNumber();
        int number2 = c.getIntNumber();
        int sum = b.add(number1, number2);
        return sum;
    }

    public int addThreeNumbers() {
        B b = new B();
        C c = new C();
        String number1 = c.getStringNumber();
        String number2 = c.getStringNumber();
        int sum1 = b.add(number1, number2);
        int number3 = c.getIntNumber();
        int number4 = 0;
        int sum2 = b.add(number3, number4);
        return sum1 + sum2;
    }

    public int addFourNumbers() {
        B b = new B();
        C c = new C();
        int number1 = c.getIntNumber();
        int number2 = c.getIntNumber();
        int sum1 = b.add(number1, number2);
        String number3 = c.getStringNumber();
        String number4 = c.getStringNumber();
        int sum2 = b.add(number3, number4);
        return sum1 + sum2;
    }
}
