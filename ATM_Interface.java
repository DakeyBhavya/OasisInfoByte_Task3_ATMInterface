import java.io.*;
import java.util.*;
import java.lang.*;
public class ATM_Interface {

    public static void BalanceDisplay(int bankbalance)
    {
        System.out.println("Your Savings Account Balance is : " + bankbalance);
        System.out.println();
    }

    
    public static int amountWithdrawal(int bankbalance,int withdrawalAmount)
    {
        System.out.println("Withdrawal Validation:");
        System.out.println("Withdrawal Amount : "+ withdrawalAmount);
        if (bankbalance >= withdrawalAmount) {
            bankbalance = bankbalance - withdrawalAmount;
            System.out.println("Please collect your money and collect the card");
            BalanceDisplay(bankbalance);
        }
        else {
            System.out.println("Sorry! Inadequate Funds");
            System.out.println("Please check your Account balance!"+"\n Thank You");
            System.out.println();
        }
        return bankbalance;
    }

    
    public static int depositAmount(int bankbalance,int depositSum)
    {
        System.out.println("Deposit Validation:");
        System.out.println("Deposit Amount : "+ depositSum);
        bankbalance = bankbalance + depositSum;
        System.out.println( "Your Money has been successfully deposited in your Savings Account");
        BalanceDisplay(bankbalance);
        return bankbalance;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Savings Account bank balance:");
        int bankbalance=sc.nextInt();
        System.out.println("Enter the amount for withdrawal :");
        int withdrawalAmount=sc.nextInt();
        System.out.println("Enter the amount to deposit :");
        int depositSum=sc.nextInt();
        BalanceDisplay(bankbalance);
        bankbalance=amountWithdrawal(bankbalance, withdrawalAmount);
        bankbalance=depositAmount(bankbalance, depositSum);
    }
}