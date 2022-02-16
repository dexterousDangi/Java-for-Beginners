/* variable type in java
there are three type of variable 
in java,
every variable in java is of specific type
variable could be int type, array type,
string type, class type or enum type etc.
*/
// eg. of local variable(which are declaried in the method or constructor or blocks.
//scope or permission of local variable is restricted within the declared method or blocks
class Variables
{
public static void main(String []args)// memory allocated to variable when method starts
{
int a =10;
int b=20;   //both a and b are local variable
System.out.println(a+b); // logic here
}       // memory released when method is completed
}
 //local variable stored in the stack memory.