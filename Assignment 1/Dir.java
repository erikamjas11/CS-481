
import java.io.*;
import java.util.*;
public class Dir {
    /* Command::
    dir name           where name must be null or the name of a directory and its paths.
    Action:
    List the file and directory names in this directory.
    Note that if the user enters "dir" it is OK and it means the current
    directory. In this case as you know a period (e,g .) means the current
    directory
    Errors:
    The user enters:
    1. dir name             The directory name does not exist.
    2. dir name             But the name does is not a directory name.
    When there is an error println a message and return (not exit).
     */

    public Dir(String name){
        f(name);
    }

    private void f(String name){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter file path");

        String filep = myObj.nextLine();  // Read user input
        System.out.println("File Path: " + filep);  // Output user input

        // create new File object
        //f = new File(filep);

        File dir = new File(filep);
        File[] files = dir.listFiles();
        FileFilter fileFilter = new FileFilter() 
            {
                          public boolean accept(File file) {
                    return file.isDirectory();
                }
            };
        files = dir.listFiles(fileFilter);
        System.out.println(files.length);

        if (files.length == 0) {
            System.out.println("Either dir does not exist or is not a directory");
        } else {
            for (int i = 0; i< files.length; i++) {
                File filename = files[i];
                System.out.println(filename.toString());
            }
        }
    }
}

