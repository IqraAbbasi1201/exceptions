package ExceptionExcercises;

import java.util.InputMismatchException;

// Exercise 2
// Write a data source for NemIdAuthorizer.
// The data source is a .csv file with 2 columns:
// Username & Password.
// Expand the program such that a custom exception
// ”NoSuchUserException” is thrown, if a certain user does not exist.

public class NoSuchUserException  extends InputMismatchException{
    NoSuchUserException(){
        super ("There is no such user");
    }
}
