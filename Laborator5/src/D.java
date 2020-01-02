public class D extends C {
    protected String d;
    protected X x = new X("d234");

    public D () {
        d = "dd";
    }

    public D (String d, String c, String b, String a, X x){
        super(c,b,a,x);
        this.d = d;
    }


    @Override
    public String toString() {
        return "D{" +
                "d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x.toString() +
                '}';
    }
}
