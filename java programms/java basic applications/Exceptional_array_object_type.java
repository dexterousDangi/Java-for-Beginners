// there is one exception in java arrays

//How Array in java can be homogeneous when we are allowed
// to create heterogeneous Array using Object class? 

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

class Student
{
int sid;
String sname;
Student(int sid, String sname)
{
this.sid=sid;
this.sname=sname;
}
}


class Exceptional_array_object_type
{
public static void main(String [] args)
{
Object []o=new Object[3];
 
Emp e= new Emp(111, "dang");
Student s= new Student(99,"tom");
Integer x= Integer.valueOf(240);
 
o[0]=e;
o[1]=s;
o[2]=x;

for(Object oo:o)
 {     
		// if object array contains different types of object data, then
		// always uses "instanceof" operator to check the corresponding data belong to particular class ojbect type

if (oo instanceof Emp)
{  
		// if oo contains instance of Emp then perform "type casting" to reterive the data.
Emp ee =(Emp)oo;
System.out.println(ee.eid+"----"+ee.ename);
}
if (oo instanceof Student)
{			//// if oo contains instance of Student then perform "type casting" to reterive the data.
Student ss = (Student)oo;
System.out.println(ss.sid+"----"+ss.sname);
}
 if (oo instanceof Integer)
{
System.out.println(oo);   // in the case of wrapper classes object we don't need to perform typecasting 
			// because it internally calling tostring() method and that will return the wrapper class data
}
}
}
}

/*
output:

F:\java by dragon\java programms\java basic applications>javac Exceptional_array_object_type.java

F:\java by dragon\java programms\java basic applications>java Exceptional_array_object_type

111----dang
99----tom
240

*/