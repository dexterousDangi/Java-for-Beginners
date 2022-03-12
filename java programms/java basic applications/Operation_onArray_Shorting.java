//About selection short and bubble short operations

class Operation_onArray_Shorting
{ 
public static void main(String []args)
{
int min;
int temp;   // help in swapping array elements

int [] a={ 23,53,2,234,532,23,2,25};
System.out.println("given array is:");
for (int ee:a)
{System.out.print(" "+ee);}
	
// first we perform selection shorting
//-------------------------------------
for(int i=0; i<a.length; i++)
{   
min =i; 		// to prevent loop distortion

for (int j=i+1;j<a.length; j++)
 
     //--------                    always keep in mind that "j"'s value must be one more than i's value.

{
if (a[j]<a[min])
{
min =j;
}
}
	// perform swapping of elements
temp = a[i];
a[i]= a[min];
a[min]=temp;
}
System.out.println();
System.out.println("shorted array:");
for (int eee:a)
{
System.out.print(" "+eee);
}

System.out.println();

int []b={23,42,5,23,4,2,45,222,532,3};
System.out.println("another array on which we perform bubble short");
for (int bb:b)
{
System.out.print(" "+bb);
}


//bubble short 
//-------------
 int temp1;
int flag; // used  prevent the unwanted running of loop when the list is shorted earlier than running all the rounds

for(int k=0; k<b.length; k++)
{
 flag=0;

for (int l=0; l<b.length-1-k; l++)
	    //----------------      most important line in bubble shorting to prevent shorting of shorted elements
{
if (b[l]>b[l+1])
{
	//simply swaping first element with the second one
temp1=b[l];
b[l]=b[l+1];
b[l+1] = temp1;

flag=1;          	// to check if the shorting is going on or done

}
}
if(flag==0)
{
break;
}
}
System.out.println();
System.out.println("shorted array");
for(int bbb:b)
{System.out.print(" "+bbb);}

}
}

/*output:
F:\java by dragon\java programms\java basic applications>javac Operation_onArray_Shorting.java

F:\java by dragon\java programms\java basic applications>java Operation_onArray_Shorting

given array is:
 23 53 2 234 532 23 2 25
shorted array:
 2 2 23 23 25 53 234 532
another array on which we perform bubble short
 23 42 5 23 4 2 45 222 532 3
shorted array
 2 3 4 5 23 23 42 45 222 532
*/
