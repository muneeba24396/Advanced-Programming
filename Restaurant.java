
package ap.lab.pkg2;

import java.util.ArrayList;
import java.util.List;


public class Restaurant {
    int StartTime;
    int ClosingTime;
    private List<Table> tables;
    
    public Restaurant()
    {
        StartTime=11;
        ClosingTime=23;
        tables=new ArrayList<Table>();
    }
}
