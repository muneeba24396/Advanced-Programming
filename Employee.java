
package ap.lab.pkg2;


public class Employee {
    int Eno;
    int table;
    String type;
    
    
    public Employee()
    {
        Eno=0;
        table=0;
        type=null;
    }
    
    public Employee(int n, String t)
    {
        Eno=n;
        type=t;
        table=0;
    }
    
    public void reserveEmployee(int t)
    {
        table=t;
    }
    
}
