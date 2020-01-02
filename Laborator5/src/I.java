public class I extends H {
    protected String i;

    public I(){
        i = "ii";
    }

    public I (String i, String h, String g, String f, String e, String d, String c,String b, String a, X x){
        super(h,g,f,e,d,c,b,a,x);
        this.i = i;
    }

    @Override
    public String toString() {
        return "I{" +
                "i='" + i + '\'' +
                ", h='" + h + '\'' +
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