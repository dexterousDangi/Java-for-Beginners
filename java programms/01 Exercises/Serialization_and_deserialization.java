// java.io.package exercises

import java.io.*;
class Serialization_and_deserialization 
{
public static void main(String []args) throws IOException, FileNotFoundException
{   
        // byte stream channel    
 
String rpath ="F:\\java by dragon\\Java-for-Beginners\\java programms\\01 Exercises\\abc.txt";
String wpath ="F:\\java by dragon\\Java-for-Beginners\\java programms\\01 Exercises\\xyz.txt";

FileInputStream fis = new FileInputStream(rpath);  // channel created , and file was specified for reading the data

FileOutputStream fos = new FileOutputStream(wpath); // channel created, and file specified where to write the data.

int c ;
// c= fis.read();   read() method return type is integer type , this method returns unicode value of the character.


while  ((c=fis.read())!=-1)
{
fos.write(c);
}
fis.close();
fos.close();
System.out.println("process finished");

}
}