// To swap two numbers without a third variable
import java.util.*;
public class SwapWithoutaVariable{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping,The numbers are "+a+" "+b);
      }
   }
}
