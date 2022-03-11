// Assignment no.2: finding the largest and the smallest no. among the arrays
//----------------

class Largest_and_smallest_in_Array
{
public static void main(String []args)
{
int []a ={-3,2,-4325,3245,2,355,2315,134};

int max= a[0];
int min =a[0];
for (int i=1; i<a.length;i++)   // in this approach "i" is always equals to 1.
{
if(a[i]>max)
{
max=a[i];
}
if (a[i]<min)
{
min=a[i];
}
}
/*
for(int j=1; j<a.length; j++)   // in this approach "i" is always equals to 1.
{
if (a[j]<min)
{
min=a[j];
}
}
*/
System.out.println("all the elements in the array");

for(int ee:a)
{
System.out.println(ee);
}

System.out.println("largest among array elements :"+max);

System.out.println("smallest among array elements :"+min);
}
}

/*output:

F:\java by dragon\java programms\java basic applications>java Largest_and_smallest_in_Array

all the elements in the array

-3
2
-4325
3245
2
355
2315
134
largest among array elements :3245
smallest among array elements :-4325

*/