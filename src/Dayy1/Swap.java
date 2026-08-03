package Dayy1;

public class Swap {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        System.out.println("before swapping"+a+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after swapping"+a+b);
    }
}
