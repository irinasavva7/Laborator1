public class C extends B {
    protected String c;
    protected X x= new X("c555");

    public C () {
        c = "cc";
    }

    public C (String c, String b, String a, X x){
        super(b,a,x);
        this.c = c;
    }

    @Override
    public String toString() {
        return "C{" +
                "c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x.toString() +
                '}';
    }
}