package ExceptionExcercises;

// Exercise 1
// Create a class called ”NemIdAuthorizer”.
// NemIdAuthorizer has a method called isValidInput that returns a boolean value.
// isValidInput receives two parameters: String cpr & String password.

// • If cpr does not adhere to a valid cpr number
//  it will throw a new Input-MismatchException
// • If InputMismatchException is thrown
//  the program will inform the user and request another input

import java.util.InputMismatchException;
import java.util.Scanner;

//Class
public class NemIdAuthorizer {
    //Method
    public boolean isValidInput(String cpr, String password){

        if (cpr.length() != 10) {
            throw new InputMismatchException();
        }

        return true;
    }

}

