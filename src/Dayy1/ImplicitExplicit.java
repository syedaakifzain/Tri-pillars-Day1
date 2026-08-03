//type casting
package Dayy1;

public class ImplicitExplicit {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        double d=a;//implicit
        System.out.println(d);
        int b=(int)d;//explicit
        System.out.println(b);


        char ch='A';
        int i=ch;
        System.out.println(ch);
        System.out.println(i);
    }
}
