//java io package: used to read the data form source and write the data at the destination , through a channel which provide 
// network between the source and the destination

// generally, there are two type of channels, 
// byte oriented channel (used to read and write byte oriented data)and character oriented channel(used to read and write charater oriented data)
// byte oriented channel uses FileInputStream class to read and FileOutputStream class to write the data
// character orinted channel uses FileReader class to read and Filewriter class to write.


// we are using J2SE , java io package with that we can only read or write a ".txt " file only

// for .doc and .exl file we need to JAR files(PUI file or etc)


/*
class Channel_details
{
public static void main(String []args)
{
		// create the channel using following class

FileInputStream fis = new FileInputStream("abc.txt"); // read the following file

FileOutputStream fos = new FileOutputStream("xyz.txt"); // write in the following file

int c;   // to store the unicode value returned by read() method of fileinputstream class

//  c=fis.read();  // the return type of read() method is integer(it always return the unicode value of the first character of the readable file)
          // we are storing that interger type unicode value in a integer

		// if our readable file contains only one character then it will be returned in int =c 
		// if not , to check the end of the stream we have a predefined constant (-1)

// we use while loop for that 

while((c=fis.read())!=-1)  // it first read the stream then check if the stream is not to equal to -1(which means having more than one character in the stream left or not)
{
fos.write(c);   // write() method required one argument 
		// and it has to be the unicode value of the first character that read ()meathod has read(abc.txt) which
		// we have stored in the int c, pass that parameter in the write() method
		// then reapeat the process until the end of stream .
		// and we come out of the loop, when stream is equal to -1.
}

// then close the channels 
fis.close();
fos.close();
}
}
*/



// simplified code:


import java.io.*;

class Channel_details
{
public static void main(String []args)throws  FileNotFoundException, IOException
{

File f = new File("F:\\ab.txt");
FileInputStream fis = new FileInputStream("abc.txt");
FileOutputStream fos = new FileOutputStream("xyz.txt");
int c;
while((c=fis.read())!=-1)   //read the data,store the unicode, check whether the stream is ended or not if not write the file
{				// reapeating the loop for how many times , for the no. of character present in the stream or file

System.out.println(c+"   "+(char)c);  // performed type cast changed int into char
					// reading data line by line

fos.write(c);
}
fis.close();
fos.close();

}
}

/*output:

F:\java by dragon\java programms\java.io package>javac Simple_byte_channel.java


F:\java by dragon\java programms\java.io package>java Channel_details
112   p
97   a
114   r
100   d
101   e
101   e
112   p
44   ,
32
116   t
104   h
105   i
115   s
32
102   f
105   i
108   l
101   e
32
105   i
115   s
32
102   f
111   o
114   r
32
101   e
120   x
112   p
101   e
114   r
105   i
109   m
101   e
110   n
116   t
46   .
13
10

116   t
111   o
32
117   u
115   s
101   e
32
116   t
104   h
105   i
115   s
32
102   f
105   i
108   l
101   e
32
105   i
110   n
32
116   t
104   h
101   e
32
106   j
97   a
118   v
97   a
32
105   i
111   o
32
112   p
97   a
99   c
107   k
97   a
103   g
101   e
32
97   a
110   n
100   d
32
99   c
104   h
97   a
110   n
110   n
101   e
108   l
32
99   c
111   o
110   n
99   c
101   e
112   p
116   t
13
10

*/
















