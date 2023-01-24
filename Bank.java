import java.util.*;
import java.util.Scanner;
public class Bank {

  public static void userBank(){
        // Deposit or Withdrawal
      Scanner input = new Scanner(System.in);
      System.out.println( " Would you like to Deposit or Withdrawal Money? Press 1 for Deposit and 2 for Withdrawal");
      double Balance = 1392.34;
      Balance = input.nextInt();
      System.out.println();
      if(Balance != 1 ){
          System.out.println ("How much would you like to Withdraw?");
      }
      else{
          System.out.println( "How much would you like to Deposit");
      }




  }




}
