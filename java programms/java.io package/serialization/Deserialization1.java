// Deserialization: process of reading the object which is in file format(binary format) 

//trasient modifier is used to prevent the serialization of a praticular variable and it will print "null" to the corresponding value

// going to need two class 
// FileInputStream.
// ObjectInputStream.

import java.io.*;
class Deserialization1
{
public static void main(String []args) throws ClassNotFoundException, IOException, FileNotFoundException
{
                                         //read the data from this file  
FileInputStream fis = new FileInputStream("abc.txt");
        
ObjectInputStream ois=new ObjectInputStream(fis);
					// want to read the data of fis object which is abc.txt file

       // ObjectInputStream class contains readObject() mehtod, which we use to read the object.
	// return type of the readObject() method is "Object class"
        // perform type cast and change it to "whose object we have serialized" , Emp class
 		// stroe these in object of Emp class

// ois.readObject();
// (Emp)ois.readObject();

Emp e = (Emp)ois.readObject();
   
    		// if the coresponding oject is retrieved that means coresponding objects imformatin are also retrieved
		// print those information, so that our application is cross checked

System.out.println("employee name    :"+e.ename+"   eid   :"+e.eid);



}
}

/*output:


F:\java by dragon\java programms\java.io package\serialization>javac Deserializa
tion1.java

F:\java by dragon\java programms\java.io package\serialization>java Deserializat
ion_test
employee name    :dangi   eid   :13

*/

/*output: when we use a "transient" modifier


F:\java by dragon\java programms\java.io package\serialization>javac Deserialization1.java

F:\java by dragon\java programms\java.io package\serialization>java Deserialization1

employee name    :null   eid   :13

*/