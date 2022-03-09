// it is also possible in enum to pass the arguments in constructor also


enum Herion
{
ANU(10), SAM(8), TARA(7); // these are constants also act as objects of enum
				// can also holds the arguments of constructor 
				// which we passed when we use these objects

int rating;

Herion(int rating)
{
this.rating= rating;
}
}

class Constructor_with_argruments_inside_enum
{
public static void main(String []args)
{
Herion [] hh = Herion.values();  // will returns all the constants inside the enum , retrun type of values is array

		// print all the items inside the array using for each lool

for(Herion h:hh)
{
System.out.println(h+"---rating---"+h.rating);
}		// we are printing values holds by h and using reference variable of Herion we are accessing "rating" variable.
 }
}

/*output:


F:\java by dragon\java programms\java basic applications>javac Constructor_with_argruments_inside_enum.java

F:\java by dragon\java programms\java basic applications>java Constructor_with_argruments_inside_enum

ANU---rating---10
SAM---rating---8
TARA---rating---7
*/