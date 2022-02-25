// Buffered Streams: generally at project levels we use this stream only, because it
// helps us to increase the performance of the application 
// because it reads the data line by line not character by character
// it store the data in buffered memory so it don't have to hit main memory 
// every single time to read the data, it can read the data from buffered memory

// Buffered Stream: contains 4 classes

// BufferedInputStream
// BufferedOutputStream
// BufferedReader
// BufferedWriter

import java.io.*;

class Buffered_streams
{
public static void main(String []args)throws IOException,FileNotFoundException
{

// we have to ways 4 ways to create the channel


			// 2 channels to read the data

BufferedInputStream bis = new BufferedInputStream(new FileInputStream("lmn.txt"));

		//or

BufferedReader br = new BufferedReader(new FileReader("abc.txt"));



			// 2 channels to write the data

BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("deploy1.txt"));


		//or

BufferedWriter bw = new BufferedWriter(new FileWriter("deploy2.txt"));



int c;
int d;

while((c=bis.read())!=-1)
{

System.out.println(c+"---->"+(char)c);
bos.write(c);
}


while((d=br.read())!=-1)
{
System.out.println(d+"---->"+(char)d);
bw.write(d);
}

bis.close();
bos.close();
br.close();
bw.close();

}
}


/*output:

F:\java by dragon\java programms\java.io package>javac Buffered_streams.java

F:\java by dragon\java programms\java.io package>java Buffered_streams
112---->p
97---->a
114---->r
100---->d
101---->e
101---->e
112---->p
44---->,
32---->
116---->t
104---->h
105---->i
115---->s
32---->
102---->f
105---->i
108---->l
101---->e
32---->
105---->i
115---->s
32---->
102---->f
111---->o
114---->r
32---->
101---->e
120---->x
112---->p
101---->e
114---->r
105---->i
109---->m
101---->e
110---->n
116---->t
46---->.
13---->
10---->

116---->t
111---->o
32---->
117---->u
115---->s
101---->e
32---->
116---->t
104---->h
105---->i
115---->s
32---->
102---->f
105---->i
108---->l
101---->e
32---->
105---->i
110---->n
32---->
116---->t
104---->h
101---->e
32---->
106---->j
97---->a
118---->v
97---->a
32---->
105---->i
111---->o
32---->
112---->p
97---->a
99---->c
107---->k
97---->a
103---->g
101---->e
32---->
97---->a
110---->n
100---->d
32---->
99---->c
104---->h
97---->a
110---->n
110---->n
101---->e
108---->l
32---->
99---->c
111---->o
110---->n
99---->c
101---->e
112---->p
116---->t
13---->
10---->

112---->p
97---->a
114---->r
100---->d
101---->e
101---->e
112---->p
44---->,
32---->
116---->t
104---->h
105---->i
115---->s
32---->
102---->f
105---->i
108---->l
101---->e
32---->
105---->i
115---->s
32---->
102---->f
111---->o
114---->r
32---->
101---->e
120---->x
112---->p
101---->e
114---->r
105---->i
109---->m
101---->e
110---->n
116---->t
46---->.
13---->
10---->

116---->t
111---->o
32---->
117---->u
115---->s
101---->e
32---->
116---->t
104---->h
105---->i
115---->s
32---->
102---->f
105---->i
108---->l
101---->e
32---->
105---->i
110---->n
32---->
116---->t
104---->h
101---->e
32---->
106---->j
97---->a
118---->v
97---->a
32---->
105---->i
111---->o
32---->
112---->p
97---->a
99---->c
107---->k
97---->a
103---->g
101---->e
32---->
97---->a
110---->n
100---->d
32---->
99---->c
104---->h
97---->a
110---->n
110---->n
101---->e
108---->l
32---->
99---->c
111---->o
110---->n
99---->c
101---->e
112---->p
116---->t
13---->
10---->
*/