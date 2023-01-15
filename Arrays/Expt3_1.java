package Arrays;

import java.util.Scanner;

//Write a program to find average and also find total no. of odd, even, prime and palindrome
//number available in an array of 30 user defined numbers?
public class Expt3_1 {
    public static void main(String[] args) {
        int ne=0,no=0,np=0,npal=0,avge=0,avgo=0,avgp=0,avgpal=0,se=0,so=0,sp=0,spal=0;
        int[]x=new int[30];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements into the array:");
        for(int i=0;i<x.length;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<x.length;i++)
        {
            int temp=0;
            if(x[i]%2==0)
            {
                ne++;
                se=se+x[i];
            }else{
                no++;
                so=so+x[i];
            }
            for(int j=x[i];j>0;j--)
            {
                if(x[i]%j==0)
                {
                    temp++;
                }

            }
            if(temp==2)
            {
                np++;
                sp=sp+x[i];
            }
            int num=x[i];
            int rev=0;
            while(num>0)
            {
                rev=rev*10+(num%10);
                num=num/10;
            }
            if(x[i]==rev)
            {
                npal++;
                spal=spal+x[i];
            }
        }
        avge=se/ne;
        avgo=so/no;
        avgp=sp/np;
        avgpal=spal/npal;

        System.out.println("Average of "+ne+" even numbers : "+avge);
        System.out.println("Average of "+no+" odd numbers : "+avgo);
        System.out.println("Average of "+np+" prime numbers : "+avgp);
        System.out.println("Average of "+npal+" palindrome numbers : "+avgpal);


    }

}
