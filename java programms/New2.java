// use of this and super keywords

/*
class Parent 
{ int a =43; 
int b=3;}

class Child extends Parent
{ int x= 24;
int y=33;
void add (int i, int j)
{
System.out.println(i+j);  //local variables
System.out.println(x+y);  // current class variables
System.out.println(a+b);   // super class variables
}
public static void main(String []args)
{
new Child().add(5,45);
}
}
*/



/*
output:
50
57
46
*/


/* 
class Parent 
{ int a =43; 
int b=3;}

class Child extends Parent
{ int a= 24;
int b=33;
void add (int a, int b) // preference will always be given to local variables
{
System.out.println(a+b);  //local variables
System.out.println(a+b);  // current class variables
System.out.println(a+b);   // super class variables
}
public static void main(String []args)
{
new Child().add(5,45);
}
}
output:
50
50
50
*/
//  the complier don't know which variable is which i.e., local, current, super class variable
// to overcome such problems we use this and super keywords.


class Parent 
{ int a =43; 
int b=3;}

class Child extends Parent
{ int a= 24;
int b=33;
void add (int a, int b) // preference will always be given to local variables
{
System.out.println(a+b);  //local variables
System.out.println(this.a+this.b);  // current class variables
System.out.println(super.a+super.b);   // super class variables
}
public static void main(String []args)
{
new Child().add(5,45);
}
}


/*output:
50
57
46
*/

// if these variables have different names then we did not use such keywords
// programm will automatically works fine by it self.




































