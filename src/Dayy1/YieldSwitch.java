package Dayy1;

import java.util.Scanner;

public class YieldSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        ch = Character.toUpperCase(ch);
        String color = switch(ch){
            case 'v'->{
                yield "Violet";
            }
            case 'I'->{
                yield "Indigo";
            }
            case 'B'->{
                yield "Blue";
            }
            default -> {
                yield "Invalid Input";
            }
        };
        System.out.println("color is:"+color);
    }
}
