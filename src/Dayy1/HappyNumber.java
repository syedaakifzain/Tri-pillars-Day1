//Happy Number or not
package Dayy1;
import java.util.*;
public class HappyNumber {
    public static boolean isHappy(int n) {
        while (n != 1 && n != 4) {
             int sum=0;
             while(n>0){
                 int d=n%10;
                 sum=sum+(int)Math.pow(d,2);
                 n=n/10;
             }
             n=sum;
        }
        return n==1;
    }



    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a number");
       int n=sc.nextInt();
       if(isHappy(n)){
           System.out.println("it's a happy number");
       }
       else{
           System.out.println("not a happy number,its sad number");
       }
    }
}
