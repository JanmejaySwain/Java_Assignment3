package ClassesAndObjects;
//Write a program to create simple calculator for addition, subtraction, division, multiplication,
//modulus, factorial, gcd, lcm, power, square root, cube root using class and object?
import java.util.Scanner;
import java.lang.Math;
public class Expt1_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Expt1_1 obj=new Expt1_1();
        System.out.println("Enter Two numbers :");
        int a= sc.nextInt();
        int b= sc.nextInt();
        while(true)
        {
            System.out.println("Enter your operation :");
            System.out.println("1.Addition\n"+"2.Subtraction\n"+"3.Division\n"+"4.Multiplication\n"+"5.Modulus\n"+"6.Factorial\n"+"7.Gcd and Lcm\n"+"8.power\n"+"9.Square Root\n"+"10.Cube Root\n");
            int i= sc.nextInt();
            switch (i)
            {
                case 1:
                    obj.add(a,b);
                    break;
                case 2:
                    obj.subtraction(a,b);
                    break;
                case 3:
                    obj.division(a,b);
                    break;
                case 4:
                    obj.multiplication(a,b);
                    break;
                case 5:
                    obj.modulus(a,b);
                    break;
                case 6:
                    obj.factorial(a,b);
                    break;

                case 7:
                    obj.lcmHcf(a,b);
                    break;
                case 8:
                    obj.power(a,b);
                    break;
                case 9:
                    obj.squareRoot(a,b);
                    break;
                case 10:
                    obj.cubeRoot(a,b);
                    break;
                default:
                    System.out.println("Input is invalid");
                    break;
            }

        }

    }

    private void cubeRoot(int a, int b) {
        System.out.println("Cube root of "+a+" is :"+Math.cbrt(a));
        System.out.println("Cube root of "+b+" is :"+Math.cbrt(b));
    }

    private void squareRoot(int a, int b) {
        System.out.println("Square root of "+a+" is :"+Math.sqrt(a));
        System.out.println("Square root of "+b+" is :"+Math.sqrt(b));

    }

    private void power(int a, int b) {
        System.out.println("Power of "+a+" and "+b+" is : "+a*a+" and "+b*b+" respectively");
    }

    private void lcmHcf(int a, int b) {
        int temp1=a,temp2=b,temp,hcf,lcm;
        while (temp2!=0)
        {
            temp=temp2;
            temp2=temp1%temp2;
            temp1=temp;
        }
        hcf=temp1;
        lcm=(a*b)/hcf;
        System.out.println("Gcd of "+a+" and "+b+" is : "+hcf);
        System.out.println("Lcm of "+a+" and "+b+" is : "+lcm);
    }


    private void factorial(int a, int b) {
        int temp1=a,temp2=b;
        int facta=1;
        int factb=1;
        while(a>0){
            facta*=a;
            a--;
        }
        while (b>0)
        {
            factb*=b;
            b--;
        }
        System.out.println("Factorial of "+temp1+" is : "+facta);
        System.out.println("Factorial of "+temp2+" is : "+factb);
    }

    private void modulus(int a, int b) {
        int mod=a%b;
        System.out.println("Modulus of "+a+" and "+b+" is : "+mod);
    }

    private void multiplication(int a, int b) {
        System.out.println("Multiplication of "+a+" and "+b+" is : "+(a*b));

    }

    private void division(int a, int b) {
        System.out.println("Division of "+a+" and "+b+" is : "+(a/b));

    }

    public void add(int a,int b)
    {
        System.out.println("Addition of "+a+" and "+b+" is : "+(a+b));
    }
    public void subtraction(int a,int b)
    {
        System.out.println("Subtraction of "+a+" and "+b+" is : "+(a-b));
    }

}
