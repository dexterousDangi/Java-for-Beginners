// Insertion sort Algorithm: sorting starts from first index value.


import java.util.*;

class Inerstion_sort_algorithm
{
public static void main(String []args)
{
int [] num= {32,53,453,424,53,23,5,23,22,34};
System.out.println("given array  "+ Arrays.toString(num));

int temp, j;
for(int i = 1; i<num.length; i++)
{
temp=num[i];
j=i;  // so that for loop don't get distorted

while (j>0 && num[j-1]>temp)
{
num[j]= num[j-1];
j= j-1;
}
num[j]= temp;
}
System.out.println("sorted array  "+ Arrays.toString(num));
 }
}


/*output:


F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java Inerstion_sort_algorithm

given array  [32, 53, 453, 424, 53, 23, 5, 23, 22, 34]

sorted array  [5, 22, 23, 23, 32, 34, 53, 53, 424, 453]
*/