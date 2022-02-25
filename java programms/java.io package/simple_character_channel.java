// character oriented channel


import java.io.*;

class Channel_char_oriented
{

public static void main (String [] args) throws FileNotFoundException, IOException
{

FileReader fr = new FileReader ("abc.txt");  // return type is byte  same as the fileInputStream method
FileWriter fw = new FileWriter("lmn.txt");

int c;

while((c=fr.read())!=-1)
{
fw.write(c);
}
  //close the channels now

fr.close();
fw.close();

}
}