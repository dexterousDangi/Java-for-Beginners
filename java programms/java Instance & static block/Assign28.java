/*intializing the variables using instance blocks*/

class Emp
{
int eid;  // variable having no initial value

// instance block
// instance block intializing value to the variable during object creation.
{
eid=43;
}
void disp()
{
System.out.println(eid);
}
public static void main(String []args)
{
new Emp().disp();
}
}