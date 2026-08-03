//palindrome
package Dayy1;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value for n");
        int n=sc.nextInt();
        int og=n;
        int rev=0;
        int sum=0;
        while(n>0){
            int digit = n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(rev==og){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }


    }
}
