// about main method
// command line argumentds : these arguments are passed during runtime in a 
// particular syntax: (java "space"  .java file_name "space" arguments you like to pass)


class Taw
{
public static void main(String []args)
{
System.out.println(args. length);  // to find the length of the array
System.out.println(args[0]);    // to print out the first argument in the array
System.out.println(args[1]);     // to print out the second argument in the array
System.out.println(args[1]+args[0]); // addition/concatination of two arguments
}
}

// before compilation you have to pass the arguments

/* output:

F:\java by dragon\java programms> javac New34.java

F:\java by dragon\java programms>java Taw 4 5 8 3 7
5   ---> length of the array
4   ---> first argument
5   ---> second argument
54   ---> performed concatination here

*/