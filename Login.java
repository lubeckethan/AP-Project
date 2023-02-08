import java.util.Scanner;
public class Login {


    public static void userLogin(){
        Scanner input = new Scanner(System.in);
        int pinList[]  = new int[9999];
        int lastPin = 0;

        System.out.println("Please create your PIN.");

        int newPin = input.nextLine();
        pinList[lastPin] = newPin;


        Scanner pinInput = new Scanner(System.in);
        System.out.println(" Please enter your PIN");
        System.out.println();
        int pin = newPin;

        do
        {
            System.out.println(" Enter your PIN ====>");
            pin = input.nextInt();
            System.out.println();
            if (pin != 1234)
                System.out.println(" Incorrect PIN. Please try again.");
            System.out.println();
        }
        while ( pin != 1234);
        System.out.println("Welcome");

    }

    }


