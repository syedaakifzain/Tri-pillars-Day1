package Dayy1;
import java.util.*;
public class Vibgyor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        ch=Character.toUpperCase(ch);
        String color;
        switch (ch){
            case 'V' : color="Violet";
                       break;
            case 'I' : color="Indigo";
                        break;
            case 'B' : color="Indigo";
                        break;
            default: color="invalid input";
        }
    }
}
