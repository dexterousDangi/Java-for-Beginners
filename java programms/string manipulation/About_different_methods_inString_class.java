// About length variable and length() method
//length--> it is a varialbe used to find out the length of the an array
// length()--> it is a method used to find out the length of the string

//charAt() method: to print the character at a particular location.
// according to this method counting starts from 0.

//indexOf() method: will tell you the index no in the array of particular character in a string

//lastIndexOf() method: will give you the index of required character last occuring in string

// contains() method: will give the boolean return , and tell you that particluar data/char/string present in the given or entered data


//startsWith() method: will give the boolean return, and tell you that a particular string starting with entered data or not. if your data and string starting data matched then it will return true otherwise false.

//endsWith() method: will match the user entered data with respective data and tell you string ending with corresponding data or not

//toUpperCase() and toLowerCase() method: to convert the particular data into upper case or lower case

// trim() method: will remove the space at the starting and at the ending of the string
 // if you at the same time want to find the length of the resultant string use length() method with trim() at the same time.

// sb.trim().length(): this will first trim the space and then calculate the string length.

//substring() method: this method will print the string from given index of array of string onwards only
//and you can also provide the range means a starting index and ending index and inbetween string will be printed or say one less than ending index(because it does not include the ending index value)
class Calculate_length
{
public static void main(String []args)
{
int[] a = new int[156];
System.out.println(a.length);

String s= "pardeep_dangi";
System.out.println(s.length());


System.out.println(s.charAt(0));
System.out.println(s.charAt(8));

System.out.println(s.indexOf('d'));

System.out.println(s.lastIndexOf('p'));

System.out.println(s.contains("e"));
System.out.println(s.contains("ngi"));

String st = "afjaghepoi5";
System.out.println(s.startsWith("afj"));
System.out.println(st.startsWith("afj"));


System.out.println(st.endsWith("oi5"));

System.out.println(st.toUpperCase());

System.out.println(st.toLowerCase());

String sb="     danm     ";
System.out.println(sb.length());
System.out.println(sb.trim().length());
System.out.println(sb.trim());

//String st = "afjaghepoi5";

System.out.println(st.substring(4));
System.out.println(st.substring(4,9).length());//  
}
}
/*output:

F:\java by dragon\java programms\string manipulation>javac About_all_length.java


F:\java by dragon\java programms\string manipulation>java Calculate_length
156
13
p
d
3
6
true
true
false
true
true
AFJAGHEPOI5
afjaghepoi5
14
4
damn
ghepoi5
ghepo



*/