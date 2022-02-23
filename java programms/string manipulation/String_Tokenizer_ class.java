//string tokenizer class = it's a legacy class means it is present in java.util package(means you have to import it) 
// it is introduced in java 1.0 , it has by default spliting character is space symbol.
// from java 1.2 , split() method is introduced and string tokenizer class become obslete.
// its main use was to split the string into tokens.

// stringbuilder class is same as stringbuffer class expect for one difference that is 
// stringbuilder is asynchronized as stringbuffer is synchronized in nature 
// it means stringbuilder is not thread safe but the performence is increased as compare to stringbuffer class.
 // it is present in  java.lang package.

import java.util.*;

class Tokenizer_string

{
public static void main(String[]args)
{
StringTokenizer st = new StringTokenizer("hi i'm dang here");

		// before printing the tokens check whether stringtokenizer contains string/tokens or not
		// by using hasMoreElements() method
		// if it contains tokens it return true.

while(st.hasMoreElements())
{
System.out.println(st.nextElement()) ;
}

		// you can also chose the spliting character by passing required character at 
		// the end of the constructor parameters list within double quoets ""
		// it also didn't print the spliting character.
StringTokenizer st1 = new StringTokenizer("hello my name is manjeet","m");


while(st1.hasMoreElements())
{
System.out.println(st1.nextElement()) ;
}

}
}

/*output:


F:\java by dragon\java programms\string manipulation>javac "String_Tokenizer_ cl
ass.java"

F:\java by dragon\java programms\string manipulation>java Tokenizer_string
hi
i'm
dang
here

hello
y na
e is
anjeet

*/