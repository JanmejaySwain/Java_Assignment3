package ClassesAndObjects;

import java.util.Scanner;

//Write a program to find area and perimeter of rectangle using class and object?
public class Expt1_3 {
    int ln,br;
    Expt1_3(int ln,int br)
    {
        this.ln=ln;
        this.br=br;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth of Rectangle : ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a<0 || b<0)
        {
            System.out.println("Invalid input ! !\n"+"exit....");
            System.exit(1);
        }
        Expt1_3 obj=new Expt1_3(a,b);
        obj.perimeter();
        obj.area();
    }

    private void area() {
        int area=ln*br;

        System.out.println("Area : "+area);
    }

    private void perimeter() {
        int peri=2*(ln+br);
        System.out.println("Perimeter is : "+peri);
    }
}
