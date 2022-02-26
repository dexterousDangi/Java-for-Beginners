// class to used in serialization 
// because we need atleast one java class/object to perform serialization
//Serialization is the conversion of the state of an object into a byte stream

// we use "transient" modifier to prevent serialization  of a particular variable, in the response of that variable null will printed
// "transient" modifier is only applicable for variables only.

import java.io.*;

class Emp implements Serializable
{
	// instance variable 
int eid; 
transient String ename;
Emp(int eid, String ename)   // local variables
{
             // conversion of local to instance

this.eid=eid;
this.ename=ename;
}
}

// the class we want to serialize that class must implements serializable interface.
// not that class which perform serialization.