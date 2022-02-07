/* Static blocks: depends upon the loading of ".class" file
which is done only once in the execution, therefore we can 
say that "static block" only executed once and only while 
class loading time*/


class Iota
{
 // declare an instance block
{
System.out.println("instance block can be executed more than once");
}

// declare a static block

static
{
System.out.println("static block only executed once");
}

//declare a constructor here

Iota ()
{
System.out.println("constructor here");
} 
// another constructor with one argument

Iota ( char ch)
{
System.out.println("one agr cost   "+ch);
}

public static void main(String []args)
{
new Iota();
 new Iota('d');
System.out.println("main method");
}
}

// instance block will automatically be called when ever you create a object.
//static blocks memory is allocated during class loading.
// form main method, static block, instance block and constructors
// first static block is executed then main method then instance block and then constructors.
