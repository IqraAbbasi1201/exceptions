package ExceptionExcercises;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Application {
    public static void main(String[] args) {
        while (true) {
            Scanner Input = new Scanner(System.in);
            NemIdAuthorizer nemId = new NemIdAuthorizer();
            UserFileReader userExists = new UserFileReader();

            System.out.println("Input your CPR-number?");
            String cpr = Input.nextLine();

            try {
                nemId.isValidInput(cpr, "Password");
                userExists.isValidUser(cpr , "passwordTwo");
                break;
            }

            catch ( InputMismatchException | FileNotFoundException e ){
                System.out.println(e.getMessage());
            }

        }
    }

}
