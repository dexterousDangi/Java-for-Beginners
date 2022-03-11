// we can have array type return type and can also pass an array as an argument


class Array_as_arguments_and_return_type
{

int [] m1()	// an array as return type
{
System.out.println("M1 method, array as return type");
int[]a={34,234,53};
return a;
}

void m2(double []d)	// an array as method argument
{
System.out.println("m2 method, array as argument");
for (double dd:d)
{
System.out.println("argument as array  :"+dd);
}

}


public static void main(String []args)
{

Array_as_arguments_and_return_type t= new Array_as_arguments_and_return_type();

// if we call t.m1(), it will return a array type data so store that data into another array and then print it.

int [] a = t.m1();
for (int aa:a)
{
System.out.println("return type data  :"+aa);
}

	// and before calling t.m2() , we have to pass double array type argument so , create a double array then pass the argument

double []dd={23.3,32.34,2342.234,23.234};
t.m2(dd);
}
}
/*output:

F:\java by dragon\java programms\java basic applications>javac Array_as_arguments_and_return_type.java

F:\java by dragon\java programms\java basic applications>java Array_as_arguments_and_return_type

M1 method, array as return type
return type data  :34
return type data  :234
return type data  :53

m2 method, array as argument
argument as array  :23.3
argument as array  :32.34
argument as array  :2342.234
argument as array  :23.234
*/