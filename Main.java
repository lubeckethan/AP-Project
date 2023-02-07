import java.util.Scanner;

public class Main {

    Scanner input = new Scanner(System.in);
public static void main( String[] args){
    //Login
    Login.userLogin();


    System.out.println(" Welcome to the ATM. What would you like to do?");
    System.out.println(" Press '1' to make a deposit");
    System.out.println(" Press '2' to make a withdrawal");


}

    boolean run = true;
        do{
        // Take the user's choice and process it accordingly
        System.out.println("What would you like to do?");
        int choice = input.nextInt();
        switch(choice){
            case 1: Bank.userDeposit(); break;
            case 2: Bank.userWithdraw(); break;

            default: System.out.println("Sorry - I couldn't understand that.  Please try again."); break;
        }


    }while(run);

}
