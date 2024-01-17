import java.io.*;
import java.util.*;
import java.io.File.*;
import java.nio.file.*;

public class Mkdir {
    /* Command:
    mkdir name
    Action:
    make a directory in the path of the name.
    Errors:
    The user enters:
    1. dir                 The name is missing.
    2. dir name            But name is already exist.

    When there is an error println a message and return (not exit).
     */

    public Mkdir(String name){
        f(name);
    }

    private void f(String name){

        System.out.println("Enter the path to create a directory: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        System.out.println("Enter the name of the desired a directory: ");
        path = path+sc.next();
        //Creating a File object
        File file = new File(path);
        //Creating the directory
        boolean bool = file.mkdir();
        if (file == null){
            System.out.print("NULL");

        }
        if(bool == true){
            System.out.println("Directory created successfully");
        }else{
            System.out.println("Sorry couldn’t create specified directory");
        }
    }
}

