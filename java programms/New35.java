// Information regarding declartion of user defined packages
/*packages are declared using "package" keyword followed by 
package name. Packages are just physical folder structure.(eg java.lang.system) 
it means that there is a java folder in that folder there is another
named lang folder in that folder system class resides. That is why it is physical 
folder structure.

syntax: package package_name;  (just it)
         package_name= reverse of domian_name and project_name and module nanme
*/
   
// for each class and interface there will be ".class" file genertated in the 
// corresponding folders. (so in this package there will be 4 .class file created)





package alpha.expert;

      // when we compile this file 
      // gong folder, tuff folder, java folder, and corejava folder will be created


class Pipe
{ 
public static void main(String []args)
{
System.out.println("first java package example");

}
}

class A {}

class B {}

interface It {}


   // to compile the application containing package there is different command that we follow:
/* commands are:
*first just compile the file using "javac file_name.java"

*secondly "javac -d . New35.java" 

you have to tell java compiler "javac" to create the 
directory structure ("-d") , place the folder in  the current
working directory ("." is used for that), you can also provide the 
user defined location where you want to create the folder/directory 
and comiple my file(file_name.java)

*now compilation is done (folders will be created in the given location(f:\java by dragon\java programm)),
* run the file using package_name (. dot)class_name
 
(: java alpha.expert.Pipe) for running you application

*/

/*output:

F:\java by dragon\java programms>javac New35.java

F:\java by dragon\java programms>javac -d . New35.java

F:\java by dragon\java programms>java alpha.expert.Pipe

first java package example
 
*/

