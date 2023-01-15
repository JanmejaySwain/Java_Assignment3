package ClassesAndObjects;

import java.util.Scanner;

//Write a program to swap two numbers without using 3rd variable and with using
//3rd variable using class and object?
public class Expt1_9 {
    int x,y;
    Expt1_9(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number :");
        int m= sc.nextInt();
        int n=sc.nextInt();
        Expt1_9 obj=new Expt1_9(m,n);
        System.out.println("First number : "+obj.x);
        System.out.println("Second Number : "+obj.y);
        obj.swapWithOutThirdNum();
        obj.swapWithThirdNum();
    }

    private void swapWithThirdNum() {
        int temp=0;
        temp=x;
        x=y;
        y=temp;
        System.out.println("Swap Using Third Variable\n"+"------------------------");
        System.out.println("First number : "+x);
        System.out.println("Second Number : "+y);
    }

    private void swapWithOutThirdNum() {
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Swap Without Using Third Variable\n"+"----------------------------");
        System.out.println("First number : "+x);
        System.out.println("Second Number : "+y);
    }
}
