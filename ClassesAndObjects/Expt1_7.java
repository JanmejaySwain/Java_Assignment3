package assignment3.ClassesAndObjects;

import java.util.Scanner;

//Write a java program to create banking application to perform following using class and
//object?
// a) Initialize with initial balance Rs 3000
// b) Deposit amount if balance is more than 1000 otherwise take Rs 100 as penalty for
// deposit
// c) Withdraw amount if balance is more than 1000 otherwise alert user for low balance
// d) check for balance
public class Expt1_7 {
    int balance=3000;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Expt1_7 obj=new Expt1_7();
        while (true)
        {
            System.out.println("Choose your Operation :");
            System.out.println("1.Deposit\n"+"2.Withdraw\n"+"3.Check Balance\n"+"4.Exit\n");
            int i=sc.nextInt();
            switch (i)
            {
                case 1:
                    obj.deposit(sc);
                    break;
                case 2:
                    obj.withdraw(sc);
                    break;
                case 3:
                    obj.checkBalance(sc);
                    break;
                case 4:
                    System.out.println("Thank You For Using Our Services...\n"+"Visit Again!!\n");
                    System.exit(1);
                default:
                    System.out.println("Invalid Operation");
            }
        }
    }

    private void checkBalance(Scanner sc) {
        System.out.println("Available Balance : "+balance);
    }

    private void withdraw(Scanner sc) {
        System.out.println("Enter amount : ");
        int withAmount= sc.nextInt();
        if(withAmount<balance)
        {
            if(balance>1000)
            {
                balance-=withAmount;
                System.out.println("Withdrawal successful...");
            }else {
                System.out.println("Low Balance ! !");
            }
        }else {
            System.out.println("insufficient funds...");
        }
    }

    private void deposit(Scanner sc) {
        System.out.println("Enter amount : ");
        int depAmount=sc.nextInt();
        if(balance>1000)
        {
            balance+=depAmount;
            System.out.println("Deposit successful...");
        }else {
            balance+=(depAmount-100);
            System.out.println("Deposit successful...");
        }

    }
}
