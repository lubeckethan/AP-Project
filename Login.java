import java.util.Scanner;
public class Login {

    public static void createPIN(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please create your PIN.");

        int newPin = input.nextLine();

        noteList[lastNote] = newPin;








    }


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


        System.out.println("Please type in the note you would like to add below:");
        String newNote = input.nextLine();
        noteList[lastNote] = newNote;
        lastNote++;