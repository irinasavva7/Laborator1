public class H extends G {
    protected String h;

    public H (){
        h = "hh";
    }

    public H (String h, String g, String f, String e, String d, String c, String b, String a, X x){
        super(g,f,e,d,c,b,a,x);
        this.h = h;

    }

    @Override
    public String toString() {
        return "H{" +
                "h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x.toString() +
                '}';
    }
}
