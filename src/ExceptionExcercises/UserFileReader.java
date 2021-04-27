package ExceptionExcercises;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class UserFileReader {
    public UserFileReader () {}

    public boolean isValidUser(String cpr, String password) throws FileNotFoundException {
        File userData = new File("/Users/iqraabbasi/IdeaProjects/exceptions/src/TestData");
        Scanner fileSc = new Scanner(userData);

        //hasNextline (boolean)
        while (fileSc.hasNextLine()) {
            String a = fileSc.nextLine();

            //Seperate the line
            String [] aAsArray = a.split(";"); //retur typen er Array af Strings

            //if
            if (aAsArray[0].equals(cpr)){
                return true;
            }
        }

        throw new NoSuchUserException ();
    }
}

