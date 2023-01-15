package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Write a program to sort 10 numbers in descending order and average of 3rd largest and 4th
//smallest number in an array of 10 user defined numbers?
public class Expt3_4 {
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
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The above array in descending order :");
        System.out.println(Arrays.toString(arr));
        float avg=(arr[2]+arr[arr.length-4])/2;
        System.out.println("Average of 3rd largest and 4th smallest number : "+avg);
    }
}
