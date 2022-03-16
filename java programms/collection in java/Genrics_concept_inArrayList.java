//as we know arrays are type safe , but array list are not type safe
// think of arraylist containing 100's of objects and we have to retrieve the 
// data form the arraylist object, but we dont know which object contains which type of data 
// and for that we have to use instanceof operator for every time the loop runs and have
// to perform type casting process . and its a hacktic process for long program codes having 1000's of objects
// to resolve the problem java introduced a concept in java 1.5 version also known as tiger version
// the concept was "Genrics" ---> used to provide type safety of collection framwork 
// and autoboxing concept was also introduced in java 1.5
// for each loop was also introduced in java 1.5.
// before that collection was not used in the real time project , but 
// after tiger version it becomes a great concept and get used for real world projects

// syntax for Genrics : we use angular braces (< >) after the Arraylist name at the time of creation of arraylist
// to specify the type of ArrayList , like this arraylist contains only Emp class objects only
// and we can print the data like we did in the array [] directly without using instanceof or type casting  
// we can use the instanceof operator for just once to neglact the NullPointerException


import java.util.ArrayList;

class Genrics_concept_inArrayList
{
public static void main(String [] args)
{
Emp e1= new Emp (232, "dangi");
Emp e2= new Emp (22, "dangi");
Emp e3= new Emp (23, "dangi");

ArrayList<Emp> al = new ArrayList<Emp>();  // now it will behave like userdefined array not arraylist.

al.add(e1);
al.add(e2);
al.add(e3);

for (Emp ee:al)
{
System.out.println(ee.eid +"<----"+ee.ename);
}
}
}

/*
output: now there comes no warning because the type safety issue is resolved.

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Genrics_concept_inArrayList.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Genrics_concept_inArrayList

232<----dangi
22<----dangi
23<----dangi
*/