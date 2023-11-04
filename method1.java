public class method1{
public static double money(double p, double r, double t){
    return p*r*t;
}public static void main(String args[]){
double x=100000;
double y=0.05;
double z=5;
double result= money(x,y,z);
System.out.println(+result);
}
}