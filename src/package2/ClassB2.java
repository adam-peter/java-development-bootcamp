package package2;

public class ClassB2 extends ClassB {
    public void test() {
        super.publicMethod();
//      super.privateMethod();
        super.protectedMethod();
        super.packageProtectedMethod();
    }
}
