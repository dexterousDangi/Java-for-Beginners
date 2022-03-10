// how to print the index values which contains null data



class Emp     
{
int eid;
String ename;
Emp(int eid, String ename)
{
this.eid=eid;
this.ename=ename;
}
}

class Printing_index_ofArray
{
public static void main(String []args)
{
Emp i1= new Emp(111,"dangi");
Emp i2= new Emp(222,"sam");
Emp i3= new Emp(333,"duhan");

Emp [] e = new Emp[8];  // array of size 8

e[3]=i1;
e[5]=i2;
e[7]=i3;

System.out.println("Index values of Array where Null data is present:");

for (int i=0; i<e.length;i++)
{
if (e[i]==null)
{
System.out.println(i);

}
}
}
}

/*
output:

F:\java by dragon\java programms\java basic applications>javac Printing_IndexValue_of_Null_elements.java

F:\java by dragon\java programms\java basic applications>java Printing_index_ofArray

Index values of Array where Null data is present:
0
1
2
4
6

*/