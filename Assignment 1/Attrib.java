import java.io.*;
import java.util.*;
public class Attrib {
    /* Command::
    attrib name       where name must be the name of a file and its path.
    Action:
    Makems the file read only.
    Errors:
    The user enters:
    1. attrib             Does not type the file name.
    2. attrib name        but the file does not exist.
    3. attrib name        but the file is a directory.
    When there is an error println a message and return (not exit).

     */
    public Attrib(String name){
        f(name);
    }

    private void f(String name){
        File f = null;
        boolean bool = false;

        try {  

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter file path");

            String filep = myObj.nextLine();  // Read user input
            System.out.println("File Path: " + filep);  // Output user input

            // create new File object
            f = new File(filep);

            // returns true if file exists
            bool = f.exists();

            // if file exists
            if(bool) {

                // set file as read only
                bool = f.setReadOnly();
                System.out.println("setReadonly() succeeded?: "+bool);

            }
            
            if(filep == ""){
                System.out.print("No path entered");

            }

        } catch(Exception e) {
            System.out.print("User Input not valid");
            
        }
    }

}