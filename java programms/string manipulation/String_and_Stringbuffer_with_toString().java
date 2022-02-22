// string class and stringbuffer class

class Info_strings

{
public static void main(String []args)
{
String s1="dangi";
                            //both statments are correct.
System.out.println(s1);
System.out.println(s1.toString());
                                // as per-rules we are printing a reference variable 
                                 // it will be calling toString() method internally, and some hash code has to be printed   
                                 // but it will print the string object

                           //s1.toString(), means it will first check in the String class (whose reference variable we are using)
                           // is there any toString() method present, if yes,it will call/execute that method otherwise it will print object class toString() method 
                            // which is by default action of jvm 
    
StringBuffer sb = new StringBuffer("DANGI");
System.out.println(sb);
System.out.println(sb.toString());
}
} 
/*output:
F:\java by dragon\java programms\string manipulation>javac String_and_Stringbuff
er.java

F:\java by dragon\java programms\string manipulation>java Info_strings
dangi
dangi
DANGI
DANGI
*/
  
// in this application when we print the reference varialbe  it will not print the 
// hash code , but it will print the object in corresponding string and stringbuffer class
 
//output has to be Object class toString() method
//which contains only return statment and always returns class-name@hashcode

/*
class Object
{
public String toString()
{
return "class-name@hashcode";
}
}

class String extend Object  // every class's root class in java is Object class if you extends it  or not

{

    // String class all ready contains toSting() method and overriding that method
	//toSting() method and overriding that method    
	// here String class providing own implementations for tostring() method

public String toString()
{
return "content of the string objects";
}
}

class StringBuffer extend Object  // every class's root class in java is Object class if you extends it  or not

{

    // StringBuffer class all ready contains toSting() method and overriding that method
	//toSting() method and overriding that method    
	// here StringBuffer class providing own implementations for tostring() method

public String toString()
{
return "content of the stringBuffer  objects";
}
}

// because of this backend mechanism we are getting our string object printed when
// we print the reference variable with or without toString() method of the string class
// because the basic rule of java says that whenever you print the reference variable it will internally call the toString() method.

*/


 