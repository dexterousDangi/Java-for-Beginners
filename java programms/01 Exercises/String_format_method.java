// hacker rank program

// next() : this method read the input till it encounter a space, and leave the cursor in the same line after reading input
// nextLine(): read the input including spaces and shift the cursor in the next line after reading the reading the input.
//format(): method used in place of print() and println() to display the output in the formated way

// %[alignment][width] s---> for string
// %[alignment][width] d ---> for integer
// %[alignment][width][.decimal] f ---> for floating point



import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                 float ff = sc.nextFloat();
        System.out.printf("%-15s\n",s1);
	System.out.printf("Integer data : %4d\n", x);
	System.out.printf("double data type : %5.3f\n", ff);
                   }
            System.out.println("================================");

    }
}
