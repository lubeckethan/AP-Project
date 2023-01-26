import java.util.*;
import java.util.Scanner;
public class Bank {

  public static void userBank(){
        // Deposit or Withdrawal
      Scanner input = new Scanner(System.in);
      System.out.println( " Would you like to Deposit or Withdrawal Money? Press 1 for Deposit and 2 for Withdrawal");
      double Balance = 1392.42;
      double Response = 0;
      Response = input.nextInt();
      System.out.println();
     // Make it so when enter anything besides 1 or 2, get error
      if(Response != 1 ){
          System.out.println (" Your current balance is:" + Balance);
          System.out.println();
          System.out.println (" How much would you like to Withdraw?");
      }
     if(Response != 2){
         System.out.println(" Unknown Integer. Please respond with 1 or 2.");
     }
      else{
          System.out.println (" Your current balance is:" + Balance);
          System.out.println( "How much would you like to Deposit?");
      }
  }
  public static void userWithdraw() {
      // User inputs number to withdraw and withdraws from Balance
      Scanner input = new Scanner(System.in);
      double Withdraw = input.nextDouble();
      double Balance = 1392.42;
      // Make sure do while loop works if try to withdraw more than balance. break somewhere
      while (Withdraw < Balance) ;
      do {
          double Account = (Balance - Withdraw);
          System.out.println(" Your new account balance is:" + Account);
      }
      while (Withdraw > Balance);
      do {
          System.out.println(" Insffucient Funds. Try again");
      } while( Withdraw >Balance);


  }
  public static void userDeposit() {


  }







  }