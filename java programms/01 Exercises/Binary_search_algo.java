// selection short

import java.util.*;
class Binary_search_algo
{
public static void main(String []args)
{
ArrayList<Integer> al = new ArrayList<> ();
al.add(34);
al.add(24);
al.add(4);
al.add(45);
al.add(3);
al.add(14);
al.add(7);

System.out.println(al);
Collections.sort(al);
System.out.println("shorted collection  "+al);

Integer[] num = new Integer[al.size()];
System.out.println(num.length);

al.toArray(num);
System.out.println("shorted array "+Arrays.toString(num));

Scanner scan = new Scanner(System.in);
System.out.println("enter the no you want to search form above array");

int item =scan.nextInt();



int low=0;  // lower index
int high= num.length-1;   // last index value
int mid=0;      // middle value
mid =(low+high)/2;
int check =0;
while(low<=high) // till when to perform the operations
{
if(num[mid] ==item)
{

System.out.println("searched item is present at "+ mid+ "  index");
check= check+1;
break;}
else if (num[mid]<item)
{
low = mid +1;
}
else
{
high= mid-1;
}
mid=(low+high)/2;
}

if (check==0)
System.out.println("item is not present in given array");
}
}

