//java program for calculating simple interest
//define a class name 'question1'
class question1 {//first class
    //method to calculate simple interest
    public static double money(double p, double r, double t){
        return p*r*t;//calculate and return simple interest
    }
}
        public class object1{//second class
            public static void main(String args[]){
                //create an instance 'question1' class
                question1 myquestion1= new question1();
                //call 'money' method with specific values and store
                double result=myobjectex.money(100000,0.05,5);
                System.out.println("simple interest is:"+ result);//print the result
            }
        }
