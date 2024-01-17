import java.util.*;
import java.text.*;
import java.time.LocalTime;
import java.util.Date;
/* Command:
time
Action:
the current time is displayed.
 */

public class MyTime{
    public MyTime(){
        f();
    }

    private void f(){
        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);
    }
}

