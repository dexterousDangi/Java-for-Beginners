//serialization and deserialization: these are the process of transferring data between different layered architechture.
//these are marker interface like the clonable interface (means empty interfaces having no method inside ), capabilities are provided by jvm
// to perform operations.
 
//Serialization is the conversion of the state of an object into a byte stream

// serialization means converting our java objects into file format data (say .txt) , because that is suported by the network we established between two 
// java object. and we can't simply transfer the java object over the network(because as said earlier, it only support file format data)

// for serialization you must implement the serializable interface
// to perform serialization, we need atleast one java object.

//The Serializable interface is present in java.io package. It is a marker interface.

/*In Java, we create several objects that live and die
 accordingly, and every object will certainly die when the
 JVM dies. ... Well, serialization allows us to convert the
 state of an object into a byte stream, which then can be
 saved into a file on the local disk or sent over the 
 network to any other machine.*/

import java.io.*;
class Serialization_test
{
public static void main(String []args) throws FileNotFoundException, IOException
{

  // create the object of the class which we want to serialize

//Emp e = new Emp(13,"dangi");

	// now create the object of fileOUtputStream which write the file into byte stream
		// also create the stream/channel

//FileOutputStream fos = new FileOutputStream("abc.txt");

			// .txt is a file format accepted by the network.

		// create the object of ObjectOutputStream class which write required object to the corresponding file(abc.txt)

//ObjectOutputStream os = new ObjectOutputStream(fos);   //ojectoutputstream is also based on the fileoutputstream ,like the buffered streams

//os.writeObject(e);  //this method is present in the objectoutputstream class to write the object(e) which is in byte---> to fos --> and(fos) writing it to abc.txt

/*
Emp e = new Emp(13,"dangi");
FileOutputStream fos = new FileOutputStream("abc.txt");
ObjectOutputStream os = new ObjectOutputStream(fos);
os.writeObject(e); 
*/

// there can be a single line of code for the above four line of code.^

  new ObjectOutputStream(new FileOutputStream("abc.txt")).writeObject( new Emp(13,"dangi"));


System.out.println("serialization completed");

		// we have the written the object of class emp  into abc.txt  using fileoutputstream and objectoutputstream class.
}
} 

/*output:

F:\java by dragon\java programms\java.io package\serialization>javac Serialization1.java

F:\java by dragon\java programms\java.io package\serialization>java Serialization_test

serialization completed

*/