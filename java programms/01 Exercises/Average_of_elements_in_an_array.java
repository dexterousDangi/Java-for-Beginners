//Average of the int array elements

class Average_of_elements_in_an_array
{

static void averageOfArray(float [] a)
{
float b = a.length;
float sum=0;
System.out.println("total entities in the array-->"+b);
for(int i=0; i<b; i++)
{
 sum = sum+a[i];
}
System.out.println("sum of the array elements is " + sum);
float avg = sum/b;
System.out.println("average of array elements is "+avg);
}


public static void main(String []args)
{
float [] age = {2,2,2,2,2,2,2,2,2,2,3};
averageOfArray(age);
}
}

/*output:

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>javac Average_of_elements_in_an_array.java

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java Average_of_elements_in_an_array

total entities in the array-->11.0
sum of the array elements is 23.0
average of array elements is 2.090909
*/