// Enumeration concept: introduced in java 5.
// used to declare the user defined group of constants like weeks, months , cars names

// use "enum" keyword to specifiy the enum, and then use the enum name.
 
// the grounp of constants are by default public static and final




enum Week	// enum is by default private
{
MON, TUE, WED, THU, FRI, SAT, SUN;   // these are by default public static final
}

			// eum as we know are private so must be decalred within the using class.

class Using_enum
{
public static void main(String []args)
{
      // as we know constants are of static nature use them using enum name
	// and can be stroed into a particular enum type

//Week.MON; 
//Week w1; == to store the constant 

Week w1 = Week.MON;
Week w2 = Week.TUE;
Week w3 = Week.WED;
Week w4 = Week.THU;
Week w5 = Week.FRI;
Week w6 = Week.SAT;
Week w7 = Week.SUN;

System.out.println("constants inside the enum "+w1+" "+w2+" "+w3+" "+w4+" "+w5+" "+w6+" "+w7);

  	// we can all the constants in the enum using values() method whose return type is array type.

Week [] we = Week.values ();

		// we print the array elements using for each loop
System.out.println("constants inside the Enum Week");

for (Week wee:we)
{
System.out.println(".."+wee);
try{Thread.sleep(1000);}
catch(InterruptedException ie)
{ie.printStackTrace();}
}
}
}

/*output:

F:\java by dragon\java programms\java basic applications>javac Usage_of_enumeration.java

F:\java by dragon\java programms\java basic applications>java Using_enum

constants inside the enum MON TUE WED THU FRI SAT SUN
constants inside the Enum Week
..MON
..TUE
..WED
..THU
..FRI
..SAT
..SUN

*/