package Polymorphisim;

import java.util.Scanner;

//Write a program to find area and perimeter of circle,square,rectangle and triangle using method
//overloading?
public class Expt1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Work obj=new Work();
        System.out.println("Enter the radius of circle :");
        int radi= sc.nextInt();
        obj.areaPeri(radi);
        System.out.println("Enter the side of a square :");
        int sqlen= sc.nextInt();
        String str=Integer.toString(sqlen);
        obj.areaPeri(str);
        System.out.println("Enter the length and breadth of rectangle :");
        int rectlen=sc.nextInt();
        int rectbre=sc.nextInt();
        obj.areaPeri(rectlen,rectbre);
        System.out.println("Enter the 3 sides of a triangle :");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        obj.areaPeri(a,b,c);
    }
}
class Work{

    public void areaPeri(int radi) {
        float circleArea=(float) 3.141*radi*radi;
        float peri= (float) (2*3.141*radi);
        System.out.println("Area of circle is : "+circleArea);
        System.out.println("Perimeter of circle is : "+peri);
    }
    public void areaPeri(String len)
    {
        int sqlen=Integer.parseInt(len);
        int area=sqlen*sqlen;
        int peri=4*sqlen;
        System.out.println("Area of square :"+area);
        System.out.println("Perimeter of square :"+peri);
    }


    public void areaPeri(int rectlen, int rectbre) {
        int area=rectbre*rectlen;
        int peri=2*(rectbre+rectlen);
        System.out.println("Area of rectangle : "+area);
        System.out.println("Perimeter of rectangle : "+peri);
    }

    public void areaPeri(int a, int b, int c) {
        int s=(a+b+c)/2;
        int m=s*(s-a)*(s-b)*(s-c);
        double area=Math.sqrt(m);
        int peri=a+b+c;
        System.out.println("Area of triangle : "+area);
        System.out.println("Perimeter of triangle : "+peri);
    }
}