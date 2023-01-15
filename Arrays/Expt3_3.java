package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Write a program to sort 10 numbers in ascending order and find the sum of product of 2nd
//smallest and 3rd largest number?
public class Expt3_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Enter the elements into the array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The above array in ascending order :");
        System.out.println(Arrays.toString(arr));
        int prod=arr[1]*arr[arr.length-3];
        int sum=0;
        while(prod>0)
        {
            sum=sum+(prod%10);
            prod=prod/10;
        }
        System.out.println("Sum of  digits of  product of 2nd smallest and 3rd largest number : "+sum);
    }
}
