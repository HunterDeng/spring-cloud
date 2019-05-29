package md.configservice;

/**
 * @author MD@do1.com
 * @date 2019/5/24 9:46
 * create by a new bird!
 */
public class A {
    static {
        System.out.println("A");
    }

    public static final String S = "A String";
}

class B {
    static {
        System.out.println("B");
    }

    public B() {
        System.out.println("B构造器");
        System.out.println(a);
    }

    public static String S = "B String";
    public static A a;
}

class C {
    static {
        System.out.println("C");
    }

    public static void main(String[] args) {
        System.out.println(A.S);
        System.out.println(B.S);
        final int i=0;
    }
}
