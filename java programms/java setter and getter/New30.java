 // client side application for javabean class(Empbean.java)
 // set the value using setter and get the value using getters

class TestClient
{
public static void main(String[] args)
{    
           // setting the value using object of javabean class 
Empbean ep1= new Empbean();
ep1.setEid(5652);
ep1.setEname("Dang");
   
   // getting value using object of javabean class
   // getEid() methods return type is int type, store this 
    //value in any interger and print it

int id =ep1.getEid();
System.out.println("employee id..."+id);
  
              //getEname() methods return type is string , store this value
               // in a string and print it 

s
String name = ep1.getEname();
 System.out.println("employee name..."+name);
    
      // as we know in javabean class anyone(and any no. of objects)
      // can set the data and any one can get the data

Empbean ep2= new Empbean();
ep2.setEid(4242);
ep2.setEname("Turiya");

System.out.println(ep2.getEid()) ; // we can also print the getter method in S.O.P statement directly
System.out.println(ep2.getEname());


}

}

/*output:

F:\java by dragon\java programms>javac New30.java

F:\java by dragon\java programms>java TestClient
employee id...5652
employee name...Dang
4242
Turiya
*/