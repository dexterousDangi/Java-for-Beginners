// integer value before 127 and equals to 127 are stored in pool memory or say cash memory.
// if two integer object are created with value less then 127 or equals to 127 then there will
//be no seperate memory objects will be created rather both object will points to same memory location instead.
 
// and integer after 127 value will be created seperately and points to differnt memory location while they have the same element value

class Integer_before_127_and_after_127 
{

 public static void main(String[] args) 
{

 Integer i1= 128;

 Integer i2= 128;

 System.out.println(i1.equals(i2));
 
 System.out.println(i1==i2);
  
  

 Integer ii= 127;
 
 Integer iii= 127;
   
  
 System.out.println(ii.equals(iii));
 
 System.out.println(ii==iii);
    

}

}

/*output:

true
false
true
true
*/