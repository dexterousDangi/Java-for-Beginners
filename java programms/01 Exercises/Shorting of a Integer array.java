// shorting of Integer array.

import java.util.*;
class shorting 
{
public static void main(String []args)
{
Scanner sc = new Scanner (System.in);

System.out.println("enter the array size you want:");

int g = sc.nextInt();

System.out.println("array size selected:  "+g);

int []a = new int[g];

System.out.println("enter the array elements-->");

for (int i=0;i<g;i++)
{
a[i]=sc.nextInt();
}

String[] my_array2 = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};
        
System.out.println("Original numeric array : "+Arrays.toString(a));
Arrays.sort(a);
System.out.println("Sorted numeric array : "+Arrays.toString(a));
   
System.out.println("Original string array : "+Arrays.toString(my_array2));
Arrays.sort(my_array2);
System.out.println("Sorted string array : "+Arrays.toString(my_array2));
}
}
/*
F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java shorting
enter the array size you want:
3
array size selected:  3
enter the array elements-->
23
23
4
Original numeric array : [23, 23, 4]
Sorted numeric array : [4, 23, 23]
Original string array : [Java, Python, PHP, C#, C Programming, C++]
Sorted string array : [C Programming, C#, C++, Java, PHP, Python]

*/


