package Polymorphisim;

import java.util.Scanner;

//Write a program to check whether a number or string is palindrome or not using method
//overloading?
public class Expt6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number or string :");
        String str= sc.next();
        String str1="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str1+=str.charAt(i);
        }

        if(str==str1)
        {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
