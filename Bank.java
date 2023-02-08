import java.util.*;
import java.util.Scanner;
public class Bank {

    // Create where the previous amount deposited/withdrawed will be taken into account with further deposits.

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
        System.out.println(" Transaction successful. Your new balance is " + "$"+ Balance);

    }

    public static void userDeposit() {
        // User inputs number to withdraw and withdraws from Balance
        Scanner input = new Scanner(System.in);
        double Deposit;
        double Balance = 1392.42;
        // Make sure do while loop works if try to withdraw more than balance. break somewhere

            Deposit = input.nextDouble();

            Balance += Deposit;
            System.out.println(" Transaction successful. Your new balance is " + "$" + Balance);




    }


}