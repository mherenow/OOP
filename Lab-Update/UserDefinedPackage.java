//Package 1
package p1;

public class A {
    int x;
    int sum(int x,int y)
    {
        return x+y;
    }
    void m()
    {
        System.out.println("Printed from a Package");

    }
    
}

//Package 2 used to import package p1
package p2;
import p1.*;

public class B {
    public static void main(String[] args) {
        A obj=new A();
        obj.sum();
        System.out.println(obj.sum(4,5));
        obj.m();
    }
    
}

