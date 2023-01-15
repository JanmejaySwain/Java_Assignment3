package ClassesAndObjects;

import java.util.Scanner;

//Write a program to find area and perimeter of triangle having 3 sides using class and object?
public class Expt1_5 {
    int a,b,c;
    Expt1_5(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 sides of the triangle : ");
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();
        if(x<0 || y<0 || z<0 )
        {
            System.out.println("Invalid input ! !\n"+"exit....");
            System.exit(1);
        }
        Expt1_5 obj=new Expt1_5(x,y,z);
        obj.perimeter();
        obj.area();
    }

    private void area() {
        int s=(a+b+c)/2;
        int temp=s*(s-a)*(s-b)*(s-c);
        double ar=Math.sqrt(temp);
        System.out.println("Area : "+ar);
    }

    private void perimeter() {
        int per=a+b+c;
        System.out.println("Perimeter : "+per);

    }
}
