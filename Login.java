import java.util.Scanner;
public class Login {


    public static void userLogin(){
      // Create and Store Pin
        Scanner input = new Scanner(System.in);
        int pinList[]  = new int[9999];
        int lastPin = 0;

        System.out.println("Please create your 4-digit PIN. ====>");

        int newPin = input.nextInt();
        pinList[lastPin] = newPin;


        Scanner pinInput = new Scanner(System.in);
        System.out.println(" Please enter your PIN");
        System.out.println();
        int pin = newPin;
        // Ask for Pin - correct/incorrect
        do
        {
            System.out.println(" Enter your PIN ====>");
            pin = input.nextInt();
            System.out.println();
            if (pin != newPin)
                System.out.println(" Incorrect PIN. Please try again.");
            System.out.println();
        }
        while ( pin != newPin);
        System.out.println("Welcome");

    }

    }


