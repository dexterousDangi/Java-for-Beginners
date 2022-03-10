// array are always of definate size 
// when we instantiated an array is created with definate size and have default values inside
// we can create an array of interger type or say boolean type 
// and of user defined type also. (like an array of userdefined class type)

// syntax: which_type [] reference_variable = new which_type[size_required];

class A{}

class Default_array_values
{
public static void main(String []args)
{ 
int []a3 = new int [4];	// here we instantiated an integer array , which contians default values of integer type
			// and when we assign the value to array it is replaced by the corresponding value.

for(int aa:a3)
{
System.out.println(aa);
}

	// like we instantiate a boolen array, which will have default values until we assign some values to the array

boolean [] b4 = new boolean[3];
for(boolean bb:b4)
{
System.out.println(bb);
}

	// likewise we instantiate an user defined type array of class A

A[] a1 = new A[3];   // for user defined arrays the default values will be "null".

for(A a2:a1)
{
System.out.println(a2);
}
 
}
}


/* output:

F:\java by dragon\java programms\java basic applications>javac Default_array_values.java

F:\java by dragon\java programms\java basic applications>java Default_array_values

0
0
0
0
false
false
false
null
null
null
*/			