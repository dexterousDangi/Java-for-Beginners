// Array in java: used to store the group of elements, these elements
// must be homogenous, and fixed number.

// we can't alter the size of an array after creation , array is fixed length data structure
// to reterive and store the elements array is always index based.
// index always starts from zero.0
// index = array length - 1;


/* 
there are different approaches to create an array.
first:
------
int []a ; decleration ,which type of array
a= new int[5]; instantiaiton, telling it size here it is 5

a[0]=10;  intialization , here at index zero, we have element 10.
a[1]=20;
a[2]=30;
a[3]=40;
a[4]=50;

second approach:
------------------
int [] a ={10,20,30,40,50};
	// all the three steps in one line of code(decleration, instantiation, intialization)

*/

class First_array_example
{
public static void main(String [] args)
{
int []a={10,20,30,35,45,96};

			// one way to print the array elements using index value

System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);
System.out.println(a[3]);
System.out.println(a[4]);
System.out.println(a[5]);

System.out.println("length of the array is -->"+a.length);

		// we can print the array elements using for loop
for (int i=0; i<a.length;i++)
{
System.out.println(a[i]);
}

System.out.println("length of the array is -->"+a.length);

		// we can also print the array elements using for-each loop
for (int aa:a)
{
System.out.println(aa);
}

System.out.println("length of the array is -->"+a.length);

}
}


/*output:


F:\java by dragon\java programms\java basic applications>javac First_array_example.java

F:\java by dragon\java programms\java basic applications>java First_array_example

10
20
30
35
45
96
length of the array is -->6
10
20
30
35
45
96
length of the array is -->6
10
20
30
35
45
96
length of the array is -->6
*/