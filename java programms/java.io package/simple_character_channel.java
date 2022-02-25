// character oriented channel: everything is same as byte oriented channels execpt classes used for channel creation
// FileReader and FileWriter class
// return type of read() method is interger type
// it read a single character by its unicode value and write that single character using corresponding unicode values 
// then againg reads the single charater  and write it , againa and againg untill fr.read() has value equal to -1, and jvm exits the loop


import java.io.*;

class Channel_char_oriented
{

public static void main (String [] args) throws FileNotFoundException, IOException
{

FileReader fr = new FileReader ("abc.txt");  // return type is byte  same as the fileInputStream method
FileWriter fw = new FileWriter("lmn.txt");

int c;

while((c=fr.read())!=-1) //condition is only true, when there is some characters present in the   
			 // read the data untill we reach the end of the stream
{
		// here we are printing the data holds by c also, and also performing type casting
		// converting "int c" into "char c"

System.out.println(c +"--->"+(char)c) ;
fw.write(c);
}
  //close the channels now

fr.close();
fw.close();
}
}

/*output:

F:\java by dragon\java programms\java.io package>javac simple_character_channel.java

F:\java by dragon\java programms\java.io package>java Channel_char_oriented
112--->p
97--->a
114--->r
100--->d
101--->e
101--->e
112--->p
44--->,
32--->
116--->t
104--->h
105--->i
115--->s
32--->
102--->f
105--->i
108--->l
101--->e
32--->
105--->i
115--->s
32--->
102--->f
111--->o
114--->r
32--->
101--->e
120--->x
112--->p
101--->e
114--->r
105--->i
109--->m
101--->e
110--->n
116--->t
46--->.
13--->
10--->

116--->t
111--->o
32--->
117--->u
115--->s
101--->e
32--->
116--->t
104--->h
105--->i
115--->s
32--->
102--->f
105--->i
108--->l
101--->e
32--->
105--->i
110--->n
32--->
116--->t
104--->h
101--->e
32--->
106--->j
97--->a
118--->v
97--->a
32--->
105--->i
111--->o
32--->
112--->p
97--->a
99--->c
107--->k
97--->a
103--->g
101--->e
32--->
97--->a
110--->n
100--->d
32--->
99--->c
104--->h
97--->a
110--->n
110--->n
101--->e
108--->l
32--->
99--->c
111--->o
110--->n
99--->c
101--->e
112--->p
116--->t
13--->
10--->
*/