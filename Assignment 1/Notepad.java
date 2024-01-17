import java.awt.Desktop;  
import java.io.*; 

public class Notepad extends Thread{
    /*
    Command:
    edit
    Action:
    The notepad editor shows up on the screen.

    Use the java Runtime class to execute the notepad.exe. With this approch
    you do not need notepad.h, notepad.c, and notepad.exe.
    This approach is easier than one I posted last week. You do not
    need the java native interface (JNI) or Microsoft visual C++.
     */
    public Notepad(){
        f();
    }

    private void f() {
        try  
        {  
            // //constructor of file class having file as argument  
            
            // Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            // System.out.println("Enter file path");

            // String filep = myObj.nextLine();  // Read user input
            // System.out.println("File Path: " + filep);  // Output user input

            // // create new File object
            // f = new File(filep);
            
            
            // This file path may need to be changed For other computers or you can  
            //uncomment the above and put the variable filep below to mannually input the file path each time .
            
            File file = new File("C:\\WINDOWS\\system32\\notepad.exe");   
            if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not  
            {  
                System.out.println("not supported");  
                return;  
            }  
            Desktop desktop = Desktop.getDesktop();  
            if(file.exists())         //checks file exists or not  
                desktop.open(file);              //opens the specified file  
        }  
        catch(Exception e)  
        {  
            e.printStackTrace();  
        }  
    }  
}  


// import java.awt.Desktop;  
// import java.io.*;  
// public class OpenFileExample1   
// {  
// public static void main(String[] args)   
// {  
// try  
// {  
// //constructor of file class having file as argument  
// File file = new File("C:\\demo\\demofile.txt");   
// if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not  
// {  
// System.out.println("not supported");  
// return;  
// }  
// Desktop desktop = Desktop.getDesktop();  
// if(file.exists())         //checks file exists or not  
// desktop.open(file);              //opens the specified file  
// }  
// catch(Exception e)  
// {  
// e.printStackTrace();  
// }  
// }  
// }  