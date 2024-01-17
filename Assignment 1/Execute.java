import java.io.*;
import java.util.StringTokenizer;
import java.lang.reflect.*;

public class Execute {
    /* Command::
    exec name word1 word2, ....   where name must the name of a java class and its paths
    and wordis are the arguments.
    Action:
    Executes the "main" of the name.class. Therefore this file must be the main file.
    Errors:
    The user enters:
    1. exec                 The class name is missing.
    2. exec name            But name.class does not exist.
    3. There are exceptions that you need to find them.
    When there is an error println a message and return (not exit).
     */

    public Execute(String name){
        f(name);
    }

    private void f(String s){
        int result;

        try {

            System.out.println("command output:");
            Process p = Runtime.getRuntime().exec("java -cp . Test");

            InputStream errin = p.getErrorStream();
            InputStream in = p.getInputStream(); 
            BufferedReader errorOutput = new BufferedReader(new InputStreamReader(errin));
            BufferedReader output = new BufferedReader(new InputStreamReader(in));
            String l1 = null;
            String l2 = null;
            try {
                while ((l1 = errorOutput.readLine()) != null || 
                (l2 = output.readLine()) != null) {                   
                    if(l1 != null) System.out.print(l1);
                    if(l2 != null) System.out.print(l2);               
                }//end while
                errorOutput.close();
                output.close();
            } catch (IOException e) {
                e.printStackTrace(); 
            }//end catc
            result = p.waitFor();

        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            System.err.println("IOException raised: " + e.getMessage());
        }
    }
}

