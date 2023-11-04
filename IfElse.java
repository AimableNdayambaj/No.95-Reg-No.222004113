//Java Program to demonstate the use of if else-if ladder
//it is a program of categorizing from very low to high.
public class IfElse{//name of class is 'IfElse'
    public static void main(String a[]){
        int kgs=75;//valiable with value
        //if statements
        if(kgs<25){
            System.out.println("very low");
        }
        else if(kgs<=25){
            System.out.println("low");
        }
        else if(kgs<=50){
            System.out.println("medium");
        }
        else if(kgs<=70){
            System.out.println("high");
    
        }
        else{
            System.out.println("kgs are enough");
        }
    }
}