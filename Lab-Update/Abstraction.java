abstract class A {
    public void m() {
        System.out.println("This is an abstract class");
    }

    abstract public void sayhello();
}

class B extends A {
    @Override
    public void sayhello() {
        System.out.println("Hello");
    }
}

class C extends A {
    @Override
    public void sayhello() {
        System.out.println("Hello everyone");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        B obj1 = new B();
        C obj2 = new C();
        obj1.sayhello();
        obj2.sayhello();
    }
}
