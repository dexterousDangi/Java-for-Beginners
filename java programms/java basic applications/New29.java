// odject cloning: used to maintain backup of the data at earlier stage 
// to create a class duplciate object, first you "implements Cloneable" interface

/* normal example: 


class Test 
{
int a = 12; int b=3;
public static void main(String []args)
{
Test t=new Test();

System.out.println(t.a);
System.out.println(t.b);
 
t.a=23;
t.b=32;
System.out.println(t.a);
System.out.println(t.b);
 
t.a=34;
t.b=324;
System.out.println(t.a);
System.out.println(t.b);
*
*
*
*
*likewise, we performed many modification into "t" object
*

//now we want to print earlier values of a=23 and b=32
// it could only be possible if we have done "object cloning" earlier
// or when , the value of a=23 and b=32
}
}
*/

// cloned object Syntax: class_name duplicate_object_name= (class_name) old_object_name.clone(); 
// syntez example: Test t1 = (Test) t.clone();
//t.clone();  -- means clone the object t
// return type of clone() is object t,
// perform type casting -- (Test) t.clone();   make it a object of Test class
// now store these values into duplicate object t1 of class Test
// Test t1= (Test) t.clone();


// to create a class duplciate object, first you "implements Cloneable" interface


class Test implements Cloneable
{
int a = 12; int b=3;
public static void main(String []args) throws Exception
{
Test t=new Test();

System.out.println(t.a);
System.out.println(t.b);
 
t.a=23;
t.b=32;
System.out.println(t.a);
System.out.println(t.b);

 Test t1=(Test)t.clone(); // object cloning

t.a=34;
t.b=324;
System.out.println(t.a);
System.out.println(t.b);


           // here i want to print earlier values of a and b, so use duplicate object to call the old variables value

System.out.println(t1.a);
System.out.println(t1.b);
}
}


/*output:

F:\java by dragon\java programms>java Test
12
3
23
32
34
324
23
32
*/


























