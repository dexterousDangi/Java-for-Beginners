// basic regarding the toString() method:
// whenever we are printing a reference variable it is internally called toString() method.
// or say toString () is called or executed whenever we print a reference variable


class TostringExample
{
public static void main(String []args)
{
TostringExample t = new TostringExample();

System.out.println(t);  // internally it is calling toString() method

System.out.println(t.toString());

}          // both sop statments are equal

}

/*output: both are printing same data or hexadecimal value or hash code

F:\java by dragon\java programms\string manipulation>javac "ToString()Example.java"

F:\java by dragon\java programms\string manipulation>java TostringExample

TostringExample@4617c264 

TostringExample@4617c264
  
*/

//t.toString() ---> this statment logically means toString() method is present in 
//current class of which we hava create object and with the help of reference variable
// we are calling tostring() method. but there is no such method is present, then the logic behind is this:
// as we know the root class of every class present in java is "object class" 
// that "object class" contains a 'toString()' method and that is printed whenever we try to print a reference variable
// as we know the object is by default extends in every class.

// object class contains toString method
/* class Object
{
public String toString()
{
return "class-name@";
}
}