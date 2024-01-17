import java.io.*;
import java.util.Scanner;

public class Delete {
    /* Command::
    delet name           where name must be the name of a file and its paths.
    Action:
    delets name
    Errors:
    The user enters:
    1. delet                The user did not type the file name.
    2. delet name           The file name does not exist in the path.
    3. delete name          But the file name does is a directory.
    When there is an error println a message and return (not exit).
     */
    public Delete(String name){
        f(name);
        System.out.print("delete Executed");
    }

    private void f(String name){
       
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter file path");

        String path = myObj.nextLine();  // Read user input
        System.out.println(path);  // Output user input

       File file = new File(path); 

      boolean res = true;
      res = (myObj == null);  
      System.out.print(res + "RES TRUE Or false" );
      
        
        if(res) {
            System.out.println("Nothing was entered. Please try again");
        } 
        //user entered something
        else {
            if(file.delete()) 
            { 
                System.out.println("File deleted successfully"); 
            } 
            else
            { 
                System.out.println("Failed to delete the file"); 
            } 

        }

    }
}
