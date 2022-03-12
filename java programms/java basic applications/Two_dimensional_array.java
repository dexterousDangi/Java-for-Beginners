// about 2-D array 

class Two_dimensional_array
{
public static void main(String []args)
{
 	// syntax of 2d arrays: int [][]a
	// one "[]" for row and "[]" for colomn


	   //    0          1           index values of row
int [][]a ={{10,20,23},{50,60,40}};
           // 0  1  2   0   1  2         index values of colomn


	// how to print the data ,by providing the row and colomn index

System.out.println(a[0][2]);
System.out.println(a[0][1]);
System.out.println(a[0][0]);
System.out.println(a[1][2]);

System.out.println(a[1][1]);

}
}

/*output:

F:\java by dragon\java programms\java basic applications>javac Two_dimensional_array.java

F:\java by dragon\java programms\java basic applications>java Two_dimensional_array

23
20
10
40
60

*/  