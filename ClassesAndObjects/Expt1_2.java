package ClassesAndObjects;

import java.util.Scanner;

//Write a program to give information about any number such as whether it is even odd, prime or
//not prime, or positive or negative, palindrome or not using class and object?
public class Expt1_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num= sc.nextInt();
        int temp=0;
        if(num>0)
        {
            System.out.println(num+" is positive...");
            int temp1=num;
            for(int i=temp1;i>0;i--)
            {
                if(temp1%i==0)
                {
                    temp++;
                }
            }
            if(temp==2)
            {
                System.out.println(num+" is a prime number...");
            }else {
                System.out.println(num+" is not a prime number...");
            }
            int temp2=num;
            int rev=0;
            while(temp2>0)
            {
                rev=rev*10+(temp2%10);
                temp2=temp2/10;
            }
            if(rev==num)
            {
                System.out.println(num+" is a palindrome number...");
            }else{
                System.out.println(num+" is not a palindrome number...");
            }
        }else {
            System.out.println(num+" is Negative...");
            System.out.println(num+" is not a palindrome number...");
            System.out.println(num+" is not a prime number...");
        }
        if(num%2==0)
        {
            System.out.println(num+" is an even number...");
        }else {
            System.out.println(num+" is an odd number...");
        }
    }
}
