package package1;

import package2.ClassB;

public class ClassB3 extends ClassB {
    public void test() {
        super.publicMethod();
//      super.privateMethod();
        super.protectedMethod();
//      super.packageProtectedMethod();
    }

    public static void main(String[] args) {
        new ClassB3().test();
    }
}
