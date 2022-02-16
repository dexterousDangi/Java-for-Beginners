/* javaBean class concept: this class contains private properties(variable) and 
public 'setter' and 'getter' methods. setter methods are those methods used to 
set/modify the value of private instance variables and getters are those methods
which retrieve/get the value of private instance variables. 
* Using javaBean class anyone(any object/client(class)/employee) can set and get the 
values.
*/


class Empbean      // javabean class contain private properties
{
private int eid;
private String ename;

    // no. of private variable = no. of setters and getters  method
    // public setter methods: return type is void (only contains declerations)

public void setEid(int eid)    // setter method 1(local variables)
{
this.eid=eid;  // assigning local variable value to private instance variables
} 

public void setEname(String ename)   //setter method 2(local variables)
{
this.ename= ename;  // assigning local variable value to private instance variables
}
 
public int getEid()
{
return eid;  // "eid" variable is instance variable here, can be used directly by name 
              // in the instance methods.
}
    
public String getEname()
{
return ename;
}

} 
// javaBean class : its a reusable part of the software application
// any one can get data anyone can set the data