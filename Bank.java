import java.util.*;
import java.util.Scanner;
public class Bank {



    public static void userWithdraw() {
        // User inputs number to withdraw and withdraws from Balance
        Scanner input = new Scanner(System.in);
        double Withdraw = 0;
        double Balance = 1392.42 - Withdraw;
        System.out.println("Your current balance is " + "$" + Balance);


        do {
            Withdraw = input.nextDouble();
            if (Withdraw > Balance) {
                System.out.println(" You don't have enough money. Try another amount.");
            }

        } while (Withdraw > Balance);

        Balance -= Withdraw;
        System.out.println(" Transaction successful. Your new balance is " + "$"+ Balance);

    }

    public static void userDeposit() {
// User enters deposit amount
        Scanner input = new Scanner(System.in);
        double Deposit = 0;
        double Balance = 1392.42 + Deposit;
        System.out.println("Your current balance is " + "$" +  Balance);


            Deposit = input.nextDouble();

            Balance += Deposit;
            System.out.println(" Transaction successful. Your new balance is " + "$" + Balance);




    }


}