//java program for calculating compound interest
//define a class name'object'
class object{//first class
     //method to calculate compound interest
    public static double money(double p,double r,double t){
        return Math.pow(1+r,t)*p;//calculate and return compound interest
    }
}
public class questionb{//second class
    public static void main(String args[]){
        //create an instance 'questionb' class
        object myobject= new object();
        //call 'money' method with specific values and store 
        double result= myobject.money(500000,0.18,3);
        System.out.println(+ result);//print result as compound interest
    }
}
