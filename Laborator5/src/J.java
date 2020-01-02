public class J extends I{
    protected String j;

    public J(){
        j = "jj";
    }

    public J (String j, String i, String h, String g, String f, String e, String d, String c,String b, String a, X x){
        super(i,h,g,f,e,d,c,b,a,x);
        this.j = j;
    }

    @Override
    public String toString() {
        return "J{" +
                "j='" + j + '\'' +
                ", i='" + i + '\'' +
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