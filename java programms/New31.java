// main method of java is run by jvm
// total 5 type(public,static , strictfp, final,synchronized) of modifiers
// are allowed/accepted by java out of which 2 are mandatory(public, static)



class Main
{
public static final strictfp synchronized void main(/*String[] can be written as --->*/String... args)  // comments are allowed everywhere in java(i'm loving java)
{
System.out.println("main method elabortions");

System.out.println("String [] can be written as(String...)");

System.out.println("(String...) ending with three dots in particular");
}
}

// for the first time received the warning in java application, feeling rewarded
/*output=

F:\java by dragon\java programms>javac New31.java
New31.java:9: warning: [strictfp] as of release 17, all floating-point expressio
ns are evaluated strictly and 'strictfp' is not required
public static final strictfp synchronized void main(String... args)
                                               ^
1 warning

F:\java by dragon\java programms>java Main
main method elabortions
String [] can be written as(String...)
(String...) ending with three dots in particular
*/
