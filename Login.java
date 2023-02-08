import java.util.Scanner;
public class Login {
    public static void userLogin(){
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter your PIN");
        System.out.println();
        int pin = 0;

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

    int numberOfChristmasGifts[];
        numberOfChristmasGifts = new int [2];

                for (int k= 0;  k< numberOfChristmasGifts.length; k++) {
        numberOfChristmasGifts[k] = 26;

        System.out.println( numberOfChristmasGifts[k]);