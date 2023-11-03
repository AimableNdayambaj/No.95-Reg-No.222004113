class object{
    public static double money(double p,double r,double t){
        return Math.pow(1+r,t)*p;
    }
}
public class questionb{
    public static void main(String args[]){
        object myobject= new object();
        double result= myobject.money(500000,0.18,3);
        System.out.println(+ result);
    }
}