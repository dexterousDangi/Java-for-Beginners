// Linear search algorithm


import java.util.Arrays;
class Linear_Search_algo
{
public static void main(String []args)
{
int []a = {2,424,424,23,55,36,433,5,64,8};
System.out.println(a.length);

System.out.println(Arrays.toString(a));
int item = 51;
System.out.println("searched integer  "+item); 
int temp =0;

for(int i=0; i<a.length; i++)
{
if(a[i] ==item)
{
System.out.println("element present at "+ i + " index");
temp= temp +1;
}
}
if(temp ==0)
System.out.println("item not present in array");

String []str={"ram", "mohan", "noha", "naman", "rohan", "amit", "amol"};
System.out.println(Arrays.toString(str));
String srch = "naman";
System.out.println("searched string   "+srch);
int temp1=0;

for(int i=0; i<str.length; i++)
{
if (str[i].equals(srch))
{
System.out.println("string present at "+i+" index");
temp1=temp1+1;
}
}
if(temp1==0)
System.out.println("string not present in the given array");
}
}

/*output:

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java Linear_Search_algo

[2, 424, 424, 23, 55, 36, 433, 5, 64, 8]
searched integer  5
element present at 7 index

[ram, mohan, noha, naman, rohan, amit, amol]
searched string   naman
string present at 3 index

*/