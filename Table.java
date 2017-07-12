
package ap.lab.pkg2;

import java.util.*;

public class Table {
    int number;
    int noOfSeats;
    int startTime;
    int allotedTime;
    
    public Table()
    {
        number=0;
        noOfSeats=0;
        startTime=0;
        allotedTime=0;
        
    }
    
    public  Table(int no, int nos)
    {
        number=no;
        noOfSeats=nos;
        startTime=0;
        allotedTime=1;  //each reservation will be alloted one hour
        
    }
    
    public void setTime(int x, int y)
    {
        startTime=x;
        allotedTime=y;
    }
    
    
    
    
    
}
