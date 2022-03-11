class Array_Assignment
{
public static void main(String []args)
{
int [] a = { 10,20,30,40,50};
int sum =0;
int temp =0;

for (int i=0; i<a.length;i++)
{
sum=sum+ a[i];
temp =sum;
}
int k;
System.out.println("array size  :"+ (k=a.length));

System.out.println("sum of all array elements :"+temp);
}
}