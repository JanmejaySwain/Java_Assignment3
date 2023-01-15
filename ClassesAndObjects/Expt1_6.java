package ClassesAndObjects;

import java.util.Scanner;

//Write a program to display type of triangle using sides of triangle?
public class Expt1_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 sides of triangle :");
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();
        if(x<0 || y<0 || z<0 )
        {
            System.out.println("Invalid input ! !\n"+"exit....");
            System.exit(1);
        }
        Expt1_6 obj=new Expt1_6();
        obj.checkType(x,y,z);
    }

    private void checkType(int a,int b,int c) {
        if(a==b&&a==c)
        {
            System.out.println("Triangle is Equilateral...");
        } else if (a==b||a==c||b==c) {
            System.out.println("Triangle is Isosceles...");
        }else {
            System.out.println("Triangle is Scalene...");
        }
    }
}
