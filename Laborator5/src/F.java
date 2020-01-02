public class F extends E {
    protected String f;

    public F(){
        f = "ff";
    }

    public F (String f, String e, String d, String c, String b, String a, X x){
        super(e,d,c,b,a,x);
        this.f = f;
    }

    @Override
    public String toString() {
        return "F{" +
                "f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x.toString() +
                '}';
    }
}