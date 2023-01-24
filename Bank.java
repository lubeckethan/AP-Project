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
      if(Response != 1 ){
          System.out.println (" Your current balance is:" + Balance);
          System.out.println();
          System.out.println (" How much would you like to Withdraw?");
      }
      else{
          System.out.println (" Your current balance is:" + Balance);
          System.out.println( "How much would you like to Deposit?");
      }
  }
  public static void userWithdraw(){






  }

public static void userDeposit(){





}

}
