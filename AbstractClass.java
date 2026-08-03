abstract class Abstract_Parent {
    abstract void check(int a, int b);  // lowercase 'c'
}

class Abstract_Child extends Abstract_Parent {
    @Override
    void check(int a, int b) {
        System.out.println(a - b);
    }
}

public class AbstractClass {
    public static void main(String args[]) {
        Abstract_Child ob = new Abstract_Child();
        ob.check(20, 5);
    }
}
