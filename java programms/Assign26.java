/* instance blocks: used to write the logic and to initialize the variable
  basic problems
*/

class Block
{
Block(int a)
{
System.out.println("this is a constructor...."+a);
}
// here comes the instance block 
{
System.out.println("1st instance block");
}
// another instance block
{
System.out.println("2nd instance block:");
}

//herer instance block is closed

// instance block is executed during object creation.

public static void main(String []args)
{
System.out.println("this is main method");

Block b = new Block(21); // one way of creating object known as named object approach

new Block(56);  // another way of creating object known as nameless approach.
new Block(9);
}
}
 // use name less approach to reduce the length of the code.
// all the instance block is executed first then the constructors.