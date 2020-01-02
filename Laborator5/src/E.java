public class E extends D {
    protected String e;

    public E () {
        e = "ee";
    }

    public E (String e, String d, String c,String b, String a, X x){
        super(d,c,b,a,x);
        this.e = e;
    }

    @Override
    public String toString() {
        return "E{" +
                "e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x.toString() +
                '}';
    }
}