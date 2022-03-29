// count the duplicate characters in a string 


import java.util.*;
class Duplicate_characters_in_a_word
{
static void duplicateInWords(String str)
{
System.out.println(str+" "+str.length());

HashMap<Character,Integer> hm = new HashMap<>();

for(int i =0; i<str.length();i++)
{
char ch = str.charAt(i);
//System.out.println(ch);

if(hm.get(ch)!=null)
{
hm.put(ch,hm.get(ch)+1);
}
else
{
hm.put(ch,1);
}
}
//System.out.println(hm);
Iterator itr = hm.keySet().iterator();
while(itr.hasNext())
{
char c =(char)itr.next();
if(hm.get(c)>1)
{
System.out.println("character-- "+c+" ---appeard  --"+hm.get(c)+"--times");
}
}
}
public static void main(String []args)
{
Scanner scan = new Scanner(System.in);
System.out.println("enter you name");
String strng =scan.nextLine();
duplicateInWords(strng);
}
}

/*
OUTPUT:

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>javac Duplicate_characters_in_a_word.java

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java Duplicate_characters_in_a_word

enter you name
BILLU
BILLU 5
character-- L ---appeard  --2--times

*/