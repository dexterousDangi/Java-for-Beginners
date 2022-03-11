// printing array elements at odd and even places seperately.

class Elements_at_even_and_odd_index
{
public static void main(String [] args)
{
String [] s1={"aaa", "bbb", "ccc", "ddd", "eee"};
System.out.println("elements of the string array");
for(String s2:s1)
{System.out.println(s2);}

System.out.println();

System.out.println("elements at even index value:");
for(int i=0; i<s1.length;i=i+2)
{System.out.println(s1[i]);}

System.out.println("elements at odd index value:");
for (int j=1; j<s1.length;j=j+2)
{System.out.println(s1[j]);}
}
}
/*output:


F:\java by dragon\java programms\java basic applications>javac Elements_at_even_and_odd_index.java

F:\java by dragon\java programms\java basic applications>java Elements_at_even_and_odd_index

elements of the string array
aaa
bbb
ccc
ddd
eee

elements at even index value:
aaa
ccc
eee
elements at odd index value:
bbb
ddd