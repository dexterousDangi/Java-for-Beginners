class Team
{

int eid;
String ename;
float esal;

Team()
{ System.out.println("first zero arguemnt constructor");
eid =45;
ename= "Dragon";
esal = 5463434.3f;
}
Team()
{
 System.out.println("second zero arguemnt constructor");
} 

int disp(int a , int b)
{
System.out.println("employee id " +eid);
System.out.println("employee name" +ename);

System.out.println("employee salary  "+esal);
return 6;

}
public static void main (String []args)
{ 
new Team().disp(4,5);
}
}