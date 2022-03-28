import java.util.*;
class sum_of_all_array_elements 
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

System.out.println(Arrays.toString(a));

int sum=0;
for(int aa : a) 
{
 sum = sum+aa;
}
System.out.println("sum of all elements-->"+sum);

}
}

/*output:

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>javac sum_of_all_array_elements.java

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java sum_of_all_array_elements

enter the array size you want:
5
array size selected:  5
enter the array elements-->
2
3
2
6
7
[2, 3, 2, 6, 7]
sum of all elements-->20
*/