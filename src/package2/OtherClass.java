package package2;

public class OtherClass {
    public void test() {
        ClassB classB = new ClassB();
        classB.publicMethod();
//      classB.privateMethod();
        classB.protectedMethod();
        classB.packageProtectedMethod();
    }
}
