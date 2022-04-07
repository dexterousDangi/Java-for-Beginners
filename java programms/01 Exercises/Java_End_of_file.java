import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_End_of_file {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i =1;
        while (scan.hasNext()) {
            
        String str = scan.nextLine();
        
            System.out.println(i + " " + str);
            i++;
        }
    scan.close();
    }