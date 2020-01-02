public class Main {
    public static void main(String[] args) {

        X x = new X("xxxxxxxxxxx");

        A a = new A("aaaaa", new X("ppp"));
        System.out.println(a);

        B b = new B("b", "a", new X("222222"));
        System.out.println(b);

        C c = new C("cccccc", "bbbbbbb", "aaaaaa", new X("3333333")) ;
        System.out.println(c);

        D d = new D("ddddd", "haha", "bbbbb","aaaaa", new X("44444"));
        System.out.println(d);

        E e = new E();
        System.out.println(e);

        F f = new F();
        System.out.println(f);

        G g = new G();
        System.out.println(g);

        H h = new H();
        System.out.println(h);

        I i = new I();
        System.out.println(i);

        J j = new J();
        System.out.println(j);
    }
}