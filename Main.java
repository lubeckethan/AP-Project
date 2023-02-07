public class Main {

public static void main( String[] args){

    //Login
    Login.userLogin();
    //Account
    Bank.userBank();
    Bank.userWithdraw();
    Bank.userDeposit();

}

    boolean run = true;
        do{
        // Take the user's choice and process it accordingly
        System.out.println("What would you like to do?");
        int choice = input.nextInt();
        switch(choice){
            case 1: NoteUtilities.addNote(); break;
            case 2: NoteUtilities.displayNotes(); break;

            default: System.out.println("Sorry - I couldn't understand that.  Please try again."); break;
        }


    }while(run);

}
