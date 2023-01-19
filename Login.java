import java.util.Scanner;
public class Login {
    public static void main (String args[]){
        // User will enter Account Number

        Scanner accountNum = new Scanner(System.in);
        System.out.println("Welcome User. Please enter your account number");
        int AccountNum = accountNum.nextInt();

        boolean okAccountNum = true;
                do
                {
                    System.out.print(" Enter your 5-digit account number ===>> ");
                    int pin = AccountNum.enterInt();
                    okAccountNum= checkAccountNum()
                }

        // User will enter PIN
        Scanner pinNum = new Scanner(System.in);
        System.out.println("Welcome User. Please enter your PIN ");
        int PinNum = pinNum.nextInt();


        // First Name of user
        String firstName;
       // Last Name of user
        String lastName;







    }







}
