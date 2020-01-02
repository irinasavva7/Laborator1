public class X {
    private String x;

    public X(){
        x = "blbl";
    }

    public X(String x){
        this.x = x;
    }

    @Override
    public String toString() {
        return "'" + x + '\'';
    }
}