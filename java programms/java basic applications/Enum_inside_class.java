// we can also declare the "enum" inside a class also
//ordinal() method used to know the index of particluar


class Enum_inside_class
{
enum Gmail
{
INBOX, SENT, COMPOSE, draft;
}

public static void main(String []args)
{
System.out.println(Gmail.SENT+ " " +Gmail.SENT.ordinal());

Gmail [] m = Gmail.values();
for(Gmail mm:m)
{
System.out.println(mm+" "+mm.ordinal());
}
}
}

/*output:

F:\java by dragon\java programms\java basic applications>javac Enum_inside_class.java

F:\java by dragon\java programms\java basic applications>java Enum_inside_class

SENT 1
INBOX 0
SENT 1
COMPOSE 2
draft 3

*/