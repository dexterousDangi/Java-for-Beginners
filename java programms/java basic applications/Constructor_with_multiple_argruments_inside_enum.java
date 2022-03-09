// yes, it is possible to declare multiple constructors with multiple arguments

// as we know the constants of enum ,also act as oject of enum, when a class file file is 
// loaded into the system, all the constants/objects were called  then the corresponding constructors will be automatically called during ".class" file loading

// first the constructors are executed 



enum Herion
{
ANU(10), SAM(8,4), TARA(7,3,4); // these are constants also act as objects of enum
				// can also holds the arguments of constructor 
				// which we passed when we use these objects, and corresponding constructor will be executed

int rating;

Herion(int a)
{
System.out.println("ratan");
}

Herion(int a, int b)
{
System.out.println("hoe");
}

Herion(int a, int b, int c)
{
System.out.println("chao");
}


}

class Constructor_with_multiple_argruments_inside_enum
{
public static void main(String []args)
{
Herion [] hh = Herion.values();  // will returns all the constants inside the enum , retrun type of values is array

		// print all the items inside the array using for each lool

for(Herion h:hh)
{
System.out.println(h);
}		// we are printing values holds by h 
 }
}

/*
output:

F:\java by dragon\java programms\java basic applications>javac Constructor_with_multiple_argruments_inside_enum.java

F:\java by dragon\java programms\java basic applications>java Constructor_with_multiple_argruments_inside_enum

ratan
hoe
chao		// first all the three constructors were invoked

ANU
SAM
TARA

*/