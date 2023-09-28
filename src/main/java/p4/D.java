package p4;
import static p1.A.*;

import static p1.p2.B.*;

import p1.p2.B;
import p4.p5.E;
import p1.p2.p3.C;

public class D {

    public static void main(String[] args) {
        showPrint();

        System.out.println(a);
        System.out.println(bu);

        C c = new C();
        c.f1();

        E e =new E();
        System.out. println(e.mnoj( 50, 50));
    }
}
