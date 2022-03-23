// ABOUT HASHMAP AND LINKEDHASHMAP 
// there is only one major difference between these two that is
// hashmap did not maintain insertion order 
// while linkedhashmap maintain insertion order



import java.util.*;
class Difference_between_HashMap_and_LinkedHashMap{
public static void main(String []args){
HashMap h1 = new HashMap();
h1.put(3, "nimo");
h1.put(23,"neo");
h1.put(9,"leso");
h1.put(13, "rama");
System.out.println(h1);
LinkedHashMap ls= new LinkedHashMap();
ls.put(1, "nei");
ls.put(2, "moto");
ls.put(3,"maya");
ls.put(4, "zaya");
System.out.println(ls);
}
}

/* output:

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Difference_between_HashMap_and_LinkedHashMap

{3=nimo, 23=neo, 13=leso, 9=rama}
{1=nei, 2=moto, 3=maya, 4=zaya}
*/