// equal() method usage in string class and stringbuffer class and current class(Equals_in_string class)
// here we are using equals method but c  which only performs the reference variable comparison 
// means that if two references are pointing towards same object it will return 'TRUE' otherwise "false"
// object class equal() method didn't performs content comparison if only perform reference comparison
//our "class(Equlas_in_string)" and "StringBuffer class" didn't contains equals() method,
// it uses "object class" equals() method


// but our string class contains  overriden equals()methods which didn't compare reference variable but
// compares the object content they are pointing. if they contains same object it returns "true" otherwise false.



class Equals_in_string
{
Equals_in_string(String str)
{
}

public static void main(String []args)
{     
       // uses object class string method
        
Equals_in_string es1 = new Equals_in_string("dangi");
Equals_in_string es2 = new Equals_in_string("dangi");
System.out.println(es1.equals(es2));

         //uses string class overriden equals() method


String s1="alpha";
String s2= "alpha";
System.out.println(s1.equals(s2));
     
             // uses object class equals() mehtod.    


StringBuffer sb1 = new StringBuffer("pardeep");
StringBuffer sb2 = new StringBuffer("pardeep");
System.out.println(sb1.equals(sb2));

}
}
/*
output:
F:\java by dragon\java programms\string manipulation>javac "Equals()_in_String.java"

F:\java by dragon\java programms\string manipulation>java Equals_in_string

false
true
false
*/

// showing you object class equal() method
/*

class Object
{
public boolean equals()

{

return "reference-comparsion"
// based on reference comparison return boolean type value
}


// string class contains overriden equals() methods

class String extends objects
{

// overriding equals() method

public boolean equals()
{ 
 return "content comparison then return that value based on comparison";
}



//stringbuffer class just uses the object class equals() method.

class StringBuffer extends Object // simple
{
// just extending equals() method form object class 
// not performing overriding operation

}
*/


























