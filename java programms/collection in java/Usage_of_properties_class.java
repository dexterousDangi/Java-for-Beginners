// usage of properties class in collection 

import java.util.*;
import java.io.*;
class Usage_of_properties_class
{
public static void main (String [] args) throws Exception
{
// read the location of the properties file

FileInputStream fis= new FileInputStream("abc.properties");  // provide the location of the file, in this case file exists in same package/folder.

// load the properites ---> using properties class load() method

Properties p = new Properties();
p.load(fis);

// get the data from properties file

String user= p.getProperty("Username");
String pswd= p.getProperty("Password");
String cst= p.getProperty("Cost");

// use the data --> here we are using it for no specific purpose but you can use these in project level for greater goods.

System.out.println(user);
System.out.println(pswd);
System.out.println(cst);

String [] str = new String[3];
str[0]=user;
str[1]=pswd;
str[2]=cst;

for(String j : str)
System.out.println(j);
}
}

/*output:
F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Usage_of_properties_class.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Usage_of_properties_class

system
manager
1113445;
system
manager
1113445;

*/