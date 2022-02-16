// Interface(file1.java) vs Abstract Class(file2.java) vs Normal Class(file3.java)
// file no.2 ---> abstract class
// Message interface present in the decleration package, import that package
  
  


package com.dop.helper;   // package statment(has to be first statement of source file)

    import com.dop.declarations.Message;  // improting required package as well as requried class 
//(to import)    (package_name).(class_name)

public abstract class Helper implements Message

{
public void gn()
{
System.out.println("helper class good night");
}
}



// have to declare this class as abstract class because 
// not all interface methods implementations were written.