package Dayy1;

public class ArmStrong {
    public static void main(String[] args) {
        int n=153;
        int sum=0;
        int og=n;
        int count=0;
        while(og>0){
            count++;
            og=og/10;
        }
        og=n;
        while(og>0){
            int digit=og%10;
            sum = sum+(int)Math.pow(digit,count);
            og=og/10;

        }
        if(sum==n){
            System.out.println("armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }
}
