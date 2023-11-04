public class method2{
    public static double money (double p, double r, double t){
        return Math.pow(1+r,t)*p;
    }
    public static void main(String args[]){
        double x=500000;
        double y=0.18;
        double z=3;
        double amount=money(x,y,z);
        System.out.println(+amount);
    }
}