import java.util.*;
import java.text.*;
import java.time.LocalDate;

public class MyDate{
    /* Command:
    date
    Action:
    the current date is displayed.
     */

    public MyDate(){
        f();
    }

    private void f(){
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date
    }
}
