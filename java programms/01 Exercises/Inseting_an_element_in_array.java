// inserting an element in an array


import java.util.Arrays;
class Inseting_an_element_in_array
{
public static void main(String []args)
{
int [] array ={34,35,36,6,2,56,21,6,7,};

System.out.println(Arrays.toString(array));
int indexat=3; 
int addedterm=78;

for(int i= array.length-1; i>indexat;i--)
{
array[i]=array[i-1];   // moving an array element by one index at time;
}
array[indexat]= addedterm;  // and them add the element at specified index;

System.out.println(Arrays.toString(array));
}
}


/*output:


F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>javac Inseting_an_element_in_array.java

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java Inseting_an_element_in_array

[34, 35, 36, 6, 2, 56, 21, 6, 7]
[34, 35, 36, 78, 6, 2, 56, 21, 6]

*/
