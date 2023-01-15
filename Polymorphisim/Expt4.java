package Polymorphisim;

import java.util.Scanner;

//Write a program to calculate interest that may be simple or compound using method overloading?
public class Expt4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle, rate,interest :");
        float principle= sc.nextFloat();
        float rate=sc.nextFloat();
        float time= sc.nextFloat();
        Interest i=new Interest(principle,rate,time);
        i.InterestCalculation(principle,rate,time);
    }
}
class Interest{
   float principle;
   float rate;
   float time;
    public Interest(float principle, float rate, float time) {
        this.principle=principle;
        this.rate=rate;
        this.time=time;
    }

    public void InterestCalculation(float principle, float rate, float time) {
        float si=(principle*time*rate)/100;
        System.out.println("Simple interest is : "+si);
        InterestCalculation();
    }

    private void InterestCalculation() {
        double amount=(principle*(Math.pow((1+(rate/100)),time)));
        double ci=amount-principle;
        System.out.println("Compound Interest is : "+ci);
    }
}
