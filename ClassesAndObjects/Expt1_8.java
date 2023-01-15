package ClassesAndObjects;

import java.util.Arrays;
import java.util.Scanner;

//Write a program to search for a user defined number in array of 20 numbers using linear search
//and binary search using class and object? Allow user to choose searching method.
public class Expt1_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[10];
        System.out.println("Enter 20 numbers :");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter searching number :");
        int n= sc.nextInt();
        System.out.println("Enter your choice\n"+"1.Linear Search\n"+"2.Binary Search");
        int choice= sc.nextInt();
        System.out.println("The array is :");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        UserSearch u=new UserSearch(arr,n);
        if(choice==1)
        {
            u.linearSearch();
        } else if (choice==2) {
            u.binarySearch();
        }else {
            System.out.println("Invalid  Input!!");
        }

    }
}
class UserSearch
{
    int[] arr=new int[10];
    int n;
    UserSearch(int []arr,int n)
    {
        this.arr=arr;
        this.n=n;
    }
    public void linearSearch()
    {
        int temp=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==n)
            {
                System.out.println("No. is found at index "+i);
                temp++;
            }
        }
        if(temp==0)
            System.out.println("No. not found in array...");
    }
    public void binarySearch()
    {
        int start=0;
        int end= arr.length-1;
        while (start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==n)
            {
                System.out.println("Number found at index "+mid);
                return;
            }
            if(arr[mid]<n)
            {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        System.out.println("Number not found in array...");
    }
}