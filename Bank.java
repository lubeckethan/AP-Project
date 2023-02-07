import java.util.*;
import java.util.Scanner;
public class Bank {

    public static void userBank() {
        // Deposit or Withdrawal
        Scanner input = new Scanner(System.in);
        System.out.println(" Would you like to Deposit or Withdrawal Money? Press 1 for Deposit and 2 for Withdrawal");
        double Balance = 1392.42;
        double Response = 0;
        Response = input.nextInt();
        System.out.println();
        // Make it so when enter anything besides 1 or 2, get error
        if (Response == 2) {
            System.out.println(" Your current balance is:" + Balance);
            System.out.println();
            System.out.println(" How much would you like to Withdraw? ===>");
        } else {
            System.out.println(" Your current balance is:" + Balance);
            System.out.println("How much would you like to Deposit?");
        }
    }

    public static void userWithdraw() {
        // User inputs number to withdraw and withdraws from Balance
        Scanner input = new Scanner(System.in);
        double Withdraw;
        double Balance = 1392.42;
        // Make sure do while loop works if try to withdraw more than balance. break somewhere

        do {
            Withdraw = input.nextDouble();
            if (Withdraw > Balance) {
                System.out.println(" You don't have enough money. Try another amount.");
            }

        } while (Withdraw > Balance);

        Balance -= Withdraw;
        System.out.println(" Transaction successful. Your new balance is " + Balance);

    }

    public static void userDeposit() {
        // User inputs number to withdraw and withdraws from Balance
        Scanner input = new Scanner(System.in);
        double Deposit;
        double Balance = 1392.42;
        // Make sure do while loop works if try to withdraw more than balance. break somewhere

        do {
            Deposit = input.nextDouble();
            if (Deposit > Balance) {
                System.out.println(" Transaction successful. Your new balance is " + Balance);

            }
            while (Deposit > Balance) ;

            Balance += Deposit;
            System.out.println(" Transaction successful. Your new balance is " + Balance);


        } while (

    }


}