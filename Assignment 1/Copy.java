import java.io.*;
import java.util.StringTokenizer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Copy {
    /* Command::
    copy nameA nameB      where nameA and nameB must be the name of a files and their paths.
    Action:
    Copies file nameA to file nameB.
    Errors:
    The user enters:
    1. copy               Does not type the file names.
    2. copy name          Did not type a second file name.
    3. copy nameA nameB   but the file nameA does not exist.
    4. copy nameA nameB   but the file nameB alreadyexist.
    5. copy nameA nameB   but nameA is a directory.
    6. copy nameA nameB   but the file is a directory.
    When there is an error println a message and return (not exit).
     */

    public Copy(String name) {
        f(name);
    }

    private void f(String name) {
        FileInputStream instream = null;
        FileOutputStream outstream = null;

        try{
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter file path");

            String filepin = myObj.nextLine();
            System.out.println("Enter old file path ");
            String filepout = myObj.nextLine();// Read user input
            System.out.println("Enter new file path");  // Output user input

            File infile =new File(filepin);
            File outfile =new File(filepout);

            instream = new FileInputStream(infile);
            outstream = new FileOutputStream(outfile);

            boolean isDirectory = infile.isDirectory();
            if(isDirectory == true){

                System.out.print ("This is a directory");

            }
            
            byte[] buffer = new byte[1024];

            int length;
            /*copying the contents from input stream to
             * output stream using read and write methods
             */
            while ((length = instream.read(buffer)) > 0){
                outstream.write(buffer, 0, length);
            }

            //Closing the input/output file streams
            instream.close();
            outstream.close();

            System.out.println("File copied successfully!!");


        }catch (FileNotFoundException e){
            System.out.print("File couldn't be found!");

        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}

