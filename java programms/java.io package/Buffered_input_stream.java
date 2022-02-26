// Buffered Streams: generally at project levels we use this stream only, because it
// helps us to increase the performance of the application 
// because it reads the data line by line not character by character
// it store the data in buffered memory so it don't have to hit main memory 
// every single time to read the data, it can read the data from buffered memory

// Buffered Stream: contains 4 classes

// BufferedInputStream: read method for this channel is read() of int return type
// BufferedOutputStream: write method for this channel is write()

// BufferedReader: read method for this channel is readLine(); and return type is string here
// BufferedWriter: write method is write(); only

import java.io.*;

class Buffered_input_stream
{
public static void main(String []args)throws IOException,FileNotFoundException
{



BufferedInputStream br = new BufferedInputStream(new FileInputStream("alpha.txt"));


BufferedOutputStream bw = new BufferedOutputStream (new FileOutputStream("dm.txt"));


int ip;
                  // to read the data line by line we use "read()" method, whose return type is interger.

while((ip=br.read())!=-1)	// to check if we reached the end of the data we use a constant "-1"
{
System.out.println(ip+"   "+(char)ip);
bw.write(ip);   // write() method can write the data in single line only

}

br.close();
bw.close();

}
}