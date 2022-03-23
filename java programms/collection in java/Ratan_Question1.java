// Question : creat a treeset , insert the stringbuffer data into that treeset object.
// and checkout that the treeset performs the sorting or not.


// main problem occure when we enter string class data as well as stringbuffer class data, that problem we will solve in next application

import java.util.*;
class Ratan_Question1
{
public static void main(String []args)
{

//TreeSet t = new TreeSet();   // FOR FIRST OUT JUST USE THIS LINE AND FOR SECOND OUTPUT SECOND LINE WHICH IS USING CUSTOMIZED SORTING OR SAY COMPARATOR INTERFACE

TreeSet t = new TreeSet(new MyComp());
t.add(new StringBuffer("mohit"));
t.add(new StringBuffer("dangi"));
t.add(new StringBuffer("alele"));

System.out.println(t.descendingSet());   //you can directly print the reverse of the treeset using this line or say using "descedingSet()" method
}
}



//during ratan time stringbuffer doesnt implements comparable internally so this application generate the runtime exception saying class cast exception.
// to resolve that situation we must use customized sorting for that we must use comparator interface 
// and write the sorting logic in different class and that class must implements comparator interface 
// and then pass that interface object in the treeset constructor while creating treeset.


// use this interface as an option for customized sorting .like reversing the string which is not provided by a


class MyComp implements Comparator<StringBuffer>
{
public int compare(StringBuffer sb1, StringBuffer sb2)
{
String s1= sb1.toString(); // for stringbuffer directly sorting is not possible so we must convert stringbuffer into string by using toString() method.
String s2= sb2.toString();
return -(s1.compareTo(s2));  // to print the string reverse use negative (-) sign after the return statement.

}
}



/*output: USING DEFAULT COMPARABLE INTERFACE PREDEFINED 

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Ratan_Question.java

Note: Ratan_Question.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Ratan_Question

[alele, dangi, mohit]

*/

/* OUTPUT: USING CUSTOMIZED SORTING USING COMPARATOR INTERFACE

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Ratan_Question.java

Note: Ratan_Question.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Ratan_Question

[mohit, dangi, alele]
*/
