package Polymorphisim;

import java.util.Scanner;

// Write program to display following pattern using method overloading and constructor
//overloading?
//Odd number based pyramid starts from value n received from user
//      n+1
//    n+3  n+6
//   n+5 n+10 n+15
// n+7 n+14 n+21 n+28
// even number based pyramid starts from value n received from user
//      n+2
//    n+4 n+6
//  n+6 n+10 n+14
// n+8 n+14 n+20 n+26
// user defined character suppose entered character is k
//     k
//    k k
//   k k k
//  k k k k
public class Expt2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num= sc.nextInt();
        Pyramid obj=new Pyramid(num);
        Pyramid obj1=new Pyramid('k');
    }
}
class Pyramid{

    Pyramid(int n)
    {
        createPyramid(n);
    }
    Pyramid(char c)
    {
        createPyramid(c);
    }

    public void createPyramid(int n)
    {
        int temp=0;
        if(n%2==0)
        {
            for(int i=1;i<=4;i++)
            {
                for(int j=4-i;j>0;j--)
                {
                    System.out.println(" ");
                }
                for (int k=1;k<=i;k++)
                    for (int j = 1; j <=i; j++) {
                        System.out.print(n + 2 + " ");
                        n += 4;
                    }
                System.out.println();

            }
        }else{

        }
    }
    public void createPyramid(char c)
    {

    }
}