
package ap.lab.pkg2;
 
import java.util.*;

public class Reservation {
    
    int noOfPeople;
    int bookingTime;
    int date;
    
    @SuppressWarnings("empty-statement")
    public void makeReservation(int n, int t, int d)
    {
        
         List<Time> timelist=new ArrayList<Time>();
        for(int i=11;i<24;i++)
    {
        Time ti=new Time(i);
       timelist.add(ti);
    }
    
    Hashtable<Integer,List> res=new Hashtable<Integer,List>(); 
    for(int i=0;i<31;i++)
    {
        res.put(i,timelist);
    }
      Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your chosen date:");
        date=scan.nextInt();
        System.out.println("Please note that reservations start at the beginning of every hour.Please enter your chosen time in the 24 hour format:");
        int time=scan.nextInt();
        if(time<11 && time>22)
        {
            System.out.println("Sorry we do not accept reservations befor 11 and after 22 hours.");
        }  
    }
    
   
    
    
    
}
