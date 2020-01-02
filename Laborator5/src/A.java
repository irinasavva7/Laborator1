public class A {
    protected String a;
    public X x = new X("123");

    public A () {
        a = "aa";
        x.equals("xx");
    }

    public A(String a, X x){
        this.a = a;
        this.x = x;

    }

    @Override
    public String toString() {
        return String.format("A{a='%s', x=%s}", a, x.toString());
    }
}