package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Write a program to find summation, subtraction and multiplication of two 3X4 matrices?
public class Expt3_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]a=new int[3][4];
        int [][]b=new int[3][4];
        int [][]sum=new int[3][4];
        int [][]sub=new int[3][4];
        System.out.println("Enter the elements of the matrix A :");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter the elements into matrix B :");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                b[i][j]= sc.nextInt();
            }
        }
        System.out.println("Matrix A is : ");
           for(int i=0;i<a.length;i++)
           {
               for(int j=0;j<a[0].length;j++)
               {
                   System.out.print(a[i][j]+" ");
               }
               System.out.println();
           }
        System.out.println("Matrix B is : ");
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i< sum.length;i++)
        {
            for(int j=0;j<sum[0].length;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
                sub[i][j]=a[i][j]-b[i][j];
            }
        }
        System.out.println("Addition of Matrix A and Matrix B is : ");

        for(int i=0;i<sum.length;i++)
        {
            for(int j=0;j<sum[0].length;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Subtraction of Matrix A and Matrix B is : ");

        for(int i=0;i<sub.length;i++)
        {
            for(int j=0;j<sub[0].length;j++)
            {
                System.out.print(sub[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Multiplication of these Matrices can not find because column of first matrix " +
                "is not equal to row of second matrix");
    }
}
