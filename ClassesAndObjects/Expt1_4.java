package ClassesAndObjects;

import java.util.Scanner;

//Write a program to find area and perimeter of square using class and object?
public class Expt1_4 {
    int ln;
    Expt1_4(int ln)
    {
        this.ln=ln;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length  of Square : ");
        int a= sc.nextInt();
        if(a<0 )
        {
            System.out.println("Invalid input ! !\n"+"exit....");
            System.exit(1);
        }
        Expt1_4 obj=new Expt1_4(a);
        obj.perimeter();
        obj.area();

    }

    private void area() {
        int area=ln*ln;

        System.out.println("Area : "+area);
    }

    private void perimeter() {
        int peri=4*ln;
        System.out.println("Perimeter is : "+peri);
    }
}
