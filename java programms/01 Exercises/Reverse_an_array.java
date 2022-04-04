//how to reverse an array
import java.util.Arrays;
class Reverse_an_array
{
public static void main(String []args)
{
int[] my_array= {1789, 2035, 1899, 1254, 1472, 2365, 1456, 2165, 1457, 2456};

System.out.println("original array  "+ Arrays.toString(my_array));
int temp;
for(int i = 0; i<my_array.length/2; i++)
{
temp =my_array[i];
my_array[i] = my_array[my_array.length-1-i];
my_array[my_array.length-1-i]=temp;
}

System.out.println("reverse array   "+ Arrays.toString(my_array));
}
}
/*output:

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java Reverse_an
_array.java
original array  [1789, 2035, 1899, 1254, 1472, 2365, 1456, 2165, 1457, 2456]
reverse array   [2456, 1457, 2165, 1456, 2365, 1472, 1254, 1899, 2035, 1789]
*/