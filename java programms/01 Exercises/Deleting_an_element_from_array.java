// how to delete an element from an array

import java.util.Arrays;
class Deleting_an_element_from_array
 {
 
public static void main(String[] args) 
{
   int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   
System.out.println("Original Array : "+Arrays.toString(my_array));     
   
int removeIndex = 1;

for(int i = removeIndex; i < my_array.length -1; i++)
{
my_array[i] = my_array[i + 1];
}
System.out.println("deleted array   :"+ Arrays.toString(my_array));


// how to copy an array into different array

int [] copy= new int[my_array.length];

for(int i =0; i<my_array.length; i++)
{
copy[i]=my_array[i];
}

System.out.println("copied array   :"+ Arrays.toString(copy));
}
}

/*output:

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>javac Deleting_an_element_from_array.java

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java Deleting_an_element_from_array

Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
deleted array   :[25, 56, 15, 36, 56, 77, 18, 29, 49, 49]
copied array    :[25, 56, 15, 36, 56, 77, 18, 29, 49, 49]

*/