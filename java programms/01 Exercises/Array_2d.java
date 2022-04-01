// 2d arrays-
import java.util.*; 
 class Array_2d

{

	public static void main(String[] args)
 {

	int a [][]= new int [3][2];
	
       a[1]= new int []{1,2,3};

	a[2] = new int []{4,5};

	a[0][1]=3;
	System.out.println(a.length);

	try
{
 System.out.println(a[0].length);
	
 }
catch (NullPointerException np)
{
System.out.println("null");}
   System.out.println(Arrays.deepToString(a));

	}
}
