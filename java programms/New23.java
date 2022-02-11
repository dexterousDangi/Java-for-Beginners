/*interfaces vs inheritance

one class can inherit one class at a time
but for interfaces it is possible to inherit multiple interfaces
*/
 
class A
{void m1(){}
}
class B extends A  
{void m2(){}                     // contains  methods
}
class C extends B // this is multi-level inheritance not multiple inheritance

{void m3(){}      // contains 3 methods
}

interface Id1
{void p1();}

interface Id2
{void p2();}

interface Id3 extends Id1,Id2   // this is multiple inheritance
{
void p3(); //contains 3 methods 
}

// classes can also implements multiple  interfaces 
// but classes can't extends multiple classes


abstract class F implements Id1,Id2

{
// override 2 methods here
// correct implementation here

}

//you must write all the implementation into class F, otherwise you have to declare 
// class F as abstract class.