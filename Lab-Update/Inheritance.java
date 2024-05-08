class Base {
    void m() {
        System.out.println("This is parent class");
    }
}

class Derived1 extends Base {
     void n() {
        System.out.println("This is child class");
    }
}

class Derived2 extends Derived1 {
    void p(){
        System.out.println("This is another child class");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Derived1 d1 = new Derived1();
        Derived2 d2 = new Derived2();
        d1.m();
        d1.n();
        d2.p();
    }
}
