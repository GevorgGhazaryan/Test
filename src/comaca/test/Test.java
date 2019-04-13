package comaca.test;

public class Test {
    public static void main(String[] args) {
        IntegerWrapper Number1 = new IntegerWrapper(15);
        IntegerWrapper Number2 = new IntegerWrapper(300);
        IntegerWrapper.swap(Number1 , Number2);
        System.out.println(Number1.getNumber());
        System.out.println(Number2.getNumber());
    }
}
