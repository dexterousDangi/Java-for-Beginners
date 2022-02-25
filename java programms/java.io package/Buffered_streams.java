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



BufferedReader br = new BufferedReader(new FileReader("abc.txt"));


BufferedWriter bw = new BufferedWriter(new FileWriter("alpha.txt"));


String str2;
                  // to read the data line by line we use "readLine()" method, whose return type is string.

while((str2=br.readLine())!=null)	// to check if we reached the end of the data we use "null" keyword
{
System.out.println(str2);
bw.write(str2);   // write() method can write the data in single line only
}

br.close();
bw.close();

}
}


/*output:

F:\java by dragon\java programms\java.io package>javac Buffered_streams.java

F:\java by dragon\java programms\java.io package>java Buffered_streams

// readed line by line not character by character.

pardeep, this file is
 for experiment.
to use this file in
the java io package and channel concept
*/