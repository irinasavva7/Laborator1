public class G extends F {
    protected String g;

    public G (){
        g = "gg";
    }

    public G (String g, String f, String e, String d, String c, String b, String a, X x){
        super(f,e,d,c,b,a,x);
        this.g = g;
    }

    @Override
    public String toString() {
        return "G{" +
                "g='" + g + '\'' +
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