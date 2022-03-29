// printing duplicate string and character

import java.util.*;
class Printing_duplicates
{
static void printTheDuplicates(String str)
{
System.out.println("the string we have--->"+str);

TreeMap<String,Integer> hm= new TreeMap<> ();

String [] s =str.split(" ");

System.out.println(Arrays.toString(s));

for (String ss:s)
{
if(hm.get(ss)!=null)
{
hm.put(ss,hm.get(ss) +1);
}
else
{
hm.put(ss,1);
}
}
System.out.println(hm);

/*
Set<Map.Entry<String,Integer>> set =hm.entrySet();
Iterator<Map.Entry<String,Integer>> itr =set.iterator();
while (itr.hasNext())
{
Map.Entry<String,Integer> ent=(Map.Entry)itr.next();
if(ent.getValue() >1)
{
System.out.print(" "+ent);
}
}
*/
//or

Set<String> set =hm.keySet();
Iterator itr = set.iterator();
while(itr.hasNext())
{
String skey=(String)itr.next();
if (hm.get(skey)>1)
{System.out.println("the word-->"+ skey+ "<---appred --"+ hm.get(skey)+ "--times");
}
}

}
public static void main(String []args)
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter your string here:");
String stng = scan.nextLine();
printTheDuplicates(stng);

}
}




/*output: F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>javac Printing_duplicates.java


F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>javac Printing_duplicates.java

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java Printing_duplicates

Enter your string here:

yanda yanda yanda ale ale al al

the string we have--->yanda yanda yanda ale ale al al

[yanda, yanda, yanda, ale, ale, al, al]

{al=2, ale=2, yanda=3}

the word-->al<---appred --2--times

the word-->ale<---appred --2--times
the word-->yanda<---appred --3--times

*/